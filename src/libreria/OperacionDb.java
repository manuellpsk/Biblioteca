package libreria;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.Oracleconx;

public class OperacionDb {

    private static int contador = 0;
    private static String query = null;
    private static String query2 = null;
    private static String query3 = null;
    private static String query4 = null;
    private static Libros libro;
    private static LibroCompleto libroc;
    private static Autores autor;
    private static Detalle detalle;
    private static Distribuidores distribuidor;
    private static Venta venta;
    private static Compra compra;
    Oracleconx c = new Oracleconx();
    private static Connection cn = null;
    private static ArrayList<Libros> alist = new ArrayList<Libros>();
    private static ArrayList<Autores> aulist = new ArrayList<Autores>();
    private static ArrayList<Detalle> detlist = new ArrayList<Detalle>();
    private static ArrayList<Distribuidores> distlist = new ArrayList<Distribuidores>();
    private static ArrayList<Venta> vlist = new ArrayList<Venta>();
    private static ArrayList<Compra> clist = new ArrayList<Compra>();

    public void setAlist() {
        alist.clear();
    }

    public void setAulist() {
        aulist.clear();
    }

    public void setDetlist() {
        detlist.clear();
    }

    public void setDistlist() {
        distlist.clear();
    }

    public void setVlist() {
        vlist.clear();
    }

    private static String fechaTodma(String fecha) {

        /*  fecha.subString(0,4)+*/
        return fecha.substring(8, 10) + String.valueOf(fecha.charAt(7)) + fecha.substring(5, 7) + String.valueOf(fecha.charAt(4)) + fecha.substring(0, 4);
    }

    /*30-05-1977*/
    private static String fechaTomda(String fecha) {

        /*  fecha.subString(0,4)+*/
        return fecha.substring(3, 5) + String.valueOf(fecha.charAt(2)) + fecha.substring(0, 2) + String.valueOf(fecha.charAt(5)) + fecha.substring(6, 10);
    }

    private static int contarRs(ResultSet rs) {

        int cant = 0;
        try {
            rs.last();
            cant = rs.getRow();
        } catch (SQLException ex) {
            Logger.getLogger(OperacionDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cant;
    }

    /* querys libros*/
    public ArrayList<Libros> mostrarTodo() {

        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st;
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "SELECT L.SERIE,ISBN,TITULO,PAGINAS,PRECIO,AÑO,ES.NOMBRE AS ESTADO,ED.NOMBRE AS EDITORIAL FROM BIBLIOTECA.LIBRO L INNER JOIN BIBLIOTECA.ESTADO ES ON L.COD_ESTADO=ES.CODIGO\n"
                    + "INNER JOIN BIBLIOTECA.EDITORIAL ED ON L.COD_EDI=ED.CODIGO";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                libro = new Libros(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5),
                        fechaTodma(rs.getString(6).substring(0, 10)), rs.getString(7), rs.getString(8));
                alist.add(libro);
            }
            if (alist.isEmpty()) {
                System.out.println("No hay registros");
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb");;
        }
        return alist;
    }

    public LibroCompleto buscarLibro(String numserie) {

        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Statement st2 = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "SELECT L.SERIE,ISBN,TITULO,PAGINAS,PRECIO,AÑO,ES.NOMBRE AS ESTADO,ED.NOMBRE AS EDITORIAL FROM BIBLIOTECA.LIBRO L INNER JOIN BIBLIOTECA.ESTADO ES ON L.COD_ESTADO=ES.CODIGO\n"
                    + "INNER JOIN BIBLIOTECA.EDITORIAL ED ON L.COD_EDI=ED.CODIGO WHERE L.SERIE=" + numserie;
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {

                String[] categorias = null;
                String[] idiomas = null;
                String[] autores = null;
                query2 = "SELECT NOMBRE FROM BIBLIOTECA.CATEGORIA_LIBRO CL INNER JOIN BIBLIOTECA.CATEGORIA CA ON CL.CODIGO=CA.CODIGO WHERE SERIE=" + rs.getInt(1);
                ResultSet rs2 = st2.executeQuery(query2);
                categorias = new String[contarRs(rs2)];
                contador = 0;
                rs2.beforeFirst();
                while (rs2.next()) {
                    String r = rs2.getString(1);
                    categorias[contador] = r;
                    contador++;
                }
                contador = 0;
                query2 = "SELECT NOMBRE FROM BIBLIOTECA.IDIOMA_LIBRO CL INNER JOIN BIBLIOTECA.IDIOMA CA ON CL.CODIGO=CA.CODIGO WHERE SERIE=" + rs.getInt(1);
                rs2 = st2.executeQuery(query2);
                idiomas = new String[contarRs(rs2)];
                rs2.beforeFirst();
                while (rs2.next()) {
                    String r = rs2.getString(1);
                    idiomas[contador] = r;
                    contador++;
                }
                contador = 0;
                query2 = "SELECT (NOMBRE||\' \'||APE_PATERNO||\' \'||APE_MATERNO) FROM BIBLIOTECA.AUTOR_LIBRO CL INNER JOIN BIBLIOTECA.AUTOR CA ON CL.COD_AUTOR=CA.CODIGO WHERE SERIE=" + rs.getInt(1);
                rs2 = st2.executeQuery(query2);
                autores = new String[contarRs(rs2)];
                rs2.beforeFirst();
                while (rs2.next()) {
                    String r = rs2.getString(1);
                    autores[contador] = r;
                    contador++;
                }
                contador = 0;
                libroc = new LibroCompleto(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5),
                        fechaTodma(rs.getString(6).substring(0, 10)), rs.getString(7), rs.getString(8), categorias, idiomas, autores);
                return libroc;
            } else {
                System.out.println("No hay registros para mostrar");
            }

        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb SQL");
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Error OperacionesDb-No cerro connx");
            }
        }
        return null;
    }

    public boolean agregarLibro(LibroCompleto libroc) {

        boolean estado = false;
        try {

            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Statement st2 = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "SELECT * FROM BIBLIOTECA.CATEGORIA_LIST";
            query2 = "SELECT * FROM BIBLIOTECA.IDIOMA_LIST";
            query3 = "SELECT (NOMBRE||' '||APE_PATERNO||' '||APE_MATERNO) FROM BIBLIOTECA.AUTOR";
            ResultSet rs1 = st.executeQuery(query);
            contador = 0;
            String[] categorias = new String[contarRs(rs1)];
            rs1.beforeFirst();
            while (rs1.next()) {
                String r = rs1.getString(1);
                categorias[contador] = r;
                contador++;
            }
            for (String x : categorias) {
                System.out.println(x);
            }
            contador = 0;
            ResultSet rs2 = st.executeQuery(query2);
            String[] idiomas = new String[contarRs(rs2)];
            rs2.beforeFirst();
            while (rs2.next()) {
                String r = rs2.getString(1);
                idiomas[contador] = r;
                contador++;
            }
            for (String x : idiomas) {
                System.out.println(x);
            }
            contador = 0;
            ResultSet rs3 = st.executeQuery(query3);
            String[] autores = new String[contarRs(rs3)];
            rs3.beforeFirst();
            while (rs3.next()) {
                String r = rs3.getString(1);
                autores[contador] = r;
                contador++;
            }
            for (String x : autores) {
                System.out.println(x);
            }
            contador = 0;
            System.out.println("CREO LISTAS DE DETALLES");
            for (String x : libroc.getCategorias()) {
                System.out.println(x);
            }
            for (String x : libroc.getIdiomas()) {
                System.out.println(x);
            }
            for (String x : libroc.getAutores()) {
                System.out.println(x);
            }
            if (categoriaex(libroc.getCategorias(), categorias) && idiomasex(libroc.getIdiomas(), idiomas) && autoresex(libroc.getAutores(), autores)) {

                System.out.println("paso listo para agregar");
                query = "INSERT INTO BIBLIOTECA.LIBRO VALUES(" + libroc.getSerie() + "," + libroc.getCodisbn() + ",'" + libroc.getTitulo() + "'," + libroc.getNumpag()
                        + "," + libroc.getPrecio() + ",'" + libroc.getAño() + "',(SELECT CODIGO FROM BIBLIOTECA.ESTADO WHERE NOMBRE='" + libroc.getEstado() + "'),("
                        + "SELECT CODIGO FROM BIBLIOTECA.EDITORIAL WHERE NOMBRE='" + libroc.getEditorial() + "'))";
                System.out.println(query);
                int f = st2.executeUpdate(query);
                if (f != 1) {
                    System.out.println("no inserto");
                } else {
                    System.out.println("Ingreso LIBRO correcto");
                    for (int i = 0; i < libroc.getCategorias().length; i++) {

                        query2 = "INSERT INTO BIBLIOTECA.CATEGORIA_LIBRO VALUES(BIBLIOTECA.SQ_CATEGORIA_LIBRO_ID.NEXTVAL," + libroc.getSerie() + ",(SELECT CODIGO FROM BIBLIOTECA.CATEGORIA WHERE"
                                + " NOMBRE='" + libroc.getCategorias()[i] + "'))";
                        System.out.println(query2);
                        st2.executeUpdate(query2);
                    }
                    System.out.println("ingreso categorias");
                    for (int i = 0; i < libroc.getIdiomas().length; i++) {

                        query2 = "INSERT INTO BIBLIOTECA.IDIOMA_LIBRO VALUES(BIBLIOTECA.SQ_IDIOMA_LIBRO_ID.NEXTVAL," + libroc.getSerie() + ",(SELECT CODIGO FROM BIBLIOTECA.IDIOMA WHERE"
                                + " NOMBRE='" + libroc.getIdiomas()[i] + "'))";
                        System.out.println(query2);
                        st2.executeUpdate(query2);
                    }
                    System.out.println("ingreso idiomas");
                    for (int i = 0; i < libroc.getAutores().length; i++) {

                        query2 = "INSERT INTO BIBLIOTECA.AUTOR_LIBRO(ID,SERIE,COD_AUTOR) VALUES(BIBLIOTECA.SQ_AUTOR_LIBRO_ID.NEXTVAL," + libroc.getSerie() + ",(SELECT CODIGO FROM BIBLIOTECA.VW_AUTORES_PER_CODIGO WHERE"
                                + " NOMBREC='" + libroc.getAutores()[i] + "'))";
                        System.out.println(query2);
                        st2.executeUpdate(query2);
                    }
                    System.out.println("ingreso autores");
                    estado = true;
                }

            } else {
                System.out.println("Categorias,Idiomas o autores no coinciden");
            }
        } catch (SQLException ex) {
            System.out.println("Error en OperacionDB");
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Error en OperacionDB-NO CERRO CONX");
            }
        }

        return estado;
    }

    public boolean modificarLibro(LibroCompleto libroC){
    
        boolean estado=false;
        Oracleconx con = c.conectar();
        cn = con.getConexion();
        OperacionDb opdb=new OperacionDb();
        if(opdb.eliminarLibro(libroC.getSerie())){
        
            System.out.println("Elimino crr");
            if(opdb.agregarLibro(libroC)){
            System.out.println("Modifico correctamente");
            estado=true;
            }else{
                System.out.println("No modifico");
            }
        }
        else{
            System.out.println("no crr");
        }
        
        
        return estado;
    }
    public boolean eliminarLibro(int serie) {

        boolean estado = false;
        try {

            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement();
            System.out.println("entre try");
            
                query = "DELETE FROM BIBLIOTECA.CATEGORIA_LIBRO WHERE SERIE="+serie;
                System.out.println(query);
                int asd=st.executeUpdate(query);
                if(asd<1){
                    System.out.println("No elimino categria_libro");
                }else{
                    System.out.println("Elimino categoria_libro");
                }
            
            
                
                query = "DELETE FROM BIBLIOTECA.IDIOMA_LIBRO WHERE SERIE="+serie;
                System.out.println(query);
                asd=st.executeUpdate(query);
                if(asd<1){
                    System.out.println("No elimino idioma_libro");
                }else{
                    System.out.println("Elimino idioma_libro");
                }
            
                            
                query = "DELETE FROM BIBLIOTECA.AUTOR_LIBRO WHERE SERIE="+serie;
                System.out.println(query);
                asd=st.executeUpdate(query);
                if(asd!=1){
                    System.out.println("No elimino autor_libro");
                }else{
                    System.out.println("Elimino autor_libro");
                }
            
            query = "DELETE FROM BIBLIOTECA.LIBRO WHERE SERIE=" +serie;
            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {
                System.out.println("no elimino libro");
            } else {
                System.out.println("elimino libro corrrectamente");
                estado = true;
            }
            
        } catch (SQLException ex) {
            System.out.println("Ocurrio error en OperacionDb al eliminar libro");
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar conex en eliminarlibro");
            }
        }

        return estado;
    }

    /*querys autores*/

    public ArrayList<Autores> mostrarTodoaut() {

        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st;
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "SELECT * FROM BIBLIOTECA.AUTOR";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                autor = new Autores(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3), rs.getString(4));
                aulist.add(autor);
            }
            if (aulist.isEmpty()) {
                System.out.println("No hay registros");
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb");;
        }
        return aulist;
    }

    public Autores buscarAutor(String codaut) {

        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "SELECT * FROM BIBLIOTECA.AUTOR WHERE CODIGO=" + codaut + "";
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                autor = new Autores(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3), rs.getString(4));

            } else {
                System.out.println("No hay registros para mostrar");
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb SQL");
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
                System.out.println("No cerro conx BUSCAR ibro operaciondb");
            }
        }
        return autor;
    }

    public boolean modificarAutor(Autores a) {

        boolean estado = false;
        try {

            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement();
            query = "UPDATE BIBLIOTECA.AUTOR SET NOMBRE='" + a.getNombre() + "',APE_PATERNO='" + a.getApp() + "',APE_MATERNO='" + a.getApm() + "' "
                    + "WHERE CODIGO=" + a.getCodaut();
            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {
                System.out.println("no modifico");
            } else {
                System.out.println("modifico corrrectamente");
                estado = true;
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en OperacionDb");
        }finally{
            try {
                cn.close();
            } catch (SQLException ex) {
                System.out.println("Error cerrar conx OperacionDb-modificar-autor");
            }
        }

        return estado;
    }

    public boolean agregarAutor(Autores a) {

        boolean estado = false;
        try {
            if (a.getNombre().isEmpty()) {
                a.setNombre("null");
            }
            if (a.getApm().isEmpty()) {
                a.setApm("null");
            }
            if (a.getApp().isEmpty()) {
                a.setApp("null");
            }
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "INSERT INTO BIBLIOTECA.AUTOR VALUES(BIBLIOTECA.SQ_AUTOR_ID.NEXTVAL,'" + a.getNombre() + "','" + a.getApp()
                    + "','" + a.getApm() + "')";
            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {
                System.out.println("no inserto");
            } else {
                System.out.println("Ingreso correcto");
                estado = true;
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionDb");
        }

        return estado;
    }

    public boolean eliminarAutor(String codaut) {

        boolean estado = false;
        try {

            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement();
            query = "DELETE FROM BIBLIOTECA.AUTOR WHERE CODIGO=" + codaut;
            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {
                System.out.println("no elimino");
            } else {
                System.out.println("elimino corrrectamente");
                estado = true;
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("EL AUTOR FORMA PARTE DE UN REGISTRO, no se puede eliminar");
        }

        return estado;
    }

    public ArrayList<Detalle> mostrarTododet(String table) {

        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st;
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "SELECT * FROM BIBLIOTECA." + table.toUpperCase();
            ResultSet rs = st.executeQuery(query);
            System.out.println(query);
            while (rs.next()) {
                detalle = new Detalle(rs.getInt(1), rs.getString(2));
                detlist.add(detalle);
            }
            if (detlist.isEmpty()) {
                System.out.println("No hay registros");
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb");;
        }
        return detlist;
    }

    public ArrayList<Venta> mostrarTodoVent() {

        vlist.clear();
        try {
            setVlist();
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st;
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "SELECT * FROM LIBRERIABETA.VENTA";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                venta = new Venta(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getInt(5));
                vlist.add(venta);
            }
            if (vlist.isEmpty()) {
                System.out.println("No hay registros");
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb");;
        }
        return vlist;
    }

    public Detalle buscarDetalle(String table, String cod) {

        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "SELECT * FROM BIBLIOTECA." + table.toUpperCase() + " WHERE CODIGO="+cod;
            System.out.println(query);
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                detalle = new Detalle(Integer.parseInt(rs.getString(1)), rs.getString(2));

            } else {
                System.out.println("No hay registros para mostrar");
                return null;
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb SQL");
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
                System.out.println("No cerro conx en buscar detalle.Operaciondb");
            }
        }
        return detalle;
    }

    public boolean modificarDetalle(String table, Detalle d) {

        boolean estado = false;
        try {

            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement();
            query = "UPDATE BIBLIOTECA." + table.toUpperCase() + " SET NOMBRE='" + d.getNombre() + "'"
                    + " WHERE CODIGO=" + d.getCodigo();
            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {
                System.out.println("no modifico");
            } else {
                System.out.println("modifico corrrectamente");
                estado = true;
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionDb");
        }
        return estado;
    }

    public boolean modificarVenta(Venta v) {

        boolean estado = false;
        try {

            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement();
            query = "UPDATE LIBRERIABETA.VENTA SET RUTT=" + v.getRutt() + ", RUTC=" + v.getRutc() + ", FECHA='" + v.getFecha() + "', CODTP=" + v.getCodtp()
                    + " WHERE FOLIOV=" + v.getFoliov();
            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {
                System.out.println("no modifico");
            } else {
                System.out.println("modifico corrrectamente");
                estado = true;
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionDb");
        }
        return estado;
    }

    public boolean agregarDetalle(String table, Detalle d) {

        boolean estado = false;
        try {
            if (d.getNombre().isEmpty()) {
                d.setNombre("null");
            }
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "INSERT INTO BIBLIOTECA." + table.toUpperCase() + " VALUES(BIBLIOTECA.SQ_"+table.toUpperCase()+"_ID.NEXTVAL,'" + d.getNombre() + "')";
            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {
                System.out.println("no inserto");
            } else {
                System.out.println("Ingreso correcto");
                estado = true;
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionDb");
        }
        return estado;
    }

    public boolean agregarVenta(Venta v) {

        boolean estado = false;
        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "INSERT INTO LIBRERIABETA.VENTA VALUES(" + v.getFoliov() + "," + v.getRutt() + "," + v.getRutc() + ",'" + v.getFecha() + "'," + v.getCodtp() + ")";
            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {
                System.out.println("no inserto");
            } else {
                System.out.println("Ingreso correcto");
                estado = true;
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionDb");
        }
        return estado;
    }

    public boolean eliminarDetalle(String table, String codigo) {

        boolean estado = false;
        try {

            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement();
            query = "DELETE FROM BIBLIOTECA." + table.toUpperCase() + " WHERE CODIGO=" + codigo;
            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {
                System.out.println("no elimino");
            } else {
                System.out.println("elimino corrrectamente");
                estado = true;
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionDb");
        }

        return estado;
    }

    public boolean eliminarVenta(String foliov) {

        boolean estado = false;
        try {

            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement();
            query = "DELETE FROM LIBRERIABETA.VENTA WHERE FOLIOV=" + foliov;
            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {
                System.out.println("no elimino");
            } else {
                System.out.println("elimino corrrectamente");
                estado = true;
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionDb");
        }

        return estado;
    }

    public Distribuidores buscarDist(String rutd) {

        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "SELECT * FROM BIBLIOTECA.DISTRIBUIDOR WHERE RUT_DIS=" +rutd;
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                distribuidor = new Distribuidores(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
                        rs.getString(5),rs.getString(6), rs.getInt(7),rs.getInt(8));
            } else {
                System.out.println("No hay registros para mostrar");
                cn.close();
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb SQL");
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(OperacionDb.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return distribuidor;
    }

    public boolean modificarDist(Distribuidores d) {

        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "UPDATE BIBLIOTECA.DISTRIBUIDOR SET NOMBRE='" + d.getNombre() + "',CALLE='" + d.getCalle()+ "',FONO=" + d.getFono()+ ",AÑO_CONTRATO=" + d.getAño() + ","
                    + "PAIS='" + d.getPais()+ "',COMUNA='" + d.getComuna()+"',NUMERO="+d.getNumcalle() +" WHERE RUT_DIS=" + d.getRutd();
            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {

                System.out.println("no modifico");
            } else {
                System.out.println("moficacion correcta");
                return true;
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb SQL");
        }
        return false;
    }

    public boolean eliminarDist(String rutd) {

        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "DELETE FROM BIBLIOTECA.DISTRIBUIDOR WHERE RUT_DIS=" + rutd;
            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {

                System.out.println("no ELIMINO");
            } else {
                System.out.println("ELIMINACION CORRECTA");
                return true;
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb SQL");
        }
        return false;
    }

    public boolean agregarDist(Distribuidores d) {

        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "INSERT INTO BIBLIOTECA.DISTRIBUIDOR VALUES(" + d.getRutd() + ",'" + d.getNombre() + "','" + d.getCalle()
                    + "'," + d.getNumcalle() + ",'" + d.getComuna()+ "'"
                    + ",'" + d.getPais()+ "'," + d.getFono()+ ","+d.getAño()+")";

            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {

                System.out.println("no agrego");
            } else {
                System.out.println("agregacion CORRECTA");
                return true;
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb SQL");
        }
        return false;
    }

    public ArrayList<Distribuidores> mostrarTodoDist() {

        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st;
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "SELECT * FROM BIBLIOTECA.DISTRIBUIDOR";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                distribuidor = new Distribuidores(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
                        rs.getString(5),rs.getString(6), rs.getInt(7),rs.getInt(8));
                distlist.add(distribuidor);
            }
            if (distlist.isEmpty()) {
                System.out.println("No hay registros");
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb");;
        }
        return distlist;
    }

    public Venta buscarVenta(String foliov) {

        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "SELECT * FROM LIBRERIABETA.VENTA WHERE FOLIOV=" + foliov + "";
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                venta = new Venta(rs.getInt(1), rs.getInt(2), rs.getInt(3),
                        fechaTodma(rs.getString(4).substring(0, 10)), rs.getInt(5));
            } else {
                System.out.println("No hay registros para mostrar");
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb SQL");
        }

        return venta;
    }

    public Compra buscarCompra(String folioc) {

        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "SELECT * FROM LIBRERIABETA.COMPRA WHERE FOLIOC=" + folioc + "";
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                compra = new Compra(rs.getInt(1), rs.getInt(2), fechaTodma(rs.getString(3).substring(0, 10)), rs.getInt(4));
            } else {
                System.out.println("No hay registros para mostrar");
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb SQL");
        }

        return compra;
    }

    public ArrayList<Compra> mostrarTodoCompra() {

        clist.clear();
        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st;
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "SELECT * FROM LIBRERIABETA.COMPRA";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                compra = new Compra(rs.getInt(1), rs.getInt(2), fechaTodma(rs.getString(3).substring(0, 10)), rs.getInt(4));
                clist.add(compra);
            }
            if (clist.isEmpty()) {
                System.out.println("No hay registros");
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb");;
        }
        return clist;
    }

    public boolean agregarCompra(Compra co) {

        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "INSERT INTO LIBRERIABETA.COMPRA VALUES(" + co.getFolioc() + "," + co.getRutd() + ",'" + co.getFecha()
                    + "'," + co.getCodtp() + ")";

            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {

                System.out.println("NO INGRESO");
            } else {
                System.out.println("INGRESO CORRECTO");
                cn.close();
                return true;
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb SQL");
        }
        return false;
    }

    public boolean eliminarCompra(String folioc) {

        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "DELETE FROM LIBRERIABETA.COMPRA WHERE FOLIOC=" + folioc;
            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {

                System.out.println("no ELIMINO");
            } else {
                System.out.println("ELIMINACION CORRECTA");
                cn.close();
                return true;
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb SQL");
        }
        return false;
    }

    public boolean modificarCompra(Compra co) {

        try {
            Oracleconx con = c.conectar();
            cn = con.getConexion();
            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            query = "UPDATE LIBRERIABETA.COMPRA SET RUTD=" + co.getRutd() + ",FECHA='" + co.getFecha() + "',CODTP=" + co.getCodtp()
                    + " WHERE FOLIOC=" + co.getFolioc();
            System.out.println(query);
            int f = st.executeUpdate(query);
            if (f != 1) {

                System.out.println("no modifico");
            } else {
                System.out.println("moficacion correcta");
                return true;
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en OperacionesDb SQL");
        }
        return false;
    }

    private boolean categoriaex(String[] categorias, String[] categorias0) {

        boolean b = true;
        for (int i = 0; i < categorias.length && b; i++) {
            for (int j = 0; j < categorias0.length; j++) {
                if (categorias[i].equals(categorias0[j])) {
                    b = true;
                    break;
                } else {
                    b = false;
                }
            }
        }
        return b;
    }

    private boolean idiomasex(String[] idiomas, String[] idiomas0) {
        boolean b = true;
        for (int i = 0; i < idiomas.length && b; i++) {
            for (int j = 0; j < idiomas0.length; j++) {
                if (!idiomas[i].equals(idiomas0[j])) {
                    b = true;
                    break;
                } else {
                    b = false;
                }
            }
        }
        return b;
    }

    private boolean autoresex(String[] autores, String[] autores0) {
        boolean b = true;
        for (int i = 0; i < autores.length && b; i++) {
            for (int j = 0; j < autores0.length; j++) {
                if (!autores[i].equals(autores0[j])) {
                    b = true;
                    break;
                } else {
                    b = false;
                }
            }
        }
        return b;
    }

}
