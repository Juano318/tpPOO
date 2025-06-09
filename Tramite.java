package trabajoPractico;

public class Tramite {
	public int idTramite;
	public String estado;
	public boolean aprobado;
	
	public Tramite(int idTramite, String estado, boolean aprobado) {
		this.idTramite = idTramite;
		this.estado = estado;
		this.aprobado = aprobado;
	}
	public void generarTramite() {
		
	}
	public void cambiarEstado(String estado) {
		
	}
	public int getIdTramite() {
		return idTramite;
	}
	public String getEstado() {
		return estado;
	}
	public boolean getAprobado() {
		return aprobado;
	}
	public void setIdTramite(int idTramite) {
		this.idTramite = idTramite;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}
}
