
package com.acaprogramacionobjetos.acafinalpoo.operativa.cliente;

import com.acaprogramacionobjetos.acafinalpoo.funcional.AcafinalpooApplication;

import javax.swing.*;

public class ClienteObjeto {


    public int codigoClienteObjeto;

    public String nombreClienteObjeto;

    public String apellidoClienteObjeto;
    public String direccionClienteObjeto;

    public int getCodigoClienteObjeto() {
        return codigoClienteObjeto;
    }

    public void setCodigoClienteObjeto(int codigoClienteObjeto) {
        this.codigoClienteObjeto = codigoClienteObjeto;
    }

    public String getNombreClienteObjeto() {
        return nombreClienteObjeto;
    }

    public void setNombreClienteObjeto(String nombreClienteObjeto) {
        this.nombreClienteObjeto = nombreClienteObjeto;
    }

    public String getApellidoClienteObjeto() {
        return apellidoClienteObjeto;
    }

    public void setApellidoClienteObjeto(String apellidoClienteObjeto) {
        this.apellidoClienteObjeto = apellidoClienteObjeto;
    }

    public String getDireccionClienteObjeto() {
        return direccionClienteObjeto;
    }

    public void setDireccionClienteObjeto(String direccionClienteObjeto) {
        this.direccionClienteObjeto = direccionClienteObjeto;
    }


    public ClienteObjeto(int codigoClienteObjeto, String nombreClienteObjeto, String apellidoClienteObjeto, String direccionClienteObjeto) {
        this.codigoClienteObjeto = codigoClienteObjeto;
        this.nombreClienteObjeto = nombreClienteObjeto;
        this.apellidoClienteObjeto = apellidoClienteObjeto;
        this.direccionClienteObjeto = direccionClienteObjeto;
    }

}
