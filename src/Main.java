
import controllers.AmbilBarang;
import java.util.ArrayList;
import models.Barang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author alfianh
 */
public class Main {
    public static void main(String[] args) {
        int pilihMenu;
        do{
            System.out.println("----- Sistem Penjualan -----");
        System.out.println("1. View Item.");
        System.out.println("2. Add Item.");
        System.out.println("3. Delete Item.");
        System.out.println("4. Purchase Item.");
        System.out.println("5. Sell Item.");
        System.out.println("0. Quit.");
        Scanner input = new Scanner(System.in);
        pilihMenu = (input.nextInt());
            switch(pilihMenu){
                case 1:
                    AmbilBarang ab = new AmbilBarang();
                    ab.tampil();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }while(pilihMenu != 0);
    }
}
