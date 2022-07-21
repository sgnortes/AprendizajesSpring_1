package es.aprendizajes.di;

import es.aprendizajes.di.CreacionInformes;

public class Jefe implements Empleado{
	
	private CreacionInformes informeNuevo;
	
	private String email;

	private String nombreEmpresa;
	
	// Inyección de dependencias por constructor
	public Jefe(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Soy el encargado de gestionar al equipo.";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el Jefe: " + informeNuevo.getInformes();
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
}
