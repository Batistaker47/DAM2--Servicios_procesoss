package thread;

public class Main {

	public static void main(String[] args) {
		/*Clase `Thread: 
		 * Es la clase fundamental para trabajar con hilos en Java. 
		 * Puedes extender esta clase o implementar la interfaz `Runnable` para definir el código que debe ejecutar un hilo.*/

			  MyThread t = new MyThread();

			  t.start();
			  
		/*class MyRunnable implements Runnable {
			  public void run() {
				  System.out.println("El hilo está corriendo");

    }

  }

  			Thread t = new Thread(new MyRunnable());

  			t.start();*/
	}

}
