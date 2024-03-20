package com.acaprogramacionobjetos.acafinalpoo.operativa.hotel;

import javax.swing.*;
import java.util.Scanner;

public class Hotel {
    //captura
    String nombreHotel="Hotel Mis Fantasias";;

    String nit="1030532435-6";

    String paginaWeb="www.misfantasias.com";
    String  correo="misfantasias@test.com";
    String ciudad="bogota";
    String  direccion= "carrera 54A N54B 30 sur";
    String  sucursal="bogota";
    String  telefono="7852929";
    String capacidad="1000";

    //metodo para leer variables

    public void mostrarDatosHotel(){
        JOptionPane.showMessageDialog(
                null,
                "\nnombre hotel: " + nombreHotel+
                         "\nNit: " + nit +
                         "\nPagina web : " + paginaWeb +
                         "\nCorreo: "  + correo +
                         "\nCiudad: " + ciudad +
                        "\nSucursal : " + sucursal +
                        "\nDireccion : " + direccion +
                        "\nTelfono: " + telefono +
                        "\nCapacidad: " + capacidad
        );

    }



}
