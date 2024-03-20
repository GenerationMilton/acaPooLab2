package com.acaprogramacionobjetos.acafinalpoo.funcional;

import com.acaprogramacionobjetos.acafinalpoo.operativa.cliente.Cliente;
import com.acaprogramacionobjetos.acafinalpoo.operativa.habitacion.Habitacion;
import com.acaprogramacionobjetos.acafinalpoo.operativa.hotel.Hotel;
import com.acaprogramacionobjetos.acafinalpoo.operativa.pago.Pago;
import com.acaprogramacionobjetos.acafinalpoo.operativa.registrohuespedes.RegistroHuespedes;
import com.acaprogramacionobjetos.acafinalpoo.operativa.reserva.Reserva;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;


@SpringBootApplication
public class AcafinalpooApplication {



	public static void main(String[] args) {
		// Se crean instancias del hotel, habitaciones, clientes, reservas, huéspedes y transacciones de pago
		// Aquí debes incluir tu lógica para inicializar estos objetos con la información adecuada

		Hotel hotel = new Hotel();
		Habitacion habitacion = new Habitacion();
		Cliente cliente = new Cliente();
		Reserva reserva= new Reserva();
		RegistroHuespedes huespedes = new RegistroHuespedes();
		Pago pago = new Pago();


		// Ciclo para mostrar el menú y procesar las opciones
		while (true) {
			// Mostrar el menú de opciones
			String[] options = {
					"Consultar Información hotel",
					"Consultar Habitación",
					"Consultar Cliente",
					"Consultar Reserva",
					"Consultar Huéspedes",
					"Consultar de pago",
					"Salir"
			};
			ImageIcon icon = new ImageIcon(AcafinalpooApplication.class.getResource("/hotel-png-9.png"));

			int choice = JOptionPane.showOptionDialog(null, "Por favor selecciona una opción y continua tu proceso de registro ^.^",
					"Bienvenidos a la App Hotel Mis Fantasias!! ", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
					icon, options, options[0]);

			// Procesar la opción seleccionada
			switch (choice) {
				case 0: // Consultar Información hotel
					//mostrar la información del hotel

					hotel.mostrarDatosHotel();
					break;
				case 1: // Consultar Habitación
					//  mostrar la información de las habitaciones disponibles
					habitacion.mostrarhabitaciones();

					break;
				case 2: // Consultar Cliente
					// mostrar la información de los clientes
					cliente.mostrarClientes();

					break;
				case 3: // Consultar Reserva
					// mostrar la información de las reservas
					reserva.mostrarReservas();

					break;
				case 4: // Consultar Huéspedes
					// mostrar la información de los huéspedes
					huespedes.mostrarHuespedes();

					break;
				case 5: // Consultar de pago
					// mostrar la información de las transacciones de pago
					pago.mostrarPagos();


					break;
				case 6: // Salir
					JOptionPane.showMessageDialog(null, "¡Hasta luego!");
					return; // Terminar el programa
				default:
					JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
					break;
			}
		}
	}

}
