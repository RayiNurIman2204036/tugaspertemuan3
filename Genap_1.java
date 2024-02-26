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
public class Genap_1 {
    public static void main(String[] args) {
        int A,B;
        
        System.out.println("Masukan bilangan A dan B: ");
        Scanner integer = new Scanner(System.in);
        A = integer.nextInt();
        B = integer.nextInt();
        
        if(A % 2 == 0 && B % 2 == 0){
            System.out.println( A + B );
        }else if(A % 2 != 0 && B % 2 != 0){
            System.out.println( A * B );
        }else{
            System.out.println("Kedua bilangan tersebut tidak sesama ganjil maupun genap");
        }
    }
}
