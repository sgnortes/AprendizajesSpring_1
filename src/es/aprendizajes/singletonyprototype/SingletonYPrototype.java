package es.aprendizajes.singletonyprototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonYPrototype {

	public static void main(String[] args) {
		// Crear contexto de la aplicacion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");		
		
		// Obtenemos beans creados con patrón singleton
		Jefe mario = contexto.getBean("miJefe", Jefe.class);
		Jefe adrian = contexto.getBean("miJefe", Jefe.class);
		
		// Obtenemos beans creados con patrón prototype
		Secretario pepe = contexto.getBean("miSecretario", Secretario.class);
		Secretario jose = contexto.getBean("miSecretario", Secretario.class);
				
		// Objetos creados usando el patrón singleton
		System.out.println("Objetos creados con patrón singleton deben apuntar hacia un solo objeto en memoria.");
		System.out.println(mario);
		System.out.println(adrian);
		
		// Objetos creados usando el patrón singleton
		System.out.println("Objetos creados con patrón prototype deben apuntar hacia objetos distintos en memoria.");
		System.out.println(pepe);
		System.out.println(jose);
		
		
				
		// Cerramo contexto
		contexto.close();
	}

}
