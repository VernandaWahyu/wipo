package com.excursionx.wipo;


import java.util.ArrayList;

class VacationData {
    private static String[] vacationNames = {
            "Ngebel",
            "Mloko Sewu",
            "Alun Alun Ponorogo",
            "Air Terjun Coban Lawe",
            "Tanah Goyang",
            "Gunung Gajah",
            "Gunung Beruk",
            "Air Terjun Sunggah",
            "Tumpak Lego",
            "Wisata Ngembag Ponorogo"
    };

    private static String[] vacationDetails = {
            "Telaga Ngebel terletak di Desa Ngrogung, Kecamatan Ngebel, Kabupaten Ponorogo, Jawa Timur",
            "Mloko Sewu terletak di Desa Pupus, Kecamatan Ngebel, Kabupaten Ponorogo, Jawa Timur",
            "Alun-Alun Ponorogo adalah salah satu destinasi menarik yang ada di Ponorogo. Serta merupakan salah satu andalan wisata di kota yang terkenal dengan kesenian Reog-nya ini",
            "Coban Lawe berlokasi di Krisik, Pudak, Kabupaten Ponorogo, Jawa Timur.",
            "Wisata Tanah Goyang Pudak di ponorogo adalah salah satu tempat wisata yang berada di desa pudak wetan , kecamatan pudak , kabupaten ponorogo , provinsi jawa timur , negara indonesia ",
            "Wisata Gunung Gajah di Ponorogo adalah salah satu tempat wisata yang berada di Desa Gajah, Kecamatan Sambit, kabupaten Ponorogo, Jawa Timur, Indonesia",
            "Gunung Beruk merupakan salah satu destinasi wisata alam yang ada di Ponorogo, tepatnya berada di Desa Karang Patihan, Kecamatan Balong, Kabupaten Ponorogo, Jawa Timur",
            "Wisata Air Terjun Sunggah di ponorogo adalah salah satu tempat wisata yang berada di desa Selur Kecamatan Ngrayun Kabupaten Ponorogo, Jawa Timur, Indonesia",
            "Tumpak Lego Hill berada di selatan Ponorogo tepatnya di Desa Ngrayun, Kecamatan Ngrayun, Kabupaten Ponorogo, Jawa Timur",
            "Wisata Taman Wisata Ngembag di ponorogo adalah salah satu tempat wisata yang berada di Desa Ronowijayan, Kecamatan Siman, Kabupaten Ponorogo, Jawa Timur, Indonesia"
    };

    private static int[] vacationImages = {
            R.drawable.ngebel,
            R.drawable.mloko,
            R.drawable.alun_alun,
            R.drawable.coban_lawe,
            R.drawable.tanah_goyang,
            R.drawable.gunung_gajah,
            R.drawable.beruk,
            R.drawable.sunggah,
            R.drawable.tumpak,
            R.drawable.ngembag
    };

    static ArrayList<Vacation> getListData() {
        ArrayList<Vacation> list = new ArrayList<>();
        for (int position = 0; position < vacationNames.length; position++) {
            Vacation vacation = new Vacation();
            vacation.setName(vacationNames[position]);
            vacation.setDetail(vacationDetails[position]);
            vacation.setPhoto(vacationImages[position]);
            list.add(vacation);
        }
        return list;
    }
}
