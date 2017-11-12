/*
 * Copyright 2017 Alvin
 * https://alvin.co.id/
 */
package model;

import java.util.*;

/**
 *
 * @author Eve
 */
public class SuratKeteranganKeluar implements CRUD{
    private Pembeli pbl;
    private List<Barang> brg;
    private Date tgl;
    private Karyawan kyw;

    public SuratKeteranganKeluar(Pembeli pbl, Date tgl, Karyawan kyw) {
        this.pbl = pbl;
        this.tgl = tgl;
        this.kyw = kyw;
        brg = new ArrayList<>();
    }

    public Pembeli getPbl() {
        return pbl;
    }

    public void setPbl(Pembeli pbl) {
        this.pbl = pbl;
    }

    public void showAllBrg() {
        for (Barang barang : brg) {
            System.out.println(barang.getIdBarang());
            System.out.println(barang.getNamaBarang());
            System.out.println(barang.getKtg());
            System.out.println(barang.getJmlBrg());
            System.out.println();
        }
    }

    public Barang getBrg(int idBarang) {
        return brg.get(idBarang);
    }

    public void addBrg(Barang brg) {
        this.brg.add(brg);
    }

    public Date getTgl() {
        return tgl;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

    public Karyawan getKyw() {
        return kyw;
    }

    public void setKyw(Karyawan kyw) {
        this.kyw = kyw;
    }

    @Override
    public void displayData() {
        System.out.println(kyw.getNama());
        System.out.println(pbl.getNamaToko());
        System.out.println(tgl);
        showAllBrg();
    }

    @Override
    public void insertData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
