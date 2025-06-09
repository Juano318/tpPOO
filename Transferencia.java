package trabajoPractico;

public class Transferencia {
	public String propietarioAnterior;
	public String propietarioNuevo;
	
	public Transferencia(String propietarioAnterior, String propietarioNuevo) {
		this.propietarioAnterior = propietarioAnterior;
		this.propietarioNuevo = propietarioNuevo;
	}
	public void procesarTransferencia(Auto Auto, String propietarioAnterior) {
		
	}
	public String getPropietarioNuevo() {
		return propietarioNuevo;
	}
	public String getPropietarioAnterior() {
		return propietarioAnterior;
	}
	public void setPropietarioAnterior(String propietarioAnterior) {
		this.propietarioAnterior = propietarioAnterior;
	}
	public void setPropietarioNuevo(String propietarioNuevo) {
		this.propietarioNuevo = propietarioNuevo;
	}
}
