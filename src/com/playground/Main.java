package com.playground;

public class Main {
    public static void main(String[] args) {

        //percabangan pada java

        //single statement
        boolean nama = true;

        if (nama == true ){
            System.out.println("silahkan masuk");
        }

        System.out.println("////////////////////////////");

        //percabangan else  / double statement

        //ini akan mencetak yang kedua
        if (nama != true){

            System.out.println("silahkan masuk");
        }else {
            System.out.println("anda tidak boleh masuk");
        }

        System.out.println("////////////////////////////");

        //banyak percabangan many statement

        int umur = 21;

        if (nama == true && umur== 21 ){

            System.out.println("aku masih muda");
        } else if(nama == false && umur== 21 ){
            System.out.println("kamu siapa dan muda");
        } else if(nama == true && umur== 40 ){
            System.out.println("aku sudah tua");
        }else {
            System.out.println("kamu siapa dan kamu tua");
        }

        //kita tinggal mainkan saja variabelnya



    }
}
