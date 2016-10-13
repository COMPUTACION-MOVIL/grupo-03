package com.example.jfernandomosquera.myapplication;

/**
 * Created by jfwc1 on 12/10/2016.
 */
public class Parqueaderos {

    private String id;
    private String codigo;
    private String nombre;
    private String localizacionX;
    private String localizacionY;
    private String tarifa_hora_moto;
    private String tarifaHoraCarro;
    private String tarifaDiaMoto;
    private String tarifaDiaCarro;
    private String horario;

    public Parqueaderos(String id,String codigo,
                        String nombre, String localizacionX,
                        String localizacionY,String tarifa_hora_moto,
                        String tarifaHoraCarro, String tarifaDiaMoto,
                        String tarifaDiaCarro,String horario){
        this.id=id;
        this.codigo=codigo;
        this.nombre=nombre;
        this.localizacionX=localizacionX;
        this.localizacionY=localizacionY;
        this.tarifa_hora_moto=tarifa_hora_moto;
        this.tarifaHoraCarro=tarifaHoraCarro;
        this.tarifaDiaMoto=tarifaDiaMoto;
        this.tarifaDiaCarro=tarifaDiaCarro;
        this.horario=horario;
    }





    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(String localizacionX) {
        this.localizacionX = localizacionX;
    }

    public String getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(String localizacionY) {
        this.localizacionY = localizacionY;
    }

    public String getTarifa_hora_moto() {
        return tarifa_hora_moto;
    }

    public void setTarifa_hora_moto(String tarifa_hora_moto) {
        this.tarifa_hora_moto = tarifa_hora_moto;
    }

    public String getTarifaHoraCarro() {
        return tarifaHoraCarro;
    }

    public void setTarifaHoraCarro(String tarifaHoraCarro) {
        this.tarifaHoraCarro = tarifaHoraCarro;
    }

    public String getTarifaDiaMoto() {
        return tarifaDiaMoto;
    }

    public void setTarifaDiaMoto(String tarifaDiaMoto) {
        this.tarifaDiaMoto = tarifaDiaMoto;
    }

    public String getTarifaDiaCarro() {
        return tarifaDiaCarro;
    }

    public void setTarifaDiaCarro(String tarifaDiaCarro) {
        this.tarifaDiaCarro = tarifaDiaCarro;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
