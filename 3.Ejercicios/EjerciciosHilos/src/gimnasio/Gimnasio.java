package gimnasio;

import java.util.Random;

/*TODAS LAS CLASES DE EJERCICIOS FUNCIONAN DE LA SIGUIENTE MANERA:
 * 1) CREAMOS UN BUCLE INFINITO EN EL QUE METEREMOS EL EJERCICIO
 * 2) ESTE EJERCICIO TIENE UNAS REPETICIONES Y UN TIEMPO GENERADO DE MANERA ALEATORIA
 * 3) PONEMOS UN SLEEP PARA SIMULAR EL TIEMPO DE REALIZACIÓN DEL EJERCICIO
 * 4) FINALIZA EL EJERCICIO*/
class PressBanca implements Runnable {
	public void run() {
		while (true) {
			try {
				Random randgen = new Random();
				int repeticiones = randgen.nextInt(1,15);
				int tiempo = randgen.nextInt(5,10);
				System.out.println("Usuario realizando press de banca con " + repeticiones + " repeticion/es durante un tiempo de " + tiempo + " minutos");
				Thread.sleep(3000);
				System.out.println("Ejercicio de press banca terminado");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
class Mancuernas implements Runnable {
	public void run() {
		while (true) {
			try {
				Random randgen = new Random();
				int repeticiones = randgen.nextInt(15);
				int tiempo = randgen.nextInt(5,10);
				System.out.println("Usuario realizando mancuernas con " + repeticiones + " repeticion/es durante un tiempo de " + tiempo + " minutos");
				Thread.sleep(3000);
				System.out.println("Ejercicio de mancuernas terminado");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
class Espalda implements Runnable {
	public void run() {
		while (true) {
			try {
				Random randgen = new Random();
				int repeticiones = randgen.nextInt(15);
				int tiempo = randgen.nextInt(5,10);
				System.out.println("Usuario realizando espalda con " + repeticiones + " repeticion/es durante un tiempo de " + tiempo + " minutos");
				Thread.sleep(3000);
				System.out.println("Ejercicio de espalda terminado");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
public class Gimnasio {
	public static void main(String[] args) {
		
		// INSTANCIAMOS LAS CLASES
		PressBanca pb = new PressBanca();
		Mancuernas m = new Mancuernas();
		Espalda e = new Espalda();
		
		// CREAMOS UN HILO PARA CADA CLASE
		Thread t1 = new Thread(pb);
		Thread t2 = new Thread(m);
		Thread t3 = new Thread(e);
		
		// INICIAMOS LOS HILOS
		t1.start();
		t2.start();
		t3.start();
	}

}
