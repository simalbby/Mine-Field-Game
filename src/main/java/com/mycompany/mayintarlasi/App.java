/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mayintarlasi;

/**
 *
 * @author simal
 */
        import java.util.Scanner;
        import java.util.*;
        
public class App {

    public static void main(String[] args) {
          

        Scanner scanner = new Scanner(System.in);

        System.out.println("Satır boyutunu giriniz");
        int satır = scanner.nextInt();
        System.out.println("Sutun boyutunu giriniz.");
        int sutun = scanner.nextInt();
        System.out.println("Oyunununuzun zorluğunu 20 ile 80 arasında bir sayı olarak belirleyiniz.");
        float zorluk = scanner.nextFloat();

        int yerlestirme = (int)(sutun * satır * (zorluk / 100));


        Integer[] oyunmatrisi = new Integer[satır*sutun];
        char[][] matris = new char[satır][sutun];

        int i = 0;
        int puan = 0;
        int j = 0;

        //random yapma
        for(i=0;i<satır*sutun;i++){
            if(i<yerlestirme)
                oyunmatrisi[i] = 1;
            else oyunmatrisi[i] = 0;
        }
        List<Integer> list = Arrays.asList(oyunmatrisi);
        Collections.shuffle(list);
        list.toArray(oyunmatrisi);


        




       //ekrana en başta yıldız yazdır
        for (int o = 0; o < satır; o++) {
            for (int u = 0; u < sutun; u++) {
                matris[o][u] = '*';
                System.out.print("*" + " ");
            }
            System.out.println();
        }


        while (true) {
            System.out.println("Seçtiğiniz konumun satır değerini giriniz");
            int x = scanner.nextInt();
            System.out.println("Seçtiğiniz konumun sutun değerinin giriniz");
            int y = scanner.nextInt();
            if (oyunmatrisi[x * sutun + y] == 1)
            {
                System.out.println("Mayına bastınız oyun bitti, puanınız.." + puan);
                break;
            }
            else
            {
                puan = puan + 10;
                matris[x][y] = '0';
                for (int o = 0; o < satır; o++) {
                    for (int u = 0; u < sutun; u++) {

                        System.out.print(matris[o][u] + " ");
                    }
                    System.out.println();
                }
            }

        }
    }
    }

