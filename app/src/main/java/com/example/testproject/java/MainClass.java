package com.example.testproject.java;

import com.example.testproject.java.kendaraan.*;
//import com.example.testproject.java.kendaraan.Mobil;
//import com.example.testproject.java.kendaraan.Motor;
import com.example.testproject.java.music.Gitar;

public class MainClass {

    public static void main(String[] args) {
        System.out.printf("Hallo");

        Gitar.bunyi();

        Mobil.jumlahBan();
        Kereta.jumlahBan();
        Motor.jumlahBan();

        penjumlahan(20, 30);
    }

    private static void penjumlahan( int a, int b) {
        int x = a + b;

        System.out.printf("Total a + b = " + x);
    }
}
