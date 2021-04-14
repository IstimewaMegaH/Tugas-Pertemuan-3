/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintugas;

import java.util.Scanner;
import maintugas.BangunRuang.Balok;
import maintugas.BangunRuang.Kerucut;

/**
 *
 * @author istim
 */
public class MainTugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int panjang,lebar,tinggi,jari;
        Balok balok = new Balok(0,0,0);
        Kerucut kerucut = new Kerucut (0,0);

        Scanner input = new Scanner(System.in);
        char pilihan;
        while(true){
            System.out.println("INPUT");
            System.out.println("1. Balok");
            System.out.println("2. Kerucut");
            System.out.println("3. Exit");
            System.out.print("Pilihan Anda : ");
            pilihan = input.next().charAt(0);

            if (pilihan == '1') {
                System.out.print("Panjang\t:");
                panjang = input.nextInt();
                System.out.print("Lebar\t:");
                lebar = input.nextInt();
                System.out.print("Tinggi\t:");
                tinggi = input.nextInt();
                balok.setLebar(lebar);
                balok.setPanjang(panjang);
                balok.setTinggi(tinggi);
                System.out.println("OUTPUT");
                System.out.println("LUAS PERSEGI     \t: "+ balok.hitungLuas());
                System.out.println("KELILING PERSEGI    \t: "+ balok.hitungKeliling());
                System.out.println("VOLUME BALOK    \t: "+ balok.hitungVolume());
                System.out.println("LUAS PERMUKAAN BALOK\t: " +balok.hitungLuasPermukaan() +"\n\n");
            }else if (pilihan =='2') {
                System.out.print("Jari-jari\t:");
                jari = input.nextInt();
                System.out.print("Tinggi\t\t:");
                tinggi=input.nextInt();

                kerucut.setJari(jari);
                kerucut.setTinggi(tinggi);

                System.out.println("OUTPUT");
                System.out.println("LUAS LINGKARAN\t\t: "+ kerucut.hitungLuas());
                System.out.println("KELILING LINGKARAN\t: "+ kerucut.hitungKeliling());
                System.out.println("VOLUME KERUCUT\t\t: "+ kerucut.hitungVolume());
                System.out.println("LUAS PERMUKAAN KERUCUT\t: "+ kerucut.hitungLuasPermukaan()+"\n\n");
            }else if (pilihan == '3') {
                break;
            }
        }
    }
 
    }
    
    

