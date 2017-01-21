/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import models.Barang;

/**
 *
 * @author alfianh
 */
public class AmbilBarang {
    
    
    public ArrayList<Barang> getBarangs(){
        String fileName = "stock.txt";
        File f = new File(fileName);
        ArrayList<Barang> list = new ArrayList<>();
        try{
            BufferedReader baca = new BufferedReader(new FileReader(f));
            String line ="";
            while((line=baca.readLine())!=null){
                String arr[] = line.split(";");
                Barang b = new Barang((arr[0]),(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
                list.add(b);
            }
            baca.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
    public void tampil(){
        AmbilBarang ab = new AmbilBarang();
        ArrayList<Barang> data = ab.getBarangs();
        for (Barang string : data) {
            System.out.println("Nama : "+string.getNama());
            System.out.println("Harga : "+string.getHarga());
            System.out.println("Stok : "+string.getQuantity());
        }
    }
    
}
