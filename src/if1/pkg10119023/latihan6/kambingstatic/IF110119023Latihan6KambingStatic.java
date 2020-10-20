/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan6.kambingstatic;

/**
 *
 * @author   
 * NAMA     : Muhammad Farhan R
 * KELAS    : IF1
 * NIM      : 10119023
 * Deskripsi Program :latihan membuat variabel statik
 */

public class IF110119023Latihan6KambingStatic {

    public static final String NAMA_KAMBING = "MIDUN";
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING +" memiliki kambing sebanuak " +
                            Mamalia.jumlahKambing);
    }
    
}
