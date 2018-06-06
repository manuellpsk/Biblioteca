package libreria;
public class Distribuidores {

    private int rutd;
    private String nombre;
    private String  calle;
    private int numcalle;
    private String  comuna;
    private String  pais;
    private int fono;
    private int año;

    public Distribuidores() {
    }

    public Distribuidores(int rutd, String nombre, String calle, int numcalle, String comuna, String pais, int fono, int año) {
        this.rutd = rutd;
        this.nombre = nombre;
        this.calle = calle;
        this.numcalle = numcalle;
        this.comuna = comuna;
        this.pais = pais;
        this.fono = fono;
        this.año = año;
    }

    public int getRutd() {
        return rutd;
    }

    public void setRutd(int rutd) {
        this.rutd = rutd;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumcalle() {
        return numcalle;
    }

    public void setNumcalle(int numcalle) {
        this.numcalle = numcalle;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}
