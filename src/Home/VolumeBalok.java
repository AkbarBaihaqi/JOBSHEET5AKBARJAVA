/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class VolumeBalok{ 
    public static void main(String[] args){
    
    int panjang, lebar, tinggi;
    Double volume;
    
    Scanner baca = new Scanner(System.in);
    
    System.out.println("==Program Hitung Volume Balok==");
    System.out.print("Input panjang = ");
    panjang = baca.nextInt();
    System.out.print("Input lebar = ");
    lebar = baca.nextInt();
    System.out.print("Input tinggi = ");
    tinggi = baca.nextInt();
    
    volume = Double.valueOf(panjang*lebar*tinggi);
    
    System.out.println("Volume =" + volume);
    }
}
