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
public class Itachi extends Akatsuki{
    private String kekuatanMata;
    
    @Override
    public void jurus(){
        System.out.println("Itachi memilki Jurus utama yaitu : ");
        System.out.println("1. Mangeko Sharingan");
        System.out.println("2. Amateratsu");
        System.out.println("3. Susanoo");
        System.out.println("4. Katon, Gokyaku No Jutsu");
        System.out.println("5. Genjutsu Tsukiyomi");
        System.out.println("");
    }

    public String getKekuatanMata() {
        return kekuatanMata;
    }

    public void setKekuatanMata(String kekuatanMata) {
        this.kekuatanMata = kekuatanMata;
    }
    
    
    
}

