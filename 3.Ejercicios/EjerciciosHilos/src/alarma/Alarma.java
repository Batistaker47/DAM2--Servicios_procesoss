package alarma;

import java.util.Random;

//CREAREMOS DOS CLASES DISTINTAS, UNA PARA CADA TIPO DE MONITOREO
class AlarmaUsuario implements Runnable {
	public void run() {
		// CREAMOS UN BUCLE WHILE INFINITO PARA QUE SE FIJE LA HORA DE LA ALARMA PARA CADA USUARIO
		while (true) {
			try {
			//CREAMOS LA INSTANCIA DEL RANDOM
			Random randgen = new Random();
			int user = randgen.nextInt(1,10000);
			// GENERAMOS UN NÚMERO DE USUARIO ALEATORIO
			System.out.println("Usuario nº " + user + " esperando a ser asignada la alarma");
			
			// LE AUTOGENERAMOS DE MANERA ALEATORIA AL USUARIO UNA HORA DE ALARMA, A LA QUE LE PASAMOS EL NUMERO DEL USUARIO GENERADO ANTERIORMENTE
			int hora = randgen.nextInt(1,25);
			System.out.println("Alarma para el usuario " + user + " fijada a las " + hora + ":00 horas");
			// DORMIMOS EL HILO 2 SEGUNDOS
			
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Alarma {

	public static void main(String[] args) {
		// INSTANCIAMOS LA CLASE USUARIO, CREAMOS LOS HILOS Y LOS INICIALIZAMOS DE 4 EN 4 USUARIOS
		AlarmaUsuario au = new AlarmaUsuario();
		Thread t1 = new Thread(au);
		Thread t2 = new Thread(au);
		Thread t3 = new Thread(au);
		Thread t4 = new Thread(au);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
