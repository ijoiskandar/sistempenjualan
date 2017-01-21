/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import models.Barang;
/**
 *
 * @author alfianh
 */
public class AddBarang {
    
    public void TambahBarang(){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan ID barang : ");
        String new_id = scan.next();
        
        System.out.println("Masukkan nama Barang : ");
        String new_nama = scan.next();
        
        System.out.println("Masukkan stock barang : ");
        int new_stock = scan.nextInt();
        
        System.out.println("Masukkan harga barang : ");
        int new_harga = scan.nextInt();
        
        Barang new_Barang = new Barang(new_id, new_nama, new_stock, new_harga);
        
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
