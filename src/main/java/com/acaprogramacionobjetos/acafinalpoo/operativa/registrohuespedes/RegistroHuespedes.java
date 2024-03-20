package com.acaprogramacionobjetos.acafinalpoo.operativa.registrohuespedes;

import com.acaprogramacionobjetos.acafinalpoo.funcional.AcafinalpooApplication;

import javax.swing.*;

public class RegistroHuespedes {


    RegistroHuespedesObjeto registroHuespedes1 = new RegistroHuespedesObjeto("1001","101",2,"familiar","15-03-2024","12-03-2024");
    RegistroHuespedesObjeto registroHuespedes2 = new RegistroHuespedesObjeto("2001","201",4,"familiar","10-03-2024","20-03-2024");
    RegistroHuespedesObjeto registroHuespedes3 = new RegistroHuespedesObjeto("3001","301",3,"familiar","05-03-2024","12-03-2024");

    RegistroHuespedesObjeto registroHuespedes4 = new RegistroHuespedesObjeto("4001","401",1,"familiar","12-03-2024","15-03-2024");

    RegistroHuespedesObjeto registroHuespedes5 = new RegistroHuespedesObjeto("5001","501",5,"familiar","11-03-2024","20-03-2024");


    RegistroHuespedesObjeto registroHuespedes6 = new RegistroHuespedesObjeto("6001","601",5,"familiar","01-03-2024","05-03-2024");
    RegistroHuespedesObjeto registroHuespedes7 = new RegistroHuespedesObjeto("7001","701",4,"familiar","14-03-2024","20-03-2024");
    RegistroHuespedesObjeto registroHuespedes8 = new RegistroHuespedesObjeto("8001","801",2,"familiar","15-03-2024","20-03-2024");
    RegistroHuespedesObjeto registroHuespedes9 = new RegistroHuespedesObjeto("9001","901",1,"familiar","20-03-2024","25-03-2024");
    RegistroHuespedesObjeto registroHuespedes10 = new RegistroHuespedesObjeto("10001","1001",5,"familiar","11-03-2024","20-03-2024");
    public void mostrarDatosHuespedes1() {
        JOptionPane.showMessageDialog(
                null,
                "\nRegistro Huespedes 1"+
                        "\ncodigo reserva: " + registroHuespedes1.getCodigoReservaObjeto() +
                        "\ncodigo huesped: " + registroHuespedes1.getCodigoHuespedObjeto()+
                        "\ncantidad personas : " + registroHuespedes1.getCantidadPersonasObjeto() +
                        "\nhabitacion: " + registroHuespedes1.getTipoHabitacionObjeto() +
                        "\nfecha llegada: " + registroHuespedes1.getFechaLlegadaObjeto() +
                        "\nfecha salida: " + registroHuespedes1.getFechaSalidaObjeto()

        );
    }

    public void mostrarDatosHuespedes2() {
        JOptionPane.showMessageDialog(
                null,
                "\nRegistro Huespedes 2"+
                        "\ncodigo reserva: " + registroHuespedes2.getCodigoReservaObjeto() +
                        "\ncodigo huesped: " + registroHuespedes2.getCodigoHuespedObjeto()+
                        "\ncantidad personas : " + registroHuespedes2.getCantidadPersonasObjeto() +
                        "\nhabitacion: " + registroHuespedes2.getTipoHabitacionObjeto() +
                        "\nfecha llegada: " + registroHuespedes2.getFechaLlegadaObjeto() +
                        "\nfecha salida: " + registroHuespedes2.getFechaSalidaObjeto()

        );
    }

    public void mostrarDatosHuespedes3() {
        JOptionPane.showMessageDialog(
                null,
                "\nRegistro Huespedes 3"+
                        "\ncodigo reserva: " + registroHuespedes3.getCodigoReservaObjeto() +
                        "\ncodigo huesped: " + registroHuespedes3.getCodigoHuespedObjeto()+
                        "\ncantidad personas : " + registroHuespedes3.getCantidadPersonasObjeto() +
                        "\nhabitacion: " + registroHuespedes3.getTipoHabitacionObjeto() +
                        "\nfecha llegada: " + registroHuespedes3.getFechaLlegadaObjeto() +
                        "\nfecha salida: " + registroHuespedes3.getFechaSalidaObjeto()

        );
    }

    public void mostrarDatosHuespedes4() {
        JOptionPane.showMessageDialog(
                null,
                "\nRegistro Huespedes 4"+
                        "\ncodigo reserva: " + registroHuespedes4.getCodigoReservaObjeto() +
                        "\ncodigo huesped: " + registroHuespedes4.getCodigoHuespedObjeto()+
                        "\ncantidad personas : " + registroHuespedes4.getCantidadPersonasObjeto() +
                        "\nhabitacion: " + registroHuespedes4.getTipoHabitacionObjeto() +
                        "\nfecha llegada: " + registroHuespedes4.getFechaLlegadaObjeto() +
                        "\nfecha salida: " + registroHuespedes4.getFechaSalidaObjeto()

        );
    }

    public void mostrarDatosHuespedes5() {
        JOptionPane.showMessageDialog(
                null,
                "\nRegistro Huespedes 5"+
                        "\ncodigo reserva: " + registroHuespedes5.getCodigoReservaObjeto() +
                        "\ncodigo huesped: " + registroHuespedes5.getCodigoHuespedObjeto()+
                        "\ncantidad personas : " + registroHuespedes5.getCantidadPersonasObjeto() +
                        "\nhabitacion: " + registroHuespedes5.getTipoHabitacionObjeto() +
                        "\nfecha llegada: " + registroHuespedes5.getFechaLlegadaObjeto() +
                        "\nfecha salida: " + registroHuespedes5.getFechaSalidaObjeto()

        );
    }

    public void mostrarDatosHuespedes6() {
        JOptionPane.showMessageDialog(
                null,
                "\nRegistro Huespedes 6"+
                        "\ncodigo reserva: " + registroHuespedes5.getCodigoReservaObjeto() +
                        "\ncodigo huesped: " + registroHuespedes5.getCodigoHuespedObjeto()+
                        "\ncantidad personas : " + registroHuespedes5.getCantidadPersonasObjeto() +
                        "\nhabitacion: " + registroHuespedes5.getTipoHabitacionObjeto() +
                        "\nfecha llegada: " + registroHuespedes5.getFechaLlegadaObjeto() +
                        "\nfecha salida: " + registroHuespedes5.getFechaSalidaObjeto()

        );
    }

    public void mostrarDatosHuespedes7() {
        JOptionPane.showMessageDialog(
                null,
                "\nRegistro Huespedes 7"+
                        "\ncodigo reserva: " + registroHuespedes5.getCodigoReservaObjeto() +
                        "\ncodigo huesped: " + registroHuespedes5.getCodigoHuespedObjeto()+
                        "\ncantidad personas : " + registroHuespedes5.getCantidadPersonasObjeto() +
                        "\nhabitacion: " + registroHuespedes5.getTipoHabitacionObjeto() +
                        "\nfecha llegada: " + registroHuespedes5.getFechaLlegadaObjeto() +
                        "\nfecha salida: " + registroHuespedes5.getFechaSalidaObjeto()

        );
    }

    public void mostrarDatosHuespedes8() {
        JOptionPane.showMessageDialog(
                null,
                "\nRegistro Huespedes 8"+
                        "\ncodigo reserva: " + registroHuespedes5.getCodigoReservaObjeto() +
                        "\ncodigo huesped: " + registroHuespedes5.getCodigoHuespedObjeto()+
                        "\ncantidad personas : " + registroHuespedes5.getCantidadPersonasObjeto() +
                        "\nhabitacion: " + registroHuespedes5.getTipoHabitacionObjeto() +
                        "\nfecha llegada: " + registroHuespedes5.getFechaLlegadaObjeto() +
                        "\nfecha salida: " + registroHuespedes5.getFechaSalidaObjeto()

        );
    }

    public void mostrarDatosHuespedes9() {
        JOptionPane.showMessageDialog(
                null,
                "\nRegistro Huespedes 9"+
                        "\ncodigo reserva: " + registroHuespedes5.getCodigoReservaObjeto() +
                        "\ncodigo huesped: " + registroHuespedes5.getCodigoHuespedObjeto()+
                        "\ncantidad personas : " + registroHuespedes5.getCantidadPersonasObjeto() +
                        "\nhabitacion: " + registroHuespedes5.getTipoHabitacionObjeto() +
                        "\nfecha llegada: " + registroHuespedes5.getFechaLlegadaObjeto() +
                        "\nfecha salida: " + registroHuespedes5.getFechaSalidaObjeto()

        );
    }

    public void mostrarDatosHuespedes10() {
        JOptionPane.showMessageDialog(
                null,
                "\nRegistro Huespedes 10"+
                        "\ncodigo reserva: " + registroHuespedes5.getCodigoReservaObjeto() +
                        "\ncodigo huesped: " + registroHuespedes5.getCodigoHuespedObjeto()+
                        "\ncantidad personas : " + registroHuespedes5.getCantidadPersonasObjeto() +
                        "\nhabitacion: " + registroHuespedes5.getTipoHabitacionObjeto() +
                        "\nfecha llegada: " + registroHuespedes5.getFechaLlegadaObjeto() +
                        "\nfecha salida: " + registroHuespedes5.getFechaSalidaObjeto()

        );
    }

    public void mostrarHuespedes() {

        RegistroHuespedes huespedes = new RegistroHuespedes();

        // Ciclo para mostrar el menú y procesar las opciones
        while (true) {
            // Mostrar el menú de opciones
            String[] options = {
                    "Consultar Huesped 1",
                    "Consultar Huesped 2",
                    "Consultar Huesped 3",
                    "Consultar Huesped 4",
                    "Consultar Huesped 5",
                    "Consultar Huesped 6",
                    "Consultar Huesped 7",
                    "Consultar Huesped 8",
                    "Consultar Huesped 9",
                    "Consultar Huesped 10",
                    "Salir"
            };

            ImageIcon icon = new ImageIcon(AcafinalpooApplication.class.getResource("/huespedes.png"));
            int choice = JOptionPane.showOptionDialog(null, "Selecciona una opción:",
                    "Seleccion de huespedes", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    icon, options, options[0]);

            // Procesar la opción seleccionada
            switch (choice) {
                case 0: // Consultar Huespedes 1

                    huespedes.mostrarDatosHuespedes1();
                    break;
                case 1: // Consultar Huespedes 2
                    huespedes.mostrarDatosHuespedes2();
                    break;
                case 2: // Consultar Huespedes 3
                    huespedes.mostrarDatosHuespedes3();
                    break;
                case 3: // Consultar Huespedes 4
                    huespedes.mostrarDatosHuespedes4();
                    break;
                case 4: // Consultar Huespedes 5
                    huespedes.mostrarDatosHuespedes5();
                    break;
                case 5: // Consultar Huespedes 6
                    huespedes.mostrarDatosHuespedes6();
                    break;
                case 6: // Consultar Huespedes 7
                    huespedes.mostrarDatosHuespedes7();
                    break;
                case 7: // Consultar Huespedes 8
                    huespedes.mostrarDatosHuespedes8();
                    break;
                case 8: // Consultar Huespedes 9
                    huespedes.mostrarDatosHuespedes9();
                    break;
                case 9: // Consultar Huespedes 10
                    huespedes.mostrarDatosHuespedes10();
                    break;
                case 10: // Salir
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    return; // Terminar el programa
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }

    }
}
