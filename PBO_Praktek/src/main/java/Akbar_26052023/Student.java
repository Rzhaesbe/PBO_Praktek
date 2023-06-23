/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Akbar_26052023;

/**
 *
 * @author Dell
 */
public class Student extends Person{
    
    public Student(){
        super();
        super.name = "Akbar";
        super.address = "Padang";
//        super("Azzammil Akbar Ramadhan","Padang");
        System.out.println("inside Student:Constructor");
       
    }
    
   @Override
    public String getName(){ 
        System.out.println("Student : getName");
        return name; 
     } 
    
    public static void main(String[] args) {
        Student akbar = new Student();
        System.out.println("Nama : "+akbar.name);
         System.out.println("Alamat : "+akbar.address);
    }
    
}
