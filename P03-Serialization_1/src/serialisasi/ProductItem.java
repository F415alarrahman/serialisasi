/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;

/**
 *
 * @author f415a
 */
public class ProductItem implements Serializable{
    String nama;
    String hobi;
    
    public ProductItem(String name, String price){
    this.nama = name;
    this.hobi = hobi;
    }
    
    @Override
    public String toString(){
        return "\r\nNama=" + nama + "\r\nHarga=" + hobi + "\r\n";
    } 
}
