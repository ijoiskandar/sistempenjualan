
import controllers.AmbilBarang;
import java.util.ArrayList;
import models.Barang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alfianh
 */
public class Main {
    public static void main(String[] args) {
        AmbilBarang ab = new AmbilBarang();
        ArrayList<Barang> data = ab.getBarangs();
        for (Barang string : data) {
            System.out.println(string.getNama());
            System.out.println(string.getHarga());
        }
    }
}
