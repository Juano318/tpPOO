package trabajoPractico;
//HACER EL EXTEND DE PERSONA
import java.util.ArrayList;
import java.util.List;

public class Trabajador  {
	private int antiguedad;
	private int id;
	private int horasTrabajadasTotales;
	private List<String> turnosOcupados;
	
	public Trabajador(int antiguedad, int id, int horasTrabajadasTotales) {
		this.antiguedad = antiguedad;
		this.id = id;
		this.horasTrabajadasTotales = horasTrabajadasTotales;
		this.turnosOcupados = new ArrayList<>();
	}
	public void empezarActividad(Empleado Empleado, int horasTrabajadasTotales){	
	        if (Empleado == null) {
	            System.out.println("Error: Empleado no puede ser nulo");
	            return;
	        }
	        
	        int horasDiarias = Empleado.getjornadaTotal();
	        
	        this.horasTrabajadasTotales += horasDiarias;
	        
	        System.out.println("Jornada registrada para: " + Empleado.getpuesto());
	        System.out.println("Horas trabajadas hoy: " + horasDiarias);
	        System.out.println("Total histórico acumulado: " + this.horasTrabajadasTotales);
	        
	        registrarJornadaCompleta(Empleado);
	    }
	    
	    private void registrarJornadaCompleta(Empleado Empleado) {
	        System.out.println("\n[Registro en sistema]");
	        System.out.println("Empleado: " + Empleado.getpuesto());
	        System.out.println("Horas diarias: " + Empleado.getjornadaTotal());
	        System.out.println("Total acumulado empresa: " + this.horasTrabajadasTotales);
	    }
	
	public void sacarTurno(String turno) {
		if (!turnosOcupados.contains(turno)) {
            turnosOcupados.add(turno);
            System.out.println("Turno " + turno + " registrado con éxito.");
        } else {
            System.out.println("El turno " + turno + " ya está ocupado.");
        }
    }
	public void consultarTurnosDisp() {
		System.out.println("\nHorario de atención: 8:00 - 16:00");
        System.out.println("Turnos ocupados: " + turnosOcupados);
       
        List<String> todosTurnos = new ArrayList<>();
        for (int hora = 8; hora < 16; hora++) {
            String turno = String.format("%02d:00-%02d:00", hora, hora+1);
            todosTurnos.add(turno);
        }
        
        List<String> turnosDisponibles = new ArrayList<>();
        for (String turno : todosTurnos) {
            if (!turnosOcupados.contains(turno)) {
                turnosDisponibles.add(turno);
            }
        }
        
        System.out.println("Turnos disponibles: " + turnosDisponibles);
	}
	public void verInfoCliente(Cliente Cliente) {
		if (Cliente == null) {
	        System.out.println("Error: El cliente no existe");
	        return;
	    }

	    System.out.println("\n=== INFORMACIÓN DEL CLIENTE ===");
	    System.out.println("ID Cliente: " + Cliente.getidCliente());
	    System.out.println("Email: " + Cliente.getEmail());
	    System.out.println("Cantidad de Autos Registrados: " + Cliente.getCantAutos());
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public int getId() {
		return id;
	}
	public int getHorasTrabajadasTotales() {
		return horasTrabajadasTotales;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setHorasTrabajadasTotales(int horasTrabajadasTotales) {
		this.horasTrabajadasTotales = horasTrabajadasTotales;
	}
}
