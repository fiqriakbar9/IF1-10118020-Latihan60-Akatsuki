/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatsuki;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan detail anggota-anggota 
 * dari klan akatsuki
 * 
 */
public class Akatsuki {
    
    private String nama;
    private String asalDesa;
    private String partner;
    private String elemen;
    
    public Akatsuki(){
     
    }
    
    public void jurus(){
        System.out.println("Memiliki Jurus : ");
    }

    public String getNama() {
        return nama;
    }

    public String getAsalDesa() {
        return asalDesa;
    }

    public String getPartner() {
        return partner;
    }

    public String getElemen() {
        return elemen;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAsalDesa(String asalDesa) {
        this.asalDesa = asalDesa;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public void setElemen(String elemen) {
        this.elemen = elemen;
    }
}
