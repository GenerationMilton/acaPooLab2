package com.acaprogramacionobjetos.acafinalpoo.operativa.pago;

import com.acaprogramacionobjetos.acafinalpoo.funcional.AcafinalpooApplication;

import javax.swing.*;

public class Pago {

    PagoObjeto pago1 = new PagoObjeto(10001,100,100,"Milton","Rianos","Bogota","3003458785","noche",100000,200000,2,238000,38000);

    PagoObjeto pago2 = new PagoObjeto(20001,200,200,"Maria","Rianos","Medellin","3003328785","noche",200000,200000,1,238000,38000);

    PagoObjeto pago3 = new PagoObjeto(30001,300,300,"Marta","Munoz","Cali","3003778754","noche",500000,1000000,2,1190000,190000);

    PagoObjeto pago4 = new PagoObjeto(40002,400,400,"Esteban","Rianos","Cucuta","30034432785","noche",100000,200000,2,238000,38000);

    PagoObjeto pago5 = new PagoObjeto(50003,500,500,"Michale","Perez","Ibague","3003142295","noche",700000,2100000,3,2499000,399000);



    public void mostrarDatosPago1() {
        JOptionPane.showMessageDialog(
                null,
                "\nPago cliente 1"+
                        "\nNumero ticket pago: "+ pago1.getNumeroTicketPagoObjeto()+
                        "\nCodigo Reserva:" + pago1.getCodigoReservaObjeto() +
                        "\nCodigo Huesped: " + pago1.getCodigoHuespedObjeto() +
                        "\nNombre Cliente:   : " + pago1.getNombreClienteObjeto() +
                        "\nApellido Cliente: " + pago1.getApellidoClienteObjeto() +
                        "\nDireccion Cliente: " + pago1.getDireccionClienteObjeto() +
                        "\nTelefono Cliente:  " + pago1.getTelefonoClienteObjeto() +
                        "\nConcepto Cliente: " + pago1.getConceptoObjeto() +
                         "\nValor Noche: " + pago1.getValorNocheObjeto() +
                        "\nNoches Reservadas: " + pago1.getNochesReservadasObjeto() +
                        "\nSubtotal: " + pago1.getSubTotalObjeto() +
                        "\nIva(19%): " + pago1.getIvaObjeto() +
                        "\nCosto total: " + pago1.getCostoTotalObjeto()

        );
    }

    public void mostrarDatosPago2() {
        JOptionPane.showMessageDialog(
                null,
                "\nPago cliente 2"+
                        "\nNumero ticket pago: "+ pago2.getNumeroTicketPagoObjeto()+
                        "\nCodigo Reserva:" + pago2.getCodigoReservaObjeto() +
                        "\nCodigo Huesped: " + pago2.getCodigoHuespedObjeto() +
                        "\nNombre Cliente:   : " + pago2.getNombreClienteObjeto() +
                        "\nApellido Cliente: " + pago2.getApellidoClienteObjeto() +
                        "\nDireccion Cliente: " + pago2.getDireccionClienteObjeto() +
                        "\nTelefono Cliente:  " + pago2.getTelefonoClienteObjeto() +
                        "\nConcepto Cliente: " + pago2.getConceptoObjeto() +
                        "\nValor Noche: " + pago2.getValorNocheObjeto() +
                        "\nNoches Reservadas: " + pago2.getNochesReservadasObjeto() +
                        "\nSubtotal: " + pago2.getSubTotalObjeto() +
                        "\nIva(19%): " + pago2.getIvaObjeto() +
                        "\nCosto total: " + pago2.getCostoTotalObjeto()

        );
    }


    public void mostrarDatosPago3() {
        JOptionPane.showMessageDialog(
                null,
                "\nPago cliente 3"+
                        "\nNumero ticket pago: "+ pago3.getNumeroTicketPagoObjeto()+
                        "\nCodigo Reserva:" + pago3.getCodigoReservaObjeto() +
                        "\nCodigo Huesped: " + pago3.getCodigoHuespedObjeto() +
                        "\nNombre Cliente:   : " + pago3.getNombreClienteObjeto() +
                        "\nApellido Cliente: " + pago3.getApellidoClienteObjeto() +
                        "\nDireccion Cliente: " + pago3.getDireccionClienteObjeto() +
                        "\nTelefono Cliente:  " + pago3.getTelefonoClienteObjeto() +
                        "\nConcepto Cliente: " + pago3.getConceptoObjeto() +
                        "\nValor Noche: " + pago3.getValorNocheObjeto() +
                        "\nNoches Reservadas: " + pago3.getNochesReservadasObjeto() +
                        "\nSubtotal: " + pago3.getSubTotalObjeto() +
                        "\nIva(19%): " + pago3.getIvaObjeto() +
                        "\nCosto total: " + pago3.getCostoTotalObjeto()

        );
    }

    public void mostrarDatosPago4() {
        JOptionPane.showMessageDialog(
                null,
                "\nPago cliente 4"+
                        "\nNumero ticket pago: "+ pago4.getNumeroTicketPagoObjeto()+
                        "\nCodigo Reserva:" + pago4.getCodigoReservaObjeto() +
                        "\nCodigo Huesped: " + pago4.getCodigoHuespedObjeto() +
                        "\nNombre Cliente:   : " + pago4.getNombreClienteObjeto() +
                        "\nApellido Cliente: " + pago4.getApellidoClienteObjeto() +
                        "\nDireccion Cliente: " + pago4.getDireccionClienteObjeto() +
                        "\nTelefono Cliente:  " + pago4.getTelefonoClienteObjeto() +
                        "\nConcepto Cliente: " + pago4.getConceptoObjeto() +
                        "\nValor Noche: " + pago4.getValorNocheObjeto() +
                        "\nNoches Reservadas: " + pago4.getNochesReservadasObjeto() +
                        "\nSubtotal: " + pago4.getSubTotalObjeto() +
                        "\nIva(19%): " + pago4.getIvaObjeto() +
                        "\nCosto total: " + pago4.getCostoTotalObjeto()

        );
    }

    public void mostrarDatosPago5() {
        JOptionPane.showMessageDialog(
                null,
                "\nPago cliente 5"+
                        "\nNumero ticket pago: "+ pago5.getNumeroTicketPagoObjeto()+
                        "\nCodigo Reserva:" + pago5.getCodigoReservaObjeto() +
                        "\nCodigo Huesped: " + pago5.getCodigoHuespedObjeto() +
                        "\nNombre Cliente:   : " + pago5.getNombreClienteObjeto() +
                        "\nApellido Cliente: " + pago5.getApellidoClienteObjeto() +
                        "\nDireccion Cliente: " + pago5.getDireccionClienteObjeto() +
                        "\nTelefono Cliente:  " + pago5.getTelefonoClienteObjeto() +
                        "\nConcepto Cliente: " + pago5.getConceptoObjeto() +
                        "\nValor Noche: " + pago5.getValorNocheObjeto() +
                        "\nNoches Reservadas: " + pago5.getNochesReservadasObjeto() +
                        "\nSubtotal: " + pago5.getSubTotalObjeto() +
                        "\nIva(19%): " + pago5.getIvaObjeto() +
                        "\nCosto total: " + pago5.getCostoTotalObjeto()

        );
    }


    public void mostrarPagos() {

        Pago pago = new Pago();

        // Ciclo para mostrar el menú y procesar las opciones
        while (true) {
            // Mostrar el menú de opciones
            String[] options = {
                    "Consultar Pago 1",
                    "Consultar Pago 2",
                    "Consultar Pago 3",
                    "Consultar Pago 4",
                    "Consultar Pago 5",
                    "Salir"
            };
            ImageIcon icon = new ImageIcon(AcafinalpooApplication.class.getResource("/pago.png"));

            int choice = JOptionPane.showOptionDialog(null, "Selecciona una opción:",
                    "Seleccion de pago", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    icon, options, options[0]);

            // Procesar la opción seleccionada
            switch (choice) {
                case 0: // Consultar Pago 1

                    pago.mostrarDatosPago1();
                    break;
                case 1: // Consultar Pago 2
                    pago.mostrarDatosPago2();
                    break;
                case 2: // Consultar Pago 3
                    pago.mostrarDatosPago3();
                    break;
                case 3: // Consultar Pago 4
                    pago.mostrarDatosPago4();
                    break;
                case 4: // Consultar Pago 5
                    pago.mostrarDatosPago5();
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
