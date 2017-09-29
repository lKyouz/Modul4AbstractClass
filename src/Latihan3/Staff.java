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
public class Staff extends Pegawai{
     private static final int gajiStaf = 50000;
    private static final int tunjangan = 25000;
    
    public int gaji(){
        return gajiStaf;
    }
    public int tunjangan(){
        return tunjangan;
    }
}
