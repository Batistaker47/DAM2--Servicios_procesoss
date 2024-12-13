package examen1T;

import java.util.Random;

/* DEBEMOS IMPLEMENTAR LA INTERFAZ RUNNABLE, QUE SE UTILIZA PARA CREAR PROCESOS CON HILOS.
 * INICIAR EL HILO CONLLEVA QUE EL PROCESO SE EJECUTE EN DISTINTOS HILOS */
public class CarreraBicis implements Runnable {

	// PRIMERO, GENERAMOS UNA VARIABLE RANDOM PARA AUTOGENERAR UN NÚMERO ALEATORIO PARA EL AVANCE DE LOS CICLISTAS
	// ESTA INSTANCIA ES NECESARIO IMPORTARLA, POR LO QUE SE VE EL IMPORT EN LA LÍNEA NÚMERO 3 DEL CÓDIGO
	Random randGen = new Random();

	// AÑADIMOS EL MÉTODO "RUN", QUE ES OBLIGATORIO AL IMPLEMENTAR LA INTERFAZ "RUNNABLE"
	@Override
	public void run() {

		// INICIALIZAMOS DOS HILOS DISTINTOS, Y CADA UNO VA A GESTIONAR LA DISTANCIA RECORRIDA POR CADA CICILSTA
		Thread ciclista1 = new Thread();
		Thread ciclista2 = new Thread();
		
		// USAMOS TRY Y CATCH PARA EL CONTROL DE EXCEPCIONES DE LOS HILOS (THREAD)
		try {
			// PONEMOS VARIOS MENSAJES POR CONSOLA PARA DEMOSTRAR QUE EFECTIVAMENTE CADA CICLISTA TIENE UN "DORSAL" DISTINTO.
			// ESTE DORSAL ES EL ID DE CADA UNO DE LOS HILOS QUE SE ESTÁ USANDO
			System.out.println("Dorsal del primer ciclista " + ciclista1.getId());
			System.out.println("Dorsal del segundo ciclista " + ciclista2.getId());
			
			// MENSAJE PARA DAR INICIO A LA CARRERA
			System.out.println("Ha comenzado la carrera!");
			
			// CREAMOS UN BUCLE EN EL QUE EL ITERADOR COMIENZA CON VALOR CERO, Y SE VA INCREMENTANDO DE 1 EN 1 HASTA LLEGAR A 1000
			for (int i = 0; i < 1000; i++) {
				
				
				// AUTOGENERAMOS CON EL RANDOM UN VALOR NUMÉRICO QUE GUARDAMOS EN DOS VARIABLES, UNA PARA CADA CICLISTA, Y ESTA SERÁ LA DISTANCIA QUE AVANCE CADA UNO.
				// POR CADA VUELTA DEL BUCLE, SE GENERARÁ UN NÚMERO ALEATORIO POSITIVO ENTRE 1 Y 10, YA QUE LO ESPECIFICAMOS DENTRO DEL "NEXTINT"
				int distanciaCiclista1 = randGen.nextInt(10);
				int distanciaCiclista2 = randGen.nextInt(10);
			
				// PONEMOS LOS METROS QUE HA AVANZADO CADA CICLISTA A TRAVÉS DE MENSAJES POR CONSOLA, EN LOS QUE MOSTRAMOS CADA UNO DE LOS NÚMEROS ENTEROS AUTOGENERADOS
			
				System.out.println("Distancia recorrida por el primer ciclista: " + distanciaCiclista1 + " metros");
				System.out.println("Distancia recorrida por el segundo ciclista: " + distanciaCiclista2 + " metros");
				
				// PONEMOS 2 SEGUNDOS DE ESPERA A TRAVÉS DEL MÉTODO "SLEEP", PARA QUE LAS DISTANCIAS RECORRIDAS SE VEAN CON UN TIEMPO DE SEPARACION
				Thread.sleep(2000);
			}
			// CONTROL DE EXCEPCIONES
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

	// EN EL MÉTODO MAIN, INICIALIZAMOS LA CLASE DE LA CARRERA Y LLAMAMOS AL MÉTODO "RUN" PARA QUE EJECUTE EL PROGRAMA
	public static void main(String[] args) {

		CarreraBicis c1 = new CarreraBicis();
		c1.run();
	}

}