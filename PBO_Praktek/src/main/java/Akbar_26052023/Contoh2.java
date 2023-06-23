/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Akbar_26052023;

/**
 *
 * @author Dell
 */
public class Contoh2 {
     public static void main(String[] args) {
       
        Contoh student = new Contoh("Azzammil Akbar Ramadhan", "Lintau Buo Utara", 19, "Java", "Baru Belajar");

 
        student.setMathGrade(85);
        student.setEnglishGrade(90);
        student.setScienceGrade(80);

        // Menampilkan informasi siswa
        student.print("Additional Information");

        // Menampilkan rata-rata nilai
        System.out.println("Average Grade: " + student.getAverage());

        // Menampilkan jumlah total siswa
        System.out.println("Student Count: " + StudentRecord.getStudentCount());
    }
    
}
