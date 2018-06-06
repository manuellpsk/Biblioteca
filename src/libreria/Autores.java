package libreria;
public class Autores {

    private int codaut;
    private String  nombre;
    private String  app;
    private String  apm;
    
    public Autores(){}

    public Autores(int codaut, String nombre, String app, String apm) {
        this.codaut = codaut;
        this.nombre = nombre;
        this.app = app;
        this.apm = apm;
    }

    public int getCodaut() {
        return codaut;
    }

    public void setCodaut(int codaut) {
        this.codaut = codaut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    @Override
    public String toString() {
        return "Autores{" + "codaut=" + codaut + ", nombre=" + nombre + ", app=" + app + ", apm=" + apm + '}';
    }
    
    
}
