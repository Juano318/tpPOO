package trabajoPractico;
//LUCA
public class Cliente {

    public String email;
    public int idCliente;
    public int fechaRegistro;
    public int CantAutos;


    public Cliente( String email, int idCliente, int fechaRegistro, int CantAutos) {

        this.email = email;
        this.idCliente = idCliente;
        this.fechaRegistro = fechaRegistro;
        this.CantAutos = CantAutos;
    }

    public Turno SacaTurno(Turno turno) {
        return turno;
    }

    public void RegistrarAuto(Auto auto) {

    }

    public boolean PagarMulta(boolean pagadaMulta) {
        return pagadaMulta;
    }

    public void verHistorial() {

    }

    public void actualizarDatos() {

    }


    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getidCliente() { return idCliente; }
    public void setidCliente(int idCliente) { this.idCliente = idCliente; }

    public int getfechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(int fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public int getCantAutos() { return CantAutos; }
    public void setCantAutos(int CantAutos) { this.CantAutos = CantAutos; }
}





