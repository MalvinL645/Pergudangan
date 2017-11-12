/*
 * Copyright 2017 Alvin
 * https://alvin.co.id/
 */
package model;

/**
 *
 * @author Eve
 */
public class Karyawan extends Manusia implements CRUD{
    private String nip;
    private int gaji;
    private int gol;

    public Karyawan(String nik, String nama, String alamat, String agama, boolean sex, String nip, int gol) {
        super(nik, nama, alamat, agama, sex);
        this.nip = nip;
        this.gol = gol;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        switch (gol) {
            case 1:
                this.gaji = 2850000 + 500000;
                break;
            case 2:
                this.gaji = 2850000 + 750000;
                break;
            case 3:
                this.gaji = 2850000 + 1000000;
                break;
            default:
                this. gaji = 2850000;
                break;
        }
    }

    @Override
    public void displayData() {
        System.out.println(getNik());
        System.out.println(getNip());
        System.out.println(getNama());
        System.out.println(getAlamat());
        System.out.println(getAgama());
        System.out.println(getGaji());
    }

    @Override
    public void insertData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
