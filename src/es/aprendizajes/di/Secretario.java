package es.aprendizajes.di;

import es.aprendizajes.di.CreacionInformes;

public class Secretario implements Empleado{
	
	private CreacionInformes informeNuevo;
	
	private String nombreEmpresa;
	
	private String email;

	public String getTareas() {
		return "Soy el encargado de gestionar la agenda del Jefe.";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el Secretario: " + informeNuevo.getInformes();
	}
	
	// Inyección de dependencias a través de setters
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
