package com.example.mascotas;

public class MascotaModelo {
    private String mascota;
    private int fotoMas;

    public MascotaModelo() {
    }

    public MascotaModelo(String mascota, int fotoMas) {
        this.mascota = mascota;
        this.fotoMas = fotoMas;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public int getFotoMas() {
        return fotoMas;
    }

    public void setFotoMas(int fotoMas) {
        this.fotoMas = fotoMas;
    }
}
