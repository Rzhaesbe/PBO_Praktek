/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Akbar.dao;
import Akbar.model.Anggota;
import java.util.List;
/**
 *
 * @author Dell
 */
public interface AnggotaDao {
        void insert(Anggota anggota);
        void update(int index, Anggota anggota);
        void delete(int index);
        Anggota getAnggota(int index);
        List <Anggota>getAll();
        
}
