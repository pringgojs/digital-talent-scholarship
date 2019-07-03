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
    }
}
