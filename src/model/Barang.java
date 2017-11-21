/*
 * Copyright 2017 Alvin
 * https://alvin.co.id/
 */
package model;

/**
 *
 * @author Eve
 */
public class Barang implements CRUD{
    private String idBarang;
    private String namaBarang;
    private int jmlBrg;
    private Kategori ktg;
    private int hargaBarang;

    public Barang(String idBarang, String namaBarang, int jmlBrg, Kategori ktg) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.jmlBrg = jmlBrg;
        this.ktg = ktg;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJmlBrg() {
        return jmlBrg;
    }

    public void setJmlBrg(int jmlBrg) {
        this.jmlBrg = jmlBrg;
    }

    public Kategori getKtg() {
        return ktg;
    }

    public void setKtg(Kategori ktg) {
        this.ktg = ktg;
    }

    @Override
    public void displayData() {
        System.out.println(idBarang);
        System.out.println(namaBarang);
        System.out.println(ktg.getNamaKategori());
        System.out.println(jmlBrg);
        System.out.println(ktg.getLokasi());
    }

    @Override
    public void insertData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
