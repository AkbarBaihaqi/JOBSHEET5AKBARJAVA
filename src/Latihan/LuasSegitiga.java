/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class LuasSegitiga {
   public static void main(String[] args){
    Double luas;
int alas, tinggi;
// mebuat scanner baru
Scanner baca = new Scanner(System.in);
// Input
System.out.println("== Program hitung luas Segitiga ==");
System.out.print("Input alas: ");
alas = baca.nextInt();
System.out.print("Input tinggi: ");
tinggi = baca.nextInt();
// proses
luas = Double.valueOf((alas * tinggi) / 2);
// output
System.out.println("Luas = + luas");
}
}   
