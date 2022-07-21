package es.aprendizajes.singletonyprototype;

public class Jefe{
	
	private String email;

	private String nombreEmpresa;

	public String getTareas() {
		return "Soy el encargado de gestionar al equipo.";
	}

	public String getEmail() {
		return this.email;
	}

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
