/*
 * Copyright 2017 Alvin
 * https://alvin.co.id/
 */
package model;

/**
 *
 * @author Eve
 */
public class Manusia {
    private String nik;
    private String nama;
    private String alamat;
    private String agama;
    private boolean sex;

    public Manusia(String nik, String nama, String alamat, String agama, boolean sex) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
        this.agama = agama;
        this.sex = sex;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
    
    
}
