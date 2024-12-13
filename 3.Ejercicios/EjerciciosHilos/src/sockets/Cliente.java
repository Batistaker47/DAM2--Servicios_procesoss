package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {

	private Socket socket;
	BufferedReader entrada;
	PrintWriter salida;
	
	  /**
	   * Constructor que inicializa el cliente con un socket del servidor.
	   * 
	   * @param socket El socket del servidor al que se conectará el cliente.
	   * @throws IOException Si ocurre un error al crear los streams de entrada y salida.
	   */
	public Cliente(Socket socket) throws IOException {
		
		this.socket = socket;
		entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		salida = new PrintWriter(socket.getOutputStream(), true);
	}
	
	  /**
	   * Verifica si el cliente está conectado al servidor (es decir, si el socket no está cerrado).
	   * 
	   * @return True si el cliente está conectado, false en caso contrario.
	   */
	public boolean estaConectado() {
		return !socket.isClosed();
	}
}
