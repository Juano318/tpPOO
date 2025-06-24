package trabajoPractico;
//LUCA
public class Empleado {
    public String puesto;
    public int jornadaTotal;

    public Empleado( int jornadaTotal, String puesto) {

        this.jornadaTotal = jornadaTotal;
        this.puesto = puesto;
    }


    public void EmpezarJornada(int jornadaTotal) {
        this.jornadaTotal = jornadaTotal;

    }

    public void AtenderTurno(Turno turno) {

    }

    public int getjornadaTotal() { return jornadaTotal; }
    public void setjornadaTotal(int jornadaTotal) { this.jornadaTotal = jornadaTotal; }

    public String getpuesto() { return puesto; }
    public void setpuesto(String puesto) { this.puesto = puesto; }


}
