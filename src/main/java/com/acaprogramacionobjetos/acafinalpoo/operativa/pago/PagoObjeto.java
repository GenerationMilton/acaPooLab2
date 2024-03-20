package com.acaprogramacionobjetos.acafinalpoo.operativa.pago;

public class PagoObjeto {

    public int numeroTicketPagoObjeto;
    public int codigoReservaObjeto;
    public int codigoHuespedObjeto;
    public String nombreClienteObjeto;
    public String apellidoClienteObjeto;
    public String direccionClienteObjeto;
    public String telefonoClienteObjeto;
    public String conceptoObjeto;
    public double valorNocheObjeto;
    public double subTotalObjeto;
    public double nochesReservadasObjeto;
    public double costoTotalObjeto;
    public double ivaObjeto;


    public PagoObjeto(int numeroTicketPagoObjeto, int codigoReservaObjeto, int codigoHuespedObjeto, String nombreClienteObjeto, String apellidoClienteObjeto, String direccionClienteObjeto, String telefonoClienteObjeto, String conceptoObjeto, double valorNocheObjeto, double subTotalObjeto, double nochesReservadasObjeto, double costoTotalObjeto, double ivaObjeto) {
        this.numeroTicketPagoObjeto = numeroTicketPagoObjeto;
        this.codigoReservaObjeto = codigoReservaObjeto;
        this.codigoHuespedObjeto = codigoHuespedObjeto;
        this.nombreClienteObjeto = nombreClienteObjeto;
        this.apellidoClienteObjeto = apellidoClienteObjeto;
        this.direccionClienteObjeto = direccionClienteObjeto;
        this.telefonoClienteObjeto = telefonoClienteObjeto;
        this.conceptoObjeto = conceptoObjeto;
        this.valorNocheObjeto = valorNocheObjeto;
        this.subTotalObjeto = subTotalObjeto;
        this.nochesReservadasObjeto = nochesReservadasObjeto;
        this.costoTotalObjeto = costoTotalObjeto;
        this.ivaObjeto = ivaObjeto;
    }

    public int getNumeroTicketPagoObjeto() {
        return numeroTicketPagoObjeto;
    }

    public void setNumeroTicketPagoObjeto(int numeroTicketPagoObjeto) {
        this.numeroTicketPagoObjeto = numeroTicketPagoObjeto;
    }

    public int getCodigoReservaObjeto() {
        return codigoReservaObjeto;
    }

    public void setCodigoReservaObjeto(int codigoReservaObjeto) {
        this.codigoReservaObjeto = codigoReservaObjeto;
    }

    public int getCodigoHuespedObjeto() {
        return codigoHuespedObjeto;
    }

    public void setCodigoHuespedObjeto(int codigoHuespedObjeto) {
        this.codigoHuespedObjeto = codigoHuespedObjeto;
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

    public String getTelefonoClienteObjeto() {
        return telefonoClienteObjeto;
    }

    public void setTelefonoClienteObjeto(String telefonoClienteObjeto) {
        this.telefonoClienteObjeto = telefonoClienteObjeto;
    }

    public String getConceptoObjeto() {
        return conceptoObjeto;
    }

    public void setConceptoObjeto(String conceptoObjeto) {
        this.conceptoObjeto = conceptoObjeto;
    }

    public double getValorNocheObjeto() {
        return valorNocheObjeto;
    }

    public void setValorNocheObjeto(double valorNocheObjeto) {
        this.valorNocheObjeto = valorNocheObjeto;
    }

    public double getSubTotalObjeto() {
        return subTotalObjeto;
    }

    public void setSubTotalObjeto(double subTotalObjeto) {
        this.subTotalObjeto = subTotalObjeto;
    }

    public double getNochesReservadasObjeto() {
        return nochesReservadasObjeto;
    }

    public void setNochesReservadasObjeto(double nochesReservadasObjeto) {
        this.nochesReservadasObjeto = nochesReservadasObjeto;
    }

    public double getCostoTotalObjeto() {
        return costoTotalObjeto;
    }

    public void setCostoTotalObjeto(double costoTotalObjeto) {
        this.costoTotalObjeto = costoTotalObjeto;
    }

    public double getIvaObjeto() {
        return ivaObjeto;
    }

    public void setIvaObjeto(double ivaObjeto) {
        this.ivaObjeto = ivaObjeto;
    }

}
