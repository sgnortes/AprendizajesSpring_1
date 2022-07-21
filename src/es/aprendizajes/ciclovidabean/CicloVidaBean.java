package es.aprendizajes.ciclovidabean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CicloVidaBean {

	public static void main(String[] args) {
		// Crear contexto de la aplicacion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext4.xml");		
		
		// Obtenemos beans creados con patrón singleton
		Secretario mario = contexto.getBean("miSecretario", Secretario.class);
		
		// Uso del bean
		System.out.println(mario.getTareas());
		
		// Cerramos contexto
		contexto.close();

	}

}
