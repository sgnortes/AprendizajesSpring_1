package es.aprendizajes.ciclovidabean;

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
	
	// Equivale al método init(). Se ejecuta cuando arranca el contenedor y se instancian los beana
	public void metodoInicial() {
		System.out.println("Se llamará a esta función antes de poder hacer uso del bean");
	}
	
	// Equivale al método destroy(). Se ejecuta cuando se cierra el contenedor
	public void metodoFinal() {
		System.out.println("Se llamará a esta función después hacer uso del bean");
	}
	
}
