package procesos;

// CREAREMOS DOS CLASES DISTINTAS, UNA PARA CADA TIPO DE MONITOREO
class CPU implements Runnable {
	public void run() {
		// CREAMOS UN BUCLE WHILE INFINITO PARA QUE "MONITOREE" LA CPU
		while (true) {
			System.out.println("Monitoreando CPU del sistema...");

			// DORMIMOS EL HILO 3 SEGUNDOS
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Memoria implements Runnable {
	public void run() {
		// CREAMOS UN BUCLE WHILE INFINITO PARA QUE "MONITOREE" LA MEMORIA
		while (true) {
			System.out.println("Monitoreando memoria del sistema...");

			// DORMIMOS EL HILO 3 SEGUNDOS
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
// CLASE MAIN
public class CPUyMemoria {

	public static void main(String[] args) {

		// INSTANCIAMOS LAS CLASES CPU Y MEMORIA CREADAS ANTERIORMENTE
		CPU cpu = new CPU();
		Memoria memoria = new Memoria();
		
		// CREAMOS UN HILO PARA CADA CLASE
		Thread t1 = new Thread(cpu);
		Thread t2 = new Thread(memoria);
		
		// INICIAMOS LOS HILOS
		t1.start();
		t2.start();

	}

}
