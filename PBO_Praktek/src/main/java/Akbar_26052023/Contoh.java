/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Akbar_26052023;



/**
 *
 * @author Dell
 */
public class Contoh extends StudentRecord{
    
    private String programmingLanguage;
    private String programmingExperience;

    public Contoh() {
        super();
    }

    public Contoh(String name, String address, int age, String programmingLanguage, String programmingExperience) {
        super(name, address, age);
        this.programmingLanguage = programmingLanguage;
        this.programmingExperience = programmingExperience;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingExperience() {
        return programmingExperience;
    }

    public void setProgrammingExperience(String programmingExperience) {
        this.programmingExperience = programmingExperience;
    }

    @Override
    public void print(String temp) {
        super.print(temp);
        System.out.println("Bahasa Pemrograman: " + programmingLanguage);
        System.out.println("Pengalaman Pemrograman: " + programmingExperience);
    }
    
}
