/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Akbar_05052023;

/**
 *
 * @author Dell
 */
public class DataBukuAlamat {
     private BukuAlamat[] data = new BukuAlamat[100];
     private int index;
    
    public void insert(BukuAlamat bukuAlamat){
        data[index] = bukuAlamat;
        index++;
    }
    
    public void update(int index, BukuAlamat bukuAlamat){
        data[index] = bukuAlamat;
    }
    
    public BukuAlamat[] getAll(){
        BukuAlamat[] temp = new BukuAlamat[index];
        for(int i=0;i<index;i++){
            temp[i]=data[i];
        }
        return temp;
    }
    
    public void delete(int index){
        data[index].setNama("");
        data[index].setAlamat("");
        data[index].setNotelp("");
        data[index].setEmail("");
    }
    
    public static void main(String[] args){
        DataBukuAlamat data = new DataBukuAlamat();
        BukuAlamat temp = new BukuAlamat();
        temp.setNama("Azzammil Akbar Ramadhan");
        temp.setAlamat("Tanah Datar, Sumbar");
        temp.setNotelp("081218365391");
        temp.setEmail("azzammilakbarramdhan@gmail.com");
        data.insert(temp);
      
        BukuAlamat[] list = data.getAll();
        for(int i=0;i<list.length;i++){
            System.out.println("Buku Alamat ke--->"+(i+1));
            System.out.println("Nama    :"+list[i].getNama());
            System.out.println("Alamat  :"+list[i].getAlamat());
            System.out.println("No Telp :"+list[i].getNotelp());
            System.out.println("Email   :"+list[i].getEmail());
        }
    }
}
