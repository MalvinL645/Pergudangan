/*
 * Copyright 2017 Alvin
 * https://alvin.co.id/
 */
package model;

/**
 *
 * @author Eve
 */
public class Pembeli implements CRUD{
    private String idToko;
    private String namaToko;
    private String alamatToko;
    private String noTelpToko;

    public Pembeli(String idToko, String namaToko, String alamatToko, String noTelpToko) {
        this.idToko = idToko;
        this.namaToko = namaToko;
        this.alamatToko = alamatToko;
        this.noTelpToko = noTelpToko;
    }

    public String getIdToko() {
        return idToko;
    }

    public void setIdToko(String idToko) {
        this.idToko = idToko;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public String getAlamatToko() {
        return alamatToko;
    }

    public void setAlamatToko(String alamatToko) {
        this.alamatToko = alamatToko;
    }

    public String getNoTelpToko() {
        return noTelpToko;
    }

    public void setNoTelpToko(String noTelpToko) {
        this.noTelpToko = noTelpToko;
    }

    @Override
    public void displayData() {
        System.out.println(idToko);
        System.out.println(namaToko);
        System.out.println(alamatToko);
        System.out.println(noTelpToko);
    }

    @Override
    public void insertData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
