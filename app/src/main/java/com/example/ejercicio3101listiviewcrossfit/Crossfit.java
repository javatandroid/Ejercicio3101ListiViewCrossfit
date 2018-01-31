package com.example.ejercicio3101listiviewcrossfit;

/**
 * Created by DIDACT on 31/01/2018.
 */

public class Crossfit {

    String ejercicio;
    String peso;
    String pesom;
    int repeticiones;
    int minutos;
    int segundos;
    String imagen;

    public Crossfit(String ejercicio, String peso, String pesom, int repeticiones, int minutos, int segundos, String imagen) {
        this.ejercicio = ejercicio;
        this.peso = peso;
        this.pesom = pesom;
        this.repeticiones = repeticiones;
        this.minutos = minutos;
        this.segundos = segundos;
        this.imagen = imagen;
    }

    public String getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(String ejercicio) {
        this.ejercicio = ejercicio;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPesom() {
        return pesom;
    }

    public void setPesomax(String pesom) {
        this.pesom = pesom;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
