/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_pertemuan_3;

import java.util.Scanner;

/**
 *
 * @author Rayin
 */
public class Genap_3 {
    public static void main(String[] args) {
        int Peserta,Mobil;
        
        System.out.printf("Jumlah peserta : ");
        Scanner integer = new Scanner(System.in);
        Peserta = integer.nextInt();
        
        Mobil = Peserta / 7;
        
        if(Peserta % 7 != 0 ){
            Mobil++;
        }
            System.out.println("Jumlah mobil yang disediakan : " + Mobil);
    }
}
