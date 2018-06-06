package libreria;
public class Venta {
    
    private int foliov;
    private int rutt;
    private int rutc;
    private String  fecha;
    private int codtp;

    public Venta() {
    }

    public Venta(int foliov, int rutt, int rutc, String fecha, int codtp) {
        this.foliov = foliov;
        this.rutt = rutt;
        this.rutc = rutc;
        this.fecha = fecha;
        this.codtp = codtp;
    }

    public int getFoliov() {
        return foliov;
    }

    public void setFoliov(int foliov) {
        this.foliov = foliov;
    }

    public int getRutt() {
        return rutt;
    }

    public void setRutt(int rutt) {
        this.rutt = rutt;
    }

    public int getRutc() {
        return rutc;
    }

    public void setRutc(int rutc) {
        this.rutc = rutc;
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
