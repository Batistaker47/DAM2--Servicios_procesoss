package ej;

/*EJERCICIO PARA EJECUTAR HILOS DE MANERA CONCURRENTE*/
public class Ejercicio3 implements Runnable {

	// Declaramos un contador para parar el bucle
	private int count = 5;
	@Override
	// Método para inicializar el proceso del hilo
	public void run() {
		//Mostramos por consola un mensaje por cada dato porcesando, que iteramos en i
		for (int i = 0; i < count; i++) {
			System.err.println("Procesando dato nº " + i );
			// Hacemos un sleep para que se pare durante 1 segundo entre dato y dato
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		
		// Instanciamos las clases de todos los ejercicios
		Ejercicio ej1 = new Ejercicio();
		Ejercicio2 ej2 = new Ejercicio2();
		Ejercicio3 ej3 = new Ejercicio3();
		
		// Inicializamos los 3 hilos, a los que les pasamos el ejercicio
		Thread t1 = new Thread(ej1);
		Thread t2 = new Thread(ej2);
		Thread t3 = new Thread(ej3);
		
		// Añadimos los hilos a un array de hilos
		Thread[] threadList = {t1,t2,t3};
		
		// Con el foreach, recorremos la lista de hilos, que se ejecutarán de manera concurrente
		for (Thread thread : threadList) {
			// Iniciamos el hilo
			thread.start();
		}

	}

}
