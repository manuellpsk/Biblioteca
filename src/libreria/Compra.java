package libreria;
public class Compra{

    private int folioc;
    private int rutd;
    private String fecha;
    private int codtp;

    public Compra() {
    }

    public Compra(int folioc, int rutd, String fecha, int codtp) {
        this.folioc = folioc;
        this.rutd = rutd;
        this.fecha = fecha;
        this.codtp = codtp;
    }

    public int getFolioc() {
        return folioc;
    }

    public void setFolioc(int folioc) {
        this.folioc = folioc;
    }

    public int getRutd() {
        return rutd;
    }

    public void setRutd(int rutd) {
        this.rutd = rutd;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCodtp() {
        return codtp;
    }

    public void setCodtp(int codtp) {
        this.codtp = codtp;
    }
    
}
