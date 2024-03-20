package com.acaprogramacionobjetos.acafinalpoo.operativa.reserva;

public class ReservaObjeto {

    public String codigoHuespedObjeto;
    public String codigoReservaObjeto;
    public String codigoHabitacionObjeto;
    public String tipoHabitacionObjeto;
    public String fechaIngresoObjeto;
    public String fechaSalidaObjeto;
    public int nochesReservadasObjeto;
    public int cantidadPersonasObjeto;


    public ReservaObjeto(String codigoHuespedObjeto, String codigoReservaObjeto, String codigoHabitacionObjeto, String tipoHabitacionObjeto, String fechaIngresoObjeto, String fechaSalidaObjeto, int nochesReservadasObjeto, int cantidadPersonasObjeto) {
        this.codigoHuespedObjeto = codigoHuespedObjeto;
        this.codigoReservaObjeto = codigoReservaObjeto;
        this.codigoHabitacionObjeto = codigoHabitacionObjeto;
        this.tipoHabitacionObjeto = tipoHabitacionObjeto;
        this.fechaIngresoObjeto = fechaIngresoObjeto;
        this.fechaSalidaObjeto = fechaSalidaObjeto;
        this.nochesReservadasObjeto = nochesReservadasObjeto;
        this.cantidadPersonasObjeto = cantidadPersonasObjeto;
    }

    public String getCodigoHuespedObjeto() {
        return codigoHuespedObjeto;
    }

    public void setCodigoHuespedObjeto(String codigoHuespedObjeto) {
        this.codigoHuespedObjeto = codigoHuespedObjeto;
    }

    public String getCodigoReservaObjeto() {
        return codigoReservaObjeto;
    }

    public void setCodigoReservaObjeto(String codigoReservaObjeto) {
        this.codigoReservaObjeto = codigoReservaObjeto;
    }

    public String getCodigoHabitacionObjeto() {
        return codigoHabitacionObjeto;
    }

    public void setCodigoHabitacionObjeto(String codigoHabitacionObjeto) {
        this.codigoHabitacionObjeto = codigoHabitacionObjeto;
    }

    public String getTipoHabitacionObjeto() {
        return tipoHabitacionObjeto;
    }

    public void setTipoHabitacionObjeto(String tipoHabitacionObjeto) {
        this.tipoHabitacionObjeto = tipoHabitacionObjeto;
    }

    public String getFechaIngresoObjeto() {
        return fechaIngresoObjeto;
    }

    public void setFechaIngresoObjeto(String fechaIngresoObjeto) {
        this.fechaIngresoObjeto = fechaIngresoObjeto;
    }

    public String getFechaSalidaObjeto() {
        return fechaSalidaObjeto;
    }

    public void setFechaSalidaObjeto(String fechaSalidaObjeto) {
        this.fechaSalidaObjeto = fechaSalidaObjeto;
    }

    public int getNochesReservadasObjeto() {
        return nochesReservadasObjeto;
    }

    public void setNochesReservadasObjeto(int nochesReservadasObjeto) {
        this.nochesReservadasObjeto = nochesReservadasObjeto;
    }

    public int getCantidadPersonasObjeto() {
        return cantidadPersonasObjeto;
    }

    public void setCantidadPersonasObjeto(int cantidadPersonasObjeto) {
        this.cantidadPersonasObjeto = cantidadPersonasObjeto;
    }
}
