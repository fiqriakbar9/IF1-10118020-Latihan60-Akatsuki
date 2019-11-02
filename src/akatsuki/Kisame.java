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
public class Kisame extends Akatsuki{
    private String kekuatanSamehada;
    private String senjataKhusus;
    
    @Override
    public void jurus(){
        System.out.println("Kisame Memiliki Jurus : ");
        System.out.println("1. Mizu Bunshin no Justu");
        System.out.println("2. Suiro Sameodori no Justu");
        System.out.println("3. Suiro no Justu");
        System.out.println("4. Suiton Senjikizame");
        System.out.println("5. Suiton Bakusui Shoha");
        System.out.println("");
    }

    public String getKekuatanSamehada() {
        return kekuatanSamehada;
    }

    public String getSenjataKhusus() {
        return senjataKhusus;
    }

    public void setKekuatanSamehada(String kekuatanSamehada) {
        this.kekuatanSamehada = kekuatanSamehada;
    }

    public void setSenjataKhusus(String senjataKhusus) {
        this.senjataKhusus = senjataKhusus;
    }
    
    
    
}

