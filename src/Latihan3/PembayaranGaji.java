/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author SMK TELKOM
 */
public class PembayaranGaji {

    public int hitungGaji(Pegawai peg){
        int uang =peg.gaji(); 
        if(peg instanceof Direktur)
            uang+=((Direktur)peg).tunjangan();
        if(peg instanceof Staff)
            uang +=((Staff)peg).tunjangan();
        return uang;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PembayaranGaji pg = new PembayaranGaji();
        Staff ali = new Staff();
        Direktur Tony = new Direktur();
        System.out.println("Gaji yang diberikan untuk direktur = "+pg.hitungGaji(Tony));
        System.out.println("Gaji yang diberikan untuk direktur = "+pg.hitungGaji(ali));
    }
    
}
