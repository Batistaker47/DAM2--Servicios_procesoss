package sockets;

import java.io.IOException;

/**
 * Esta clase representa una conexión individual con un cliente y se encarga de manejar la comunicación entre el cliente y el servidor.
 * Extiende la clase Thread para poder ejecutar la lógica de comunicación en un hilo separado.
 */
public class ConexionCliente extends Thread {

	private Cliente cliente;
	private Servidor servidor;
	
	
	public ConexionCliente(Cliente cliente, Servidor servidor) {
		this.cliente = cliente;
		this.servidor = servidor;
	}

    /**
     * Método que se ejecuta cuando se inicia el hilo.
     * Maneja la comunicación con el cliente, recibiendo mensajes y enviándolos a todos los clientes conectados.
     */
	public void run() {
		
		cliente.salida.println("Hola, bienvenido al servicio de mensajería");
		
		try {
			while (cliente.estaConectado()) {
				String mensaje = cliente.entrada.readLine();
				servidor.enviarMensajeATodos(mensaje);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
}
