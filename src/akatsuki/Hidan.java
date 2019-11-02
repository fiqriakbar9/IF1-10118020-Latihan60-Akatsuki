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
public class Hidan extends Akatsuki{
    private String kekuatanRitual;
    private String senjataKhusus;
    
    @Override
    public void jurus(){
        System.out.println("Hidan memiliki kekuatan khusus yaitu : ");
        System.out.println("KEABADIAN");
        System.out.println("");
    }

    public String getKekuatanRitual() {
        return kekuatanRitual;
    }

    public void setKekuatanRitual(String kekuatanRitual) {
        this.kekuatanRitual = kekuatanRitual;
    }

    public String getSenjataKhusus() {
        return senjataKhusus;
    }

    public void setSenjataKhusus(String senjataKhusus) {
        this.senjataKhusus = senjataKhusus;
    }
    
    
    
}
