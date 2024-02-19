/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg1;
import java.util.Scanner;

/**
 *
 * @author Rayin
 */
public class Tugas1 {

    static int sederhanapembilang(int x, int y) {
        int tempx = x;
        int tempy = y;
        int i;
  for(i = 2 ; i < 10 ; i++){
        while( tempx % i == 0 && tempy % i == 0){
      tempx = tempx / i;
      tempy = tempy / i;
        }    
    }
  return tempx;
}
    
    static int sederhanapenyebut(int x, int y) {
        int tempx = x;
        int tempy = y;
        int i;
  for(i = 2 ; i < 10 ; i++){
        while( tempx % i == 0 && tempy % i == 0){
      tempx = tempx / i;
      tempy = tempy / i;
  }
        
    }      
  
  return tempy;
}
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pecahan1 = new Scanner(System.in);
        System.out.println("Masukan penyebut dan pembilang Pecahan 1 :");
        
        
        int pembilang1 = pecahan1.nextInt();
        int penyebut1 = pecahan1.nextInt();
        
        Scanner pecahan2 = new Scanner(System.in);
        System.out.println("Masukan penyebut dan pembilang Pecahan 2 :");

        int pembilang2 = pecahan2.nextInt();
        int penyebut2 = pecahan2.nextInt();
        
        Scanner pecahan3 = new Scanner(System.in);
        System.out.println("Masukan penyebut dan pembilang Pecahan 3 :");

        int pembilang3 = pecahan3.nextInt();
        int penyebut3 = pecahan3.nextInt();

        //pertambahan
        int pembilangtambah = pembilang1 * penyebut2 * penyebut3
                + pembilang2 * penyebut1 * penyebut3
                + pembilang3 * penyebut1 * penyebut2;
        
        
        int penyebuttambah = penyebut1 * penyebut2 * penyebut3;
        
        int sdpembilangtambah = sederhanapembilang(pembilangtambah,penyebuttambah);
        int sdpenyebuttambah = sederhanapenyebut(pembilangtambah,penyebuttambah);
        
        //pengurangan
        int pembilangkurang = pembilang1 * penyebut2 * penyebut3
                - pembilang2 * penyebut1 * penyebut3
                - pembilang3 * penyebut1 * penyebut2;

        int penyebutkurang = penyebut1 * penyebut2 * penyebut3;
        
        int sdpembilangkurang = sederhanapembilang(pembilangkurang,penyebutkurang);
        int sdpenyebutkurang = sederhanapenyebut(pembilangkurang,penyebutkurang);
        
        //perkalian
        int pembilangkali = pembilang1 * pembilang2 * pembilang3;
        int penyebutkali = penyebut1 * penyebut2 * penyebut3;
        
        int sdpembilangkali = sederhanapembilang(pembilangkali,penyebutkali);
        int sdpenyebutkali = sederhanapenyebut(pembilangkali,penyebutkali);
        
        //pembagian
        int pembilangbagi = pembilang1 * penyebut2 * penyebut3;
        int penyebutbagi = penyebut1 * pembilang2 * pembilang3;
        
        int sdpembilangbagi = sederhanapembilang(pembilangbagi,penyebutbagi);
        int sdpenyebutbagi = sederhanapenyebut(pembilangbagi,penyebutbagi);

        //menampilkan hasil
        System.out.println("Pecahan 1: " + pembilang1 + "/" + penyebut1);
        System.out.println("Pecahan 2: " + pembilang2 + "/" + penyebut2);
        System.out.println("Pecahan3: " + pembilang3 + "/" + penyebut3);
        
        System.out.println("Hasil pertambahan: " + sdpembilangtambah + "/" + sdpenyebuttambah);
        System.out.println("Hasil pengurangan: " + sdpembilangkurang + "/" + sdpenyebutkurang);
        System.out.println("Hasil perkalian: " + sdpembilangkali + "/" + sdpenyebutkali);
        System.out.println("Hasil pembagian: " + sdpembilangbagi + "/" + sdpenyebutbagi);
    } 
}
