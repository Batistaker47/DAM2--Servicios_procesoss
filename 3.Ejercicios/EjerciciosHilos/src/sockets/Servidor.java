package sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servidor {
	
	// Declaramos las variables del server socket, el puerto y un arraylist de clientes
	
	private ServerSocket socket;
	private int puerto;
	ArrayList<Cliente> clientes;
	
	/**
	 * Esta clase representa un servidor que escucha conexiones entrantes de clientes en un puerto específico.
	 */
	
	public Servidor(int puerto) {
		this.puerto = puerto;
		clientes = new ArrayList<Cliente>();
	}
	
	  /**
	   * Inicia el servidor creando un ServerSocket en el puerto especificado.
	   * 
	   * @throws IOException Si ocurre un error al crear el ServerSocket.
	   */
	public void iniciarServidor() throws IOException {
		
		socket = new ServerSocket(puerto);
	}

	  /**
	   * Dettiene el servidor cerrando el ServerSocket.
	   * 
	   * @throws IOException Si ocurre un error al cerrar el ServerSocket.
	   */
	public void pararServidor() throws IOException {
		
		socket.close();
	}
	
	  /**
	   * Verifica si el servidor está en ejecución (es decir, si el ServerSocket no está cerrado).
	   * 
	   * @return True si el servidor está en ejecución, false en caso contrario.
	   */
	public boolean estaConectado() {
		
		return !socket.isClosed();
	}
	
	  /**
	   * Acepta una conexión entrante de un cliente en el socket del servidor.
	   * 
	   * @return Un objeto Socket que representa la conexión establecida con el cliente.
	   * @throws IOException Si ocurre un error al aceptar la conexión.
	   */
	public Socket aceptarConexion() throws IOException {
		
		return socket.accept();
	}
	
	  /**
	   * Agrega un cliente conectado a la lista de clientes.
	   * 
	   * @param cliente El objeto Cliente que representa al cliente conectado.
	   */
	public void addCliente(Cliente cliente) {
		
		clientes.add(cliente);
	}
	
	  /**
	   * Envía un mensaje a todos los clientes conectados.
	   * 
	   * @param mensaje El mensaje de cadena que se enviará.
	   */
	public void enviarMensajeATodos(String mensaje) {
		 
		for (Cliente cliente : clientes) {
			cliente.salida.println(mensaje);
		}
		
	}
}
