package ej;

/*Crea un programa que utilice runnable para conytar hasta 10
 * El hilo debe incrementar el contador cada segundo
 * Mostrar el valor actualizado por consola
 * */

public class Ejercicio implements Runnable {
	
	private int count = 0;
	@Override
	public void run() {
		while (count < 10) {
			Thread t = new Thread();
			count++;
			System.err.println("Hilo actual: " + count);
			System.err.println("Id del hilo: " + t.getId());
			System.err.println("Nombre del hilo: " + t.getName());
			System.err.println("Estado del hilo: " + t.getState());
			System.err.println("-------------------------");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		// Instanciar la clase
		Ejercicio ej = new Ejercicio();
		ej.run();
	}

}
