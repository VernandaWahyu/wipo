package com.excursionx.wipo;


import java.util.ArrayList;

class KulinerData {
    private static String[] kulinerNames = {
            "Gogegog",
            "Sate Ayam",
            "Tiwul",
            "Gethuk",
            "Dawet",
            "Jenang"
    };

    private static String[] kulinerDetails = {
            "Kuliner tradisional lain di Ponorogo adalah Sego Gegog. Konon, masakan ini merupakan makanan favorit para warok, yakni orang sakti dalam kesenian reog. Salah satu alasannya, kuliner ini memiliki rasa yang pedas.",
            "Sate ayam yang dikembangkan di Ponorogo memiliki ciri khas tersendiri. Salah satunya dari irisan dagingnya yang memanjang dan pipih. Dengan demikian, bentuknya pun berbeda dibandingkan dengan makanan serupa dari beberapa dari daerah. Sate ayam Madura, misalnya, memiliki irisan yang kotak-kotak dan menyerupai dadu.",
            "Saat ini, nasi tiwul sudah mulai sulit ditemukan. Namun, tidak di Ponorogo. Makanan khas Ponorogo ini akan memberikan kamu pengalaman kuliner yang tentu saja berbeda dengan kota lain",
            "Jajanan tradisional ini juga sudah dibuat dan dijual secara turun temurun. Saat ini, mayoritas warga yang masih memproduksinya merupakan generasi ketiga dari pembuat sebelumnya. Meski demikian, salah satu kuliner masih banyak diminati.",
            "Minuman pelepas dahaga ini banyak dijual di wilayah Desa Jabung, Kecamatan Mlarak. Sejumlah lapak penjual kuliner ini banyak berdiri di kawasan perempatan yang tak jauh dari Pondok Modern Darussalam Gontor.",
            "Jajanan ini merupakan salah satu komoditas legendaris di Ponorogo. Sebab, sudah ada sejak puluhan tahun lalu dan masih eksis hingga hari ini karena rasa, teksturnya yang legit banyak diminati pecinta kuliner. Maka tak heran, Jenang Mirah ini banyak digunakan sebagai oleh-oleh."
    };

    private static int[] kulinerImages = {
            R.drawable.gegog,
            R.drawable.sate,
            R.drawable.tiwul,
            R.drawable.gethuk,
            R.drawable.dawet,
            R.drawable.jenang,

    };

    static ArrayList<Kuliner> getListData() {
        ArrayList<Kuliner> list = new ArrayList<>();
        for (int position = 0; position < kulinerNames.length; position++) {
            Kuliner kuliner = new Kuliner();
            kuliner.setName(kulinerNames[position]);
            kuliner.setDetail(kulinerDetails[position]);
            kuliner.setPhoto(kulinerImages[position]);
            list.add(kuliner);
        }
        return list;
    }
}
