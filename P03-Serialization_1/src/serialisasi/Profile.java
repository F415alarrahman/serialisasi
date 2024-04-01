/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author f415a
 */
public class Profile implements Serializable{
    private transient String id;
    private  static String nama;
    private  static String hobi;
    private List<ProductItem> items;
    
    
    public void setId(String id){
    this.id = id;
    }
    public void setNama(String nama){
    this.nama = nama;
    }
    public void setHobi(String hobi){
    this.hobi = hobi;
    }
    public void setItems(List<ProductItem> items){
    this.items = items;
    }
    
    @Override
    public String toString(){
        String produk, item ="";
        produk = "Produk: \r\n"
                + "id=" + id + "\r\n"
                + "nama=" + nama + "\r\n"
                + "nama=" + hobi + "\r\n"
                + "===================\r\n"
                + "Produk Item\r\n";
        item = items.stream().map((obj) ->
        obj.toString()).reduce(item, String::concat);
        return produk + item;
    }
}
