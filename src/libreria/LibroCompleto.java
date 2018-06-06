package libreria;
public class LibroCompleto {

    private int serie;
    private int codisbn;
    private String titulo;
    private int numpag;
    private int precio;
    private String  año;
    private String  estado;
    private String editorial;
    private String[]    categorias;
    private String[]    idiomas;
    private String[]    autores;
    
    public LibroCompleto(){}

    public LibroCompleto(int serie, int codisbn, String titulo, int numpag, int precio, String año, String estado, String editorial, String[] categorias, String[] idiomas, String[] autores) {
        this.serie = serie;
        this.codisbn = codisbn;
        this.titulo = titulo;
        this.numpag = numpag;
        this.precio = precio;
        this.año = año;
        this.estado = estado;
        this.editorial = editorial;
        this.categorias = categorias;
        this.idiomas = idiomas;
        this.autores = autores;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
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

    public String[] getCategorias() {
        return categorias;
    }

    public void setCategorias(String[] categorias) {
        this.categorias = categorias;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public String[] getAutores() {
        return autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "LibroCompleto{" + "serie=" + serie + ", codisbn=" + codisbn + ", titulo=" + titulo + ", numpag=" + numpag + ", precio=" + precio + ", a\u00f1o=" + año + ", estado=" + estado + ", editorial=" + editorial + ", categorias=" + categorias + ", idiomas=" + idiomas + ", autores=" + autores + '}';
    }

    
    
    
    

}
