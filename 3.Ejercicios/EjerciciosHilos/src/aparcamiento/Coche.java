package aparcamiento;

public class Coche implements Runnable {

	@Override
	public void run() {
		// EN EL MÉTODO RUN ESTA VEZ NO VAMOS A CREAR LOS HILOS, YA QUE NECESITAMOS QUE ESTE PROCESO DE ENTRADA Y SALIDA DEL APARCAMIENTO OCURRA DE MANERA CONCURRENTE
		try {
			/*CREAMOS U  BUCLE EN EL QUE SE DARÁN 1000 VUELTAS.
			 * DENTRO DE ESTE, EL COCHE ENTRA AL PARKING, ENCUENTRA PLAZA DE APARCAMIENTO Y APARCA, DEJANDO UN TIEMPO DE SLEEP PARA SIMULAR EL APARCAMIENTO Y SALIENDO DESPUÉS DE LA PLAZA*/
			for (int i = 1; i < 1000; i++) {
				System.out.println("Coche entrando al parking");
				System.out.println("Plaza de aparcamiento encontrada, aparcando...");
				Thread.sleep(3000);
				System.out.println("Coche aparcado correctamente");
				Thread.sleep(1000);
				System.out.println("Coche saliendo de la plaza de aparcamiento");
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
