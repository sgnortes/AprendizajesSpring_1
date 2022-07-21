package es.aprendizajes.singletonyprototype;

public class Secretario{

	private String nombreEmpresa;
	
	private String email;

	public String getTareas() {
		return "Soy el encargado de gestionar la agenda del Jefe.";
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
