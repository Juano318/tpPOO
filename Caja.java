package trabajoPractico;
//LUCA
public class Caja {
    public int total;

    public Caja(int total) {
        this.total = total;
    }


    public int RegistrarIngreso(int pagodemulta) {
        this.total += pagodemulta;
        return this.total;
    }

    public int getTotal() {
        return total;
    }


    public void setTotal(int total) {
        this.total = total;
    }

}
