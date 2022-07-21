package es.aprendizajes.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Trabajo {

	public static void main(String[] args) {
		
		// Crear contexto de la aplicacion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");		
		
		// Obtenemos bean
		Empleado pepe = contexto.getBean("miEmpleado", Empleado.class);
		
		// Uso del objeto
		System.out.println(pepe.getTareas());
		
		// Cerramo contexto
		contexto.close();
	}

}
