
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-MM
 */
public class bubbleShort {
    public static void main(String[] args) {
        
        int[] data;
        int n,i,x,j, temp;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Banyak Data = ");
        n  = in.nextInt();
        data = new int[n];
        
        // mengisi array
        System.out.println("=== isi Array Sebelum Di urutkan==== ");
        for(i=0; i<n; i++)
        {
            data[i]=rand.nextInt(100)+1;
            System.out.println(data[i]+"\t");
//            int enter = i%10;
//            if(i!=0 && i!=0)
//                System.out.println();
                
        }
        
        //bubble sort
        for(i=0; i<n; i++)
        {
            for(j=n-1; j>i+1; j--) 
                {
                  if(data[j]<data[j-1])
                    {
                       temp=data[j];
                       data[j] = data[j-1];
                       data[j-1] = temp;
                    }
                }    
        }
        System.out.println("=== isi Array Setelah Di urutkan==== ");
        for(i=1; i<n; i++)
        {
            System.out.println(data[i]+"\t");
                
        }
    }
}
