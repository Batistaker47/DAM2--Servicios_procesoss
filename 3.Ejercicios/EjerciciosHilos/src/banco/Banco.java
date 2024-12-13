package banco;

import java.util.Random;

// CREAMOS UNA CLASE CON LAS CARACTERÍSTICAS DE LAS CUENTAS BANCARIAS, QUE TIENEN COMO ATRIBUTOS EL BALANCE Y EL TIEMPO DE ACTIVIDAD
class CuentaBancariaUser implements Runnable {
	private double balance;
	private int tiempoActividad;

	public CuentaBancariaUser() {
	}
	/*FUNCIONA DE LA SIGUIENTE MANERA:
	 * 1) CREAMOS UN BUCLE INFINITO EN EL QUE METEREMOS LA CUENTA
	 * 2) ESTA CUENTA TIENE UN BALANCE Y UN TIEMPO DE USO DE LA APLICACION GENERADOS ALEATORIAMENTE
	 * 3) PONEMOS UN SLEEP PARA SEPARAR PROCESOS*/
	public void run() {
		while (true) {
			try {
				Random randgen = new Random();
				double balance = randgen.nextDouble() * 10000;
				System.out.println("Saldo actual:" + balance + " euros");
				int tiempo = randgen.nextInt(5,20); 
				System.out.println("Tiempo de uso de la sesión: " + tiempo + " minutos");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Banco {
	
	public static void main(String[] args) {
		
		// INICIALIZAMOS LOS OBJETOS DE LAS CUENTAS DE USUARIO
		CuentaBancariaUser cb1 = new CuentaBancariaUser();
		CuentaBancariaUser cb2 = new CuentaBancariaUser();
		CuentaBancariaUser cb3 = new CuentaBancariaUser();
		CuentaBancariaUser cb4 = new CuentaBancariaUser();
		CuentaBancariaUser cb5 = new CuentaBancariaUser();
		CuentaBancariaUser cb6 = new CuentaBancariaUser();
		CuentaBancariaUser cb7 = new CuentaBancariaUser();
		CuentaBancariaUser cb8 = new CuentaBancariaUser();
		CuentaBancariaUser cb9 = new CuentaBancariaUser();
		CuentaBancariaUser cb10 = new CuentaBancariaUser();
		CuentaBancariaUser cb11 = new CuentaBancariaUser();
		CuentaBancariaUser cb12 = new CuentaBancariaUser();
		CuentaBancariaUser cb13 = new CuentaBancariaUser();
		CuentaBancariaUser cb14 = new CuentaBancariaUser();
		CuentaBancariaUser cb15 = new CuentaBancariaUser();
		CuentaBancariaUser cb16 = new CuentaBancariaUser();
		CuentaBancariaUser cb17 = new CuentaBancariaUser();
		CuentaBancariaUser cb18 = new CuentaBancariaUser();
		CuentaBancariaUser cb19 = new CuentaBancariaUser();
		CuentaBancariaUser cb20 = new CuentaBancariaUser();
		
		// CREAMOS UN HILO POR CADA CUENTA
		Thread t1 = new Thread(cb1);
		Thread t2 = new Thread(cb2);
		Thread t3 = new Thread(cb3);
		Thread t4 = new Thread(cb4);
		Thread t5 = new Thread(cb5);
		Thread t6 = new Thread(cb6);
		Thread t7 = new Thread(cb7);
		Thread t8 = new Thread(cb8);
		Thread t9 = new Thread(cb9);
		Thread t10 = new Thread(cb10);
		Thread t11 = new Thread(cb11);
		Thread t12 = new Thread(cb12);
		Thread t13 = new Thread(cb13);
		Thread t14 = new Thread(cb14);
		Thread t15 = new Thread(cb15);
		Thread t16 = new Thread(cb16);
		Thread t17 = new Thread(cb17);
		Thread t18 = new Thread(cb18);
		Thread t19 = new Thread(cb19);
		Thread t20 = new Thread(cb20);
		
		// INICIAMOS LOS HILOS
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		t12.start();
		t13.start();
		t14.start();
		t15.start();
		t16.start();
		t17.start();
		t18.start();
		t19.start();
		t20.start();	
	}
}
