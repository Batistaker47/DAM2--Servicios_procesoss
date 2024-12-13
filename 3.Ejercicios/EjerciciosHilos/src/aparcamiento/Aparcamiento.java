package aparcamiento;

public class Aparcamiento implements Runnable {
	
	@Override
	public void run() {

		// AQUI EL MÉTODO RUN NO HACE NADA YA QUE LA FUNCIONALIDAD ESTÁ EN LA CLASE "COCHE"
	}
	public static void main(String[] args) {
		// INSTANCIAMOS LA CLASE COCHE
		Coche coche = new Coche();
		
		// HACEMOS UN HILO POR CADA UNO DE LOS COCHES
		Thread t1 = new Thread(coche);
		Thread t2 = new Thread(coche);
		
		// CREAMOS UNA LISTA DE HILOS QUE RECORREREMOS CON UN FOREACH
		Thread[] threadList = {t1,t2};
		
		// AL RECORRER LA LISTA DE HILOS, ESTOS SE EJECUTARÁN DE MANERA CONCURRENTE, ES DECIR, QUE IRÁN ENTRANDO SEGÚN LOS ESPACIOS DE MEMORIA DISPONIBLES
		for (Thread thread : threadList) {
			thread.start();
		}

	}

}
