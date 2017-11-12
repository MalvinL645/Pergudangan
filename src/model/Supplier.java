/*
 * Copyright 2017 Alvin
 * https://alvin.co.id/
 */
package model;

/**
 *
 * @author Eve
 */
public class Supplier implements CRUD{
    private String idSupplier;
    private String namaSupplier;
    private String alamatSupplier;
    private String noTelpSupplier;

    public Supplier(String idSupplier, String namaSupplier, String alamatSupplier, String noTelpSupplier) {
        this.idSupplier = idSupplier;
        this.namaSupplier = namaSupplier;
        this.alamatSupplier = alamatSupplier;
        this.noTelpSupplier = noTelpSupplier;
    }

    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public String getAlamatSupplier() {
        return alamatSupplier;
    }

    public void setAlamatSupplier(String alamatSupplier) {
        this.alamatSupplier = alamatSupplier;
    }

    public String getNoTelpSupplier() {
        return noTelpSupplier;
    }

    public void setNoTelpSupplier(String noTelpSupplier) {
        this.noTelpSupplier = noTelpSupplier;
    }

    @Override
    public void displayData() {
        System.out.println(idSupplier);
        System.out.println(namaSupplier);
        System.out.println(alamatSupplier);
        System.out.println(noTelpSupplier);
    }

    @Override
    public void insertData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
