package ej;

public class Ejercicio2 implements Runnable {

	private String[] saludos = {"Hola","Canam","Arigato","Ciao","sveiki"};
	private int count = 0;
	@Override
	public void run() {
		
		while (count < saludos.length) {
			Thread t = new Thread();
			System.out.println("Saludo seleccionado: " + saludos[count]);
			System.out.println("Id del hilo: " + t.getId());
			System.out.println("Nombre del hilo: " + t.getName());
			System.out.println("Estado del hilo: " + t.getState());
			count++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// Instanciar la clase
		Ejercicio ej1 = new Ejercicio();
		Ejercicio2 ej2 = new Ejercicio2();
		ej1.run();
		ej2.run();
	}
}
