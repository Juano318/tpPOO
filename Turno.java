package trabajoPractico;

import java.util.Date;

public class Turno {
	public Date fecha;
	public int hora;
	public String estado;
	
	public Turno(Date fecha, int hora, String estado) {
		this.fecha = fecha;
		this.hora = hora;
		this.estado = estado;
	}
	public void cambiarEstado(String estado) {
		
	}
	public void registrarEnCalendario() {
		
	}
	public Date getFecha() {
		return fecha;
	}
	public int getHora() {
		return hora;
	}
	public String getEstado() {
		return estado;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public void setEstadi(String estado) {
		this.estado = estado;
	}
}
