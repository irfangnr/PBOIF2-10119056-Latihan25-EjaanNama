/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan25.ejaannama;
import java.util.Scanner;
/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan ejaanNama
 */
public class PBOIF210119056Latihan25EjaanNama {

    public static void main(String[] args){
        
        String nama;
        int eja;
        Scanner masukan=new Scanner(System.in);
        System.out.print("Masukan nama depan anda untuk di eja : ");
        nama=masukan.next();
        
        eja=nama.length();
        
        char[] arrChar=new char[eja];
        
        System.out.println();
        System.out.println("Ejaan untuk "+nama+" adalah :");
        for(int i=0;i<eja;i++){
        arrChar[i]=nama.charAt(i);
        System.out.println("Huruf ke-"+(i+1)+" :"+arrChar[i]);
                    
        }
        
    }
}

