package com.acaprogramacionobjetos.acafinalpoo.operativa.reserva;

import com.acaprogramacionobjetos.acafinalpoo.operativa.habitacion.Habitacion;

import javax.swing.*;

public class Reserva {


    ReservaObjeto reserva1 = new ReservaObjeto("100","1001","20","king","20-04-2024","25-04-2024",5,4);

    ReservaObjeto reserva2 = new ReservaObjeto("200","2001","30","small","10-04-2024","11-04-2024",1,2);

    ReservaObjeto reserva3 = new ReservaObjeto("300","3001","40","medium","05-04-2024","10-04-2024",5,3);

    ReservaObjeto reserva4 = new ReservaObjeto("400","4001","50","small","02-04-2024","05-04-2024",3,1);

    ReservaObjeto reserva5 = new ReservaObjeto("500","5001","60","king","01-04-2024","05-04-2024",4,2);


    public void mostrarDatosReserva1() {
        JOptionPane.showMessageDialog(
                null,
                "\nReserva Huespedes 1"+
                        "\nCodigo huesped: "+ reserva1.getCodigoHuespedObjeto()+
                        "\nCodigo reserva: " + reserva1.getCodigoReservaObjeto() +
                        "\nCodigo habitacion: " + reserva1.getCodigoHabitacionObjeto() +
                        "\nTipo habitacion  : " + reserva1.getTipoHabitacionObjeto() +
                        "\nFecha ingreso: " + reserva1.getFechaIngresoObjeto() +
                        "\nFecha Salida: " + reserva1.getFechaSalidaObjeto() +
                        "\nNoches Reservadas: " + reserva1.getNochesReservadasObjeto() +
                        "\nCantidad de Personas: " + reserva1.getNochesReservadasObjeto()

        );
    }

    public void mostrarDatosReserva2() {
        JOptionPane.showMessageDialog(
                null,
                "\nReserva Huespedes 2"+
                        "\nCodigo huesped: "+ reserva2.getCodigoHuespedObjeto()+
                        "\nCodigo reserva: " + reserva2.getCodigoReservaObjeto() +
                        "\nCodigo habitacion: " + reserva2.getCodigoHabitacionObjeto() +
                        "\nTipo habitacion  : " + reserva2.getTipoHabitacionObjeto() +
                        "\nFecha ingreso: " + reserva2.getFechaIngresoObjeto() +
                        "\nFecha Salida: " + reserva2.getFechaSalidaObjeto() +
                        "\nNoches Reservadas: " + reserva2.getNochesReservadasObjeto() +
                        "\nCantidad de Personas: " + reserva2.getNochesReservadasObjeto()

        );
    }

    public void mostrarDatosReserva3() {
        JOptionPane.showMessageDialog(
                null,
                "\nReserva Huespedes 3"+
                        "\nCodigo huesped: "+ reserva3.getCodigoHuespedObjeto()+
                        "\nCodigo reserva: " + reserva3.getCodigoReservaObjeto() +
                        "\nCodigo habitacion: " + reserva3.getCodigoHabitacionObjeto() +
                        "\nTipo habitacion  : " + reserva3.getTipoHabitacionObjeto() +
                        "\nFecha ingreso: " + reserva3.getFechaIngresoObjeto() +
                        "\nFecha Salida: " + reserva3.getFechaSalidaObjeto() +
                        "\nNoches Reservadas: " + reserva3.getNochesReservadasObjeto() +
                        "\nCantidad de Personas: " + reserva3.getNochesReservadasObjeto()

        );
    }

    public void mostrarDatosReserva4() {
        JOptionPane.showMessageDialog(
                null,
                "\nReserva Huespedes 4"+
                        "\nCodigo huesped: "+ reserva4.getCodigoHuespedObjeto()+
                        "\nCodigo reserva: " + reserva4.getCodigoReservaObjeto() +
                        "\nCodigo habitacion: " + reserva4.getCodigoHabitacionObjeto() +
                        "\nTipo habitacion  : " + reserva4.getTipoHabitacionObjeto() +
                        "\nFecha ingreso: " + reserva4.getFechaIngresoObjeto() +
                        "\nFecha Salida: " + reserva4.getFechaSalidaObjeto() +
                        "\nNoches Reservadas: " + reserva4.getNochesReservadasObjeto() +
                        "\nCantidad de Personas: " + reserva4.getNochesReservadasObjeto()

        );
    }

    public void mostrarDatosReserva5() {
        JOptionPane.showMessageDialog(
                null,
                "\nReserva Huespedes 5"+
                        "\nCodigo huesped: "+ reserva5.getCodigoHuespedObjeto()+
                        "\nCodigo reserva: " + reserva5.getCodigoReservaObjeto() +
                        "\nCodigo habitacion: " + reserva5.getCodigoHabitacionObjeto() +
                        "\nTipo habitacion  : " + reserva5.getTipoHabitacionObjeto() +
                        "\nFecha ingreso: " + reserva5.getFechaIngresoObjeto() +
                        "\nFecha Salida: " + reserva5.getFechaSalidaObjeto() +
                        "\nNoches Reservadas: " + reserva5.getNochesReservadasObjeto() +
                        "\nCantidad de Personas: " + reserva5.getNochesReservadasObjeto()

        );
    }


    public void mostrarReservas() {

        Reserva reserva=new Reserva();



        // Ciclo para mostrar el menú y procesar las opciones
        while (true) {
            // Mostrar el menú de opciones
            String[] options = {
                    "Consultar Reserva 1",
                    "Consultar Reserva 2",
                    "Consultar Reserva 3",
                    "Consultar Reserva 4",
                    "Consultar Reserva 5",
                    "Salir"
            };

            ImageIcon icon2 = new ImageIcon(Habitacion.class.getResource("/reserva.png"));
            int choice = JOptionPane.showOptionDialog(null, "Selecciona una opción de reserva:",
                    "Selecciona de reservas", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    icon2, options, options[0]);

            // Procesar la opción seleccionada
            switch (choice) {
                case 0: // Consultar Reservas 1

                    reserva.mostrarDatosReserva1();
                    break;
                case 1: // Consultar Reservas 2
                    reserva.mostrarDatosReserva2();
                    break;
                case 2: // Consultar Reservas 3
                    reserva.mostrarDatosReserva3();
                    break;
                case 3: // Consultar Reservas 4
                    reserva.mostrarDatosReserva4();
                    break;
                case 4: // Consultar Reservas 5
                    reserva.mostrarDatosReserva5();
                    break;
                case 5: // Salir
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    return; // Terminar el programa
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }



    }
}
