package libreria;
public class Libros {
    private int serie;
    private int codisbn;
    private String titulo;
    private int numpag;
    private int precio;
    private String  año;
    private String  estado;
    private String editorial;
    
    public Libros(){}

    public Libros(int serie,int codisbn, String titulo, int numpag, int precio, String año, String estado, String editorial) {
        this.serie=serie;
        this.codisbn = codisbn;
        this.titulo = titulo;
        this.numpag = numpag;
        this.precio = precio;
        this.año = año;
        this.estado=estado;
        this.editorial = editorial;
    }
    public int getSerie(){
        return serie;
    }
    public void setSerie(int serie){
        this.serie=serie;
    }

    public int getCodisbn() {
        return codisbn;
    }

    public void setCodisbn(int codisbn) {
        this.codisbn = codisbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    
    
    
}
