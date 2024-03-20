package com.acaprogramacionobjetos.acafinalpoo.operativa.habitacion;

public class HabitacionObjeto {

    public int codigoObjeto;
    public String caracteristicasObjeto;
    public String tipoHabitacionObjeto;
    public String numeroHabitacionObjeto;
    public double precioObjeto;
    public int numeroPisoObjeto;

    public HabitacionObjeto(int codigoObjeto, String caracteristicasObjeto, String tipoHabitacionObjeto, String numeroHabitacionObjeto, double precioObjeto, int numeroPisoObjeto) {
        this.codigoObjeto = codigoObjeto;
        this.caracteristicasObjeto = caracteristicasObjeto;
        this.tipoHabitacionObjeto = tipoHabitacionObjeto;
        this.numeroHabitacionObjeto = numeroHabitacionObjeto;
        this.precioObjeto = precioObjeto;
        this.numeroPisoObjeto = numeroPisoObjeto;
    }

    public int getCodigoObjeto() {
        return codigoObjeto;
    }

    public void setCodigoObjeto(int codigoObjeto) {
        this.codigoObjeto = codigoObjeto;
    }

    public String getCaracteristicasObjeto() {
        return caracteristicasObjeto;
    }

    public void setCaracteristicasObjeto(String caracteristicasObjeto) {
        this.caracteristicasObjeto = caracteristicasObjeto;
    }

    public String getTipoHabitacionObjeto() {
        return tipoHabitacionObjeto;
    }

    public void setTipoHabitacionObjeto(String tipoHabitacionObjeto) {
        this.tipoHabitacionObjeto = tipoHabitacionObjeto;
    }

    public String getNumeroHabitacionObjeto() {
        return numeroHabitacionObjeto;
    }

    public void setNumeroHabitacionObjeto(String numeroHabitacionObjeto) {
        this.numeroHabitacionObjeto = numeroHabitacionObjeto;
    }

    public double getPrecioObjeto() {
        return precioObjeto;
    }

    public void setPrecioObjeto(double precioObjeto) {
        this.precioObjeto = precioObjeto;
    }

    public int getNumeroPisoObjeto() {
        return numeroPisoObjeto;
    }

    public void setNumeroPisoObjeto(int numeroPisoObjeto) {
        this.numeroPisoObjeto = numeroPisoObjeto;
    }
}
