/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import models.Barang;

/**
 *
 * @author alfianh
 */
public class DeleteBarang {
 public void delete(String ID){
        
        AmbilBarang ab = new AmbilBarang();
        ArrayList<Barang> al = ab.getBarangs();
        
        File file = new File("stock.txt");
        
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Barang barang : al) {
                if (!barang.getID().equals(ID)) {
                    bw.write(barang.getID() + ";" + barang.getNama() + ";" + barang.getQuantity() + ";" + barang.getHarga());
                    bw.newLine();    
                }
            }
            bw.close();
            
        }catch(Exception e){
            
        }
        
    }
}
