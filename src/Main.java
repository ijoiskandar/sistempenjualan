
import controllers.AmbilBarang;
import java.util.ArrayList;
import models.Barang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controllers.AddBarang;
import controllers.DeleteBarang;
import java.util.Scanner;

/**
 *
 * @author alfianh
 */
public class Main {

    public static void main(String[] args) {
        Main mm = new Main();
        mm.menu();
    }

    public void menu() {

        System.out.println("1. View Item.");
        System.out.println("2. Add Item.");
        System.out.println("3. Delete Item.");
        System.out.println("4. Purchase Item.");
        System.out.println("5. Sell Item.");
        System.out.println("0. Quit.");
        Scanner input = new Scanner(System.in);
        String pilihMenu = input.nextLine();
        
        switch (pilihMenu) {
            case "1":
                AmbilBarang ab = new AmbilBarang();
                    ab.tampil();
                    
                    menu();
                break;
            case "2":
                
                AddBarang add = new AddBarang();
                add.TambahBarang();

                menu();
                
                break;
            case "3":
                DeleteBarang barang = new DeleteBarang();
                System.out.println("Masukkan ID : ");
                String id = input.nextLine();
                barang.delete(id);
                menu();
                break;
            case "4":
                break;
            case "5":
                break;
            default:
                break;
        }
    }
}
