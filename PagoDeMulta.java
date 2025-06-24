package trabajoPractico;
//LUCA
public class PagoDeMulta {
    public String motivo;
    public boolean pagada;
    public int monto;


    public PagoDeMulta(String motivo, boolean pagada, int monto) {
        this.motivo = motivo;
        this.pagada = pagada;
        this.monto = monto;
    }

    public boolean registrarPago(boolean pagada) {
        this.pagada = pagada;
        return this.pagada;
    }


    public void transferirACaja(int monto) {
        System.out.println("Monto transferido a la caja: $" + monto);
    }

    public String getmotivo() { return motivo; }
    public void setmotivo(String motivo) { this.motivo = motivo; }

    public boolean ispagada() { return pagada; }
    public void setpagada(boolean pagada) { this.pagada = pagada; }

    public int getMonto() { return monto; }
    public void setMonto(int monto) { this.monto = monto; }
}
