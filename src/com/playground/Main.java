package com.playground;

public class Main {

    //perulangan while

    public static void main(String[] args) {
        System.out.println("perulangan menggunakan while");

        int angka = 0;

        while(angka <= 10){

            System.out.println("ini perulangan ke- " + angka);
            angka++;
        }

        System.out.println("////////////////////////////////////////");
        System.out.println("perulangan menggunakan for");

        for (int angka1= 0; angka1 <=10; angka1++){
            System.out.println("ini perulangan ke-" + angka1);
        }
    }
}
