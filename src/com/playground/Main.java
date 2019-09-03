package com.playground;

public class Main {
    public static void main(String[] args) {
    //tipe tipe data

        //boolean

        boolean benar = true;
        boolean salah = false;

        System.out.println("ini benar " + benar + " dan ini salah " + salah);

        System.out.println("////////////////////////////");

        //integer tipe data yang didalamnya berupa angka
        int angka = 0;
        int angka1 = 1;

        System.out.println("ini angka yang ke- " + angka + " dan ini angka yang ke- " + angka1);

        //String tipe data yang menampilkan kumpulan huruf
        String Kalimat = "yusuf";
        System.out.println("nama panggilan saya adalah " + Kalimat);

        System.out.println("////////////////////////////");

        //jika ingin mengambil perhuruf kita bisa menggunakan char()
        //contoh kita akan mengambil huruf dari kata varibel Kalimat
        //kita akan mengambil huruf ke 5 dan di mulai dari angka 0

        //contoh ada kata seperti berikut kata Y U S U F
        //memiliki index                       0 1 2 3 4
        System.out.println("mengambil huruf dari variabel Kalimat");
        System.out.println(Kalimat.charAt(0));
        System.out.println( Kalimat.charAt(1));
        System.out.println( Kalimat.charAt(2));
        System.out.println( Kalimat.charAt(3));
        System.out.println( Kalimat.charAt(4));

        System.out.println("////////////////////////////");

        //tipe data float memiliki nilai berupa koma 0

        float ankaFloat = 10;
        System.out.println(ankaFloat);





    }
}
