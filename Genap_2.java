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
public class Genap_2 {
    public static void main(String[] args) {
        int UTS,UAS,Tugas;
        float NA;
        
        System.out.println("Masukan Nilai UTS, UAS, dan Tugas: ");
        Scanner integer = new Scanner(System.in);
        UTS = integer.nextInt();
        UAS = integer.nextInt();
        Tugas = integer.nextInt();
        
        NA = (UTS * 0.35f)+(UAS * 0.45f)+(Tugas * 0.2f);
        
        if(NA >= 80 && NA <= 100){
            System.out.println("Nilai : A");
        }else if(NA >= 70 && NA < 80){
            System.out.println("Nilai : B");
        }else if(NA >= 50 && NA < 70){
            System.out.println("Nilai : C");
        }else{System.out.println("Nilai Tidak Valid");
        }
    }
}
