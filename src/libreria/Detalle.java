package libreria;
public class Detalle {
    private int codigo;
    private String nombre;
    
    public Detalle(){}

    public Detalle(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Detalle{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
    
}
