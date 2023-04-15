/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-MM
 */

import java.util.Scanner;
import java.util.Random;
public class sequantialSearch {
    
    public static void main(String[] args) {
        
        int[] data;
        int n,i,x;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Banyak Data = ");
        n  = in.nextInt();
        data = new int[n];
        
        // mengisi array
        for(i=0; i<n; i++)
        {
            data[i]=rand.nextInt(10);
            
        }
        System.out.println("Nilai Yang DiCari = ");
        x = in.nextInt();
        
        // menampilkan isi array
        System.out.println("\n ====Data===");
        
        for(i=0; i<n; i++)
            
        {
            System.out.println((i+1)+" . "+data[i]);
        }
        
        // sequential
        int banyak = 0;
        for(i=0; i<n; i++)
        {
              if(data[i]==x)
              {
              System.out.println("Ada di data ke-"+(i+1));
              banyak++;
              }
                  
        }
        if(banyak>0)
            
            System.out.println(" Angka " +x+ " Ada Sebanyak " +banyak+  " Buah ");
        
        else
            System.out.println(" Angka " +x+  " Tidak ada ");
    }
}
