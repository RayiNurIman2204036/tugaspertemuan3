/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;
import java.util.Scanner;
/**
 *
 * @author Rayin
 */

public class Tugas2 {
    public static void main(String[] args) {
        System.out.println("Jumlah tabungan (juta): ");
        Scanner credit = new Scanner(System.in);
        int tabungan = credit.nextInt();
        
        System.out.println("Calon pasangan: ");
        Scanner pasangan = new Scanner(System.in);
        boolean calonPasangan = pasangan.nextBoolean();
        
        if(tabungan > 100 && calonPasangan){
        System.out.println("Akan nikah");
        }else{
            System.out.println("Tidak akan nikah");
        };  
    }
}
