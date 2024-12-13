package sockets;

import java.io.IOException;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {
		
		 // Crea un objeto Servidor en el puerto 5555
		Servidor servidor = new Servidor(5555);
		
		try {
            // Bucle principal que se ejecuta mientras el servidor esté conectado
			while(servidor.estaConectado()) {
				// Acepta una nueva conexión de un cliente
				Socket socketCliente = servidor.aceptarConexion();
                
				// Crea un objeto Cliente para representar al cliente conectado
				Cliente cliente = new Cliente(socketCliente);
				
                // Agrega el cliente a la lista de clientes conectados del servidor
				servidor.addCliente(cliente);
				
				// Crea un nuevo hilo ConexionCliente para manejar la comunicación con el cliente
				ConexionCliente conexionCliente = new ConexionCliente(cliente, servidor);
				
                // Inicia el hilo ConexionCliente para que se ejecute en segundo plano
				conexionCliente.start();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
