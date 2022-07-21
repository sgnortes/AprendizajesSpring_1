package es.aprendizajes.ioc;

public class Secretario implements Empleado {

	@Override
	public String getTareas() {
		return "Gestiono la agenda del jefe.";
	}

}
