/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import models.Barang;
/**
 *
 * @author alfianh
 */
public class AddBarang {
    
    public void TambahBarang(String ID, String nama, int qty, int harga){
        
        Barang new_Barang = new Barang(ID, nama, qty, harga);
        
        File file = new File("stock.txt");
        
        try{
            FileWriter fw = new FileWriter(file, true);
            
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(new_Barang.getID() + ";" + new_Barang.getNama() + ";" + new_Barang.getQuantity() + ";" + new_Barang.getHarga());
            bw.newLine();
            
            bw.close();
            
        }catch(Exception e){
            
        }
        
    }
    
}
