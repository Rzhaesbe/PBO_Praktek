/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-MM
 */
import java.util.Random;
import java.util.Scanner;

public class ProsesArray2Dimensi {
    public static void main(String[] args) {
        
          int [][] A;
         int brs, klm, i , j;
         int jum;
         double rata;
         int max, imax, jmax;
         Scanner in = new Scanner(System.in);
         Random rand = new Random();
         System.out.print("Baris = ");
         brs = in.nextInt();
         System.out.print("Kolom = ");
         klm = in.nextInt();
         A = new int [brs][klm];
         //mengisi array
         for(i=0;i<brs;i++)
         {
             for(j=0;j<klm;j++)
             {
                 A[i][j] = rand.nextInt(10);
             }
         }
         //proses array 2D 
         jum=A[0][0];
         max=A[0][0]; 
         imax=0; jmax=0;
         for(i=0;i<brs;i++)
         {
             for(j=0;j<klm;j++)
             {
                jum=jum+A[i][j];
                if(A[i][j]>max)
                {
                    max = A[i][j];
                    imax = i;
                    jmax = j;
                }
             }
         }
         rata = (double)jum/(brs*klm);
         //menampilkan isi array 2D
         System.out.println("\n===Isi array 2 Dimensi");
         for(i=0;i<brs;i++)
         {
             for(j=0;j<klm;j++)
             {
                System.out.print(A[i][j]+"\t");
             }
             System.out.println();
         }
         System.out.println("Jumlah nilai = "+jum);
        System.out.println("Rata-rata nilai = "+rata);
        System.out.println("Nilai Terbesar = "+max);
        System.out.println("Nilai terbesar pada indeks["+imax+"]["+jmax+"]");
    }
}
