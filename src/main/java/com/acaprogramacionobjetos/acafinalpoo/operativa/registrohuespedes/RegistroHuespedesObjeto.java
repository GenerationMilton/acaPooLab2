package com.acaprogramacionobjetos.acafinalpoo.operativa.registrohuespedes;

public class RegistroHuespedesObjeto {

    public String codigoReservaObjeto;
    public String codigoHuespedObjeto;
    public int cantidadPersonasObjeto;
    public String tipoHabitacionObjeto;
    public String fechaLlegadaObjeto;
    public String fechaSalidaObjeto;

    public RegistroHuespedesObjeto(String codigoReservaObjeto, String codigoHuespedObjeto, int cantidadPersonasObjeto, String tipoHabitacionObjeto, String fechaLlegadaObjeto, String fechaSalidaObjeto) {
        this.codigoReservaObjeto = codigoReservaObjeto;
        this.codigoHuespedObjeto = codigoHuespedObjeto;
        this.cantidadPersonasObjeto = cantidadPersonasObjeto;
        this.tipoHabitacionObjeto = tipoHabitacionObjeto;
        this.fechaLlegadaObjeto = fechaLlegadaObjeto;
        this.fechaSalidaObjeto = fechaSalidaObjeto;
    }

    public String getCodigoReservaObjeto() {
        return codigoReservaObjeto;
    }

    public void setCodigoReservaObjeto(String codigoReservaObjeto) {
        this.codigoReservaObjeto = codigoReservaObjeto;
    }

    public String getCodigoHuespedObjeto() {
        return codigoHuespedObjeto;
    }

    public void setCodigoHuespedObjeto(String codigoHuespedObjeto) {
        this.codigoHuespedObjeto = codigoHuespedObjeto;
    }

    public int getCantidadPersonasObjeto() {
        return cantidadPersonasObjeto;
    }

    public void setCantidadPersonasObjeto(int cantidadPersonasObjeto) {
        this.cantidadPersonasObjeto = cantidadPersonasObjeto;
    }

    public String getTipoHabitacionObjeto() {
        return tipoHabitacionObjeto;
    }

    public void setTipoHabitacionObjeto(String tipoHabitacionObjeto) {
        this.tipoHabitacionObjeto = tipoHabitacionObjeto;
    }

    public String getFechaLlegadaObjeto() {
        return fechaLlegadaObjeto;
    }

    public void setFechaLlegadaObjeto(String fechaLlegadaObjeto) {
        this.fechaLlegadaObjeto = fechaLlegadaObjeto;
    }

    public String getFechaSalidaObjeto() {
        return fechaSalidaObjeto;
    }

    public void setFechaSalidaObjeto(String fechaSalidaObjeto) {
        this.fechaSalidaObjeto = fechaSalidaObjeto;
    }
}
