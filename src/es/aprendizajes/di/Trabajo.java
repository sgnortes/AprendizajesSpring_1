package es.aprendizajes.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Trabajo {

	public static void main(String[] args) {
		
		// Crear contexto de la aplicacion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");		
		
		// Obtenemos bean
		Empleado jefe = contexto.getBean("miJefe", Empleado.class);
		Empleado secretario1 = contexto.getBean("miSecretario", Empleado.class);
		Empleado secretario2 = contexto.getBean("miSecretario", Empleado.class);
		
		// Uso del objeto
		System.out.println(jefe.getTareas());
		System.out.println(jefe.getInforme());
		System.out.println(jefe.getEmail());
		System.out.println(jefe.getNombreEmpresa());
		
		System.out.println(secretario1.getTareas());
		System.out.println(secretario1.getInforme());
		System.out.println(secretario1.getEmail());
		System.out.println(secretario1.getNombreEmpresa());
		
		System.out.println(secretario2.getTareas());
		System.out.println(secretario2.getInforme());
		System.out.println(secretario2.getEmail());
		System.out.println(secretario2.getNombreEmpresa());
		
		// Cerramo contexto
		contexto.close();
	}

}
