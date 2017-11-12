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
public class SuratKeteranganMasuk implements CRUD{
    private Supplier spy;
    private Karyawan kyw;
    private Date tgl;
    private List<Barang> brg;

    public SuratKeteranganMasuk(Supplier spy, Karyawan kyw, Date tgl) {
        this.spy = spy;
        this.kyw = kyw;
        this.tgl = tgl;
        brg = new ArrayList<>();
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

    public Supplier getSpy() {
        return spy;
    }

    public void setSpy(Supplier spy) {
        this.spy = spy;
    }

    public Karyawan getKyw() {
        return kyw;
    }

    public void setKyw(Karyawan kyw) {
        this.kyw = kyw;
    }

    public Date getTgl() {
        return tgl;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

    @Override
    public void displayData() {
        System.out.println(kyw.getNama());
        System.out.println(spy.getNamaSupplier());
        System.out.println(tgl);
        showAllBrg();
    }

    @Override
    public void insertData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
