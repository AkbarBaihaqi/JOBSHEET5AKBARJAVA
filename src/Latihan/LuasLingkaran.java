/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Lenovo
 */
public class LuasLingkaran {
    public static void main(String[] args){
           
           Double phi, r, luas, volumebola;
           
           r = 10.0;
           phi = 3.14;
           
           luas = phi * r * r;
           volumebola = 4/3 * phi * r * r * r;  
           
           System.out.print("Luas Lingkaran = ");
           System.out.println(luas);
           System.out.print("Volume Bola = ");
           System.out.println(volumebola);
       }
    
}
