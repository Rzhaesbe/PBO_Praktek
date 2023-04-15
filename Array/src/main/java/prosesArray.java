/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-MM
 */

import static java.lang.Math.random;
import java.util.Scanner;
import java.util.Random;
public class prosesArray {
    public static void main(String[] args) 
    
    {
        int[] Nilai;
        int ukuran;
        double rata;
        Random rand = new Random();
        int i, n, sum;
        int max, min, imax, imin;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Banyak Data : ");
        n = in.nextInt(); // Input Ukuran Array
        Nilai = new int[n]; // membuat array ukuran n
 
        // Mengisi array
        for(i=0; i<n; i++)
        {
            System.out.println("Nilai ke -"+(i+1)+" = ");
            Nilai[i]= rand.nextInt(100);
        }
        
        // Proses Array
        sum = Nilai[0];
        max = Nilai[0]; imax = 0;
        min = Nilai[0]; imin = 0;
        for(i=1; i<n; i++)
        {
            sum = sum + Nilai[i];
            if(Nilai[i]>max)
            {
                max = Nilai[i];
                imax = i;
            }
            
            if(Nilai[i]<min)
            {
                min = Nilai[i];
                imin = i;
            }
        }
        rata = (double)sum/n;
        
        //  menampilkan isi array
        System.out.println("\n ===Daftar Nilai===");
        for(i=0; i<n; i++)
        {
            
            System.out.println((i+1)+" . "+Nilai[i]);
        }
        
        
        System.out.println("Jumlah Nilai = "+sum);
        System.out.println("Rata Rata Nilai = "+rata);
        System.out.println("Nilai Terbesar = "+max);
        System.out.println("Nilai terbesar adalah nilai ke -  "+(imax+1));
        System.out.println("Nilai Terkecil = "+min);
        System.out.println("Nilai terkecil adalah nilai ke -  "+(imin+1));
    }
 }

