/*
 * Copyright 2017 Alvin
 * https://alvin.co.id/
 */
package model;

/**
 *
 * @author Eve
 */
public class Kategori implements CRUD{
    private String idKategori;
    private String namaKategori;
    private String lokasi;

    public Kategori(String idKategori, String namaKategori, String lokasi) {
        this.idKategori = idKategori;
        this.namaKategori = namaKategori;
        this.lokasi = lokasi;
    }

    public String getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(String idKategori) {
        this.idKategori = idKategori;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    @Override
    public void displayData() {
        System.out.println(idKategori);
        System.out.println(namaKategori);
        System.out.println(lokasi);
    }

    @Override
    public void insertData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
