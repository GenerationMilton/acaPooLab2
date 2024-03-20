
package com.acaprogramacionobjetos.acafinalpoo.operativa.cliente;

import com.acaprogramacionobjetos.acafinalpoo.funcional.AcafinalpooApplication;

import javax.swing.*;

public class Cliente {


    ClienteObjeto cliente1 = new ClienteObjeto(1001,"Milton", "Munoz","Calle 48 a sur 30");
    ClienteObjeto cliente2 = new ClienteObjeto(1002,"Jhon", "Munoz","Calle 50 a sur 10");
    ClienteObjeto cliente3 = new ClienteObjeto(1002,"Hilda", "Rianos","Calle 41 a sur 20");
    ClienteObjeto cliente4= new ClienteObjeto(1004,"Esteban", "Perez","Calle 50 a sur 50");
    ClienteObjeto cliente5 = new ClienteObjeto(1005,"Jhon", "Perez","Calle 60 a sur 50");

    public void mostrarDatosCliente1() {
        JOptionPane.showMessageDialog(
                null,
                "\nCliente Numero 1"+
                        "\ncodigo: " + cliente1.getCodigoClienteObjeto() +
                        "\nnombre: " + cliente1.getNombreClienteObjeto() +
                        "\napellido : " + cliente1.getApellidoClienteObjeto() +
                        "\ndireccion: " + cliente1.getDireccionClienteObjeto()

        );
    }

    public void mostrarDatosCliente2() {
        JOptionPane.showMessageDialog(
                null,
                "\nCliente Numero 2"+
                        "\ncodigo: " + cliente2.getCodigoClienteObjeto() +
                        "\nnombre: " + cliente2.getNombreClienteObjeto() +
                        "\napellido : " + cliente2.getApellidoClienteObjeto() +
                        "\ndireccion: " + cliente2.getDireccionClienteObjeto()

        );
    }


    public void mostrarDatosCliente3() {
        JOptionPane.showMessageDialog(
                null,
                "\nCliente Numero 3"+
                        "\ncodigo: " + cliente3.getCodigoClienteObjeto() +
                        "\nnombre: " + cliente3.getNombreClienteObjeto() +
                        "\napellido : " + cliente3.getApellidoClienteObjeto() +
                        "\ndireccion: " + cliente3.getDireccionClienteObjeto()

        );
    }


    public void mostrarDatosCliente4() {
        JOptionPane.showMessageDialog(
                null,
                "\nCliente Numero 4"+
                        "\ncodigo: " + cliente4.getCodigoClienteObjeto() +
                        "\nnombre: " + cliente4.getNombreClienteObjeto() +
                        "\napellido : " + cliente4.getApellidoClienteObjeto() +
                        "\ndireccion: " + cliente4.getDireccionClienteObjeto()

        );
    }


    public void mostrarDatosCliente5() {
        JOptionPane.showMessageDialog(
                null,
                "\nCliente Numero 5"+
                        "\ncodigo: " + cliente5.getCodigoClienteObjeto() +
                        "\nnombre: " + cliente5.getNombreClienteObjeto() +
                        "\napellido : " + cliente5.getApellidoClienteObjeto() +
                        "\ndireccion: " + cliente5.getDireccionClienteObjeto()

        );
    }

    public void mostrarClientes() {

        Cliente cliente = new Cliente();

        // Ciclo para mostrar el menú y procesar las opciones
        while (true) {
            // Mostrar el menú de opciones
            String[] options = {
                    "Consultar Cliente 1",
                    "Consultar Cliente 2",
                    "Consultar Cliente 3",
                    "Consultar Cliente 4",
                    "Consultar Cliente 5",
                    "Salir"
            };

            ImageIcon icon = new ImageIcon(AcafinalpooApplication.class.getResource("/persona.png"));
            int choice = JOptionPane.showOptionDialog(null, "Selecciona una opción para el cliente:",
                    "Seleccion de clientes", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    icon, options, options[0]);

            // Procesar la opción seleccionada
            switch (choice) {
                case 0: // Consultar Clientes 1

                    cliente.mostrarDatosCliente1();
                    break;
                case 1: // Consultar Clientes 2
                    cliente.mostrarDatosCliente2();
                    break;
                case 2: // Consultar Clientes 3
                    cliente.mostrarDatosCliente3();
                    break;
                case 3: // Consultar Clientes 4
                    cliente.mostrarDatosCliente4();
                    break;
                case 4: // Consultar Clientes 5
                    cliente.mostrarDatosCliente5();
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
