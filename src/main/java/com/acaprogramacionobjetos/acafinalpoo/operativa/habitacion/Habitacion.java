package com.acaprogramacionobjetos.acafinalpoo.operativa.habitacion;

import javax.swing.*;


public class Habitacion {

    //habitacion 1

    HabitacionObjeto habitacion1= new HabitacionObjeto(100,"small","familiar","101",1000.0,2);

    HabitacionObjeto habitacion2= new HabitacionObjeto(200,"medium","familiar","201",2000.0,3);
    HabitacionObjeto habitacion3= new HabitacionObjeto(300,"small","unipersonal","301",3000.0,4);
    HabitacionObjeto habitacion4= new HabitacionObjeto(400,"large","familiar","401",3000.0,5);
    HabitacionObjeto habitacion5= new HabitacionObjeto(500,"medium","matrimonial","501",5000.0,7);


    public void mostrarDatosHabitacion() {
        JOptionPane.showMessageDialog(
                null,
                        "\nHabitacion Numero uno"+
                                "\ncodigo : " + habitacion1.getCodigoObjeto() +
                                "\ncaracteristicas: " + habitacion1.getCaracteristicasObjeto() +
                                "\nTipo : " + habitacion1.getTipoHabitacionObjeto() +
                                "\nNumero habitacion: " + habitacion1.getNumeroHabitacionObjeto() +
                                "\nNumero piso: " + habitacion1.getNumeroPisoObjeto() +
                                "\nprecio : " + habitacion1.getPrecioObjeto()

        );
    }
    public void mostrarDatosHabitacion2() {
        JOptionPane.showMessageDialog(
                null,
                "\nHabitacion Numero dos"+
                        "\ncodigo : " + habitacion2.getCodigoObjeto() +
                        "\ncaracteristicas: " + habitacion2.getCaracteristicasObjeto() +
                        "\nTipo : " + habitacion2.getTipoHabitacionObjeto() +
                        "\nNumero habitacion: " + habitacion2.getNumeroHabitacionObjeto() +
                        "\nNumero piso: " + habitacion2.getNumeroPisoObjeto() +
                        "\nprecio : " + habitacion2.getPrecioObjeto()

        );
    }

    public void mostrarDatosHabitacion3() {
        JOptionPane.showMessageDialog(
                null,
                "\nHabitacion Numero tres"+
                        "\ncodigo : " + habitacion3.getCodigoObjeto() +
                        "\ncaracteristicas: " + habitacion3.getCaracteristicasObjeto() +
                        "\nTipo : " + habitacion3.getTipoHabitacionObjeto() +
                        "\nNumero habitacion: " + habitacion3.getNumeroHabitacionObjeto() +
                        "\nNumero piso: " + habitacion3.getNumeroPisoObjeto() +
                        "\nprecio : " + habitacion3.getPrecioObjeto()

        );
    }

    public void mostrarDatosHabitacion4() {
        JOptionPane.showMessageDialog(
                null,
                "\nHabitacion Numero cuatro"+
                        "\ncodigo : " + habitacion4.getCodigoObjeto() +
                        "\ncaracteristicas: " + habitacion4.getCaracteristicasObjeto() +
                        "\nTipo : " + habitacion4.getTipoHabitacionObjeto() +
                        "\nNumero habitacion: " + habitacion4.getNumeroHabitacionObjeto() +
                        "\nNumero piso: " + habitacion4.getNumeroPisoObjeto() +
                        "\nprecio : " + habitacion4.getPrecioObjeto()
        );
    }

    public void mostrarDatosHabitacion5() {
        JOptionPane.showMessageDialog(
                null,
                "\nHabitacion Numero cinco"+
                        "\ncodigo : " + habitacion5.getCodigoObjeto() +
                        "\ncaracteristicas: " + habitacion5.getCaracteristicasObjeto() +
                        "\nTipo : " + habitacion5.getTipoHabitacionObjeto() +
                        "\nNumero habitacion: " + habitacion5.getNumeroHabitacionObjeto() +
                        "\nNumero piso: " + habitacion5.getNumeroPisoObjeto() +
                        "\nprecio : " + habitacion5.getPrecioObjeto()
        );
    }



    public void mostrarhabitaciones() {

        Habitacion habitacion=new Habitacion();



            // Ciclo para mostrar el menú y procesar las opciones
            while (true) {
                // Mostrar el menú de opciones
                String[] options = {
                        "Consultar Habitación 1",
                        "Consultar Habitación 2",
                        "Consultar Habitación 3",
                        "Consultar Habitación 4",
                        "Consultar Habitación 5",
                        "Salir"
                };

                ImageIcon icon1 = new ImageIcon(Habitacion.class.getResource("/habitacion.png"));
                int choice = JOptionPane.showOptionDialog(null, "Selecciona una Habitacion:",
                        "Seleccion de habitaciones", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        icon1, options, options[0]);

                // Procesar la opción seleccionada
                switch (choice) {
                    case 0: // Consultar Habitación 1

                        habitacion.mostrarDatosHabitacion();
                        break;
                    case 1: // Consultar Habitación 1
                        habitacion.mostrarDatosHabitacion2();
                        break;
                    case 2: // Consultar Habitación 1
                        habitacion.mostrarDatosHabitacion3();
                        break;
                    case 3: // Consultar Habitación 1
                        habitacion.mostrarDatosHabitacion4();
                        break;
                    case 4: // Consultar Habitación 1
                        habitacion.mostrarDatosHabitacion5();
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
