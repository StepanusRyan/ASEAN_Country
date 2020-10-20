package com.stepanusryan.aseancountries;

import java.util.ArrayList;

public class DataNegara {
    private static String[] namanegara =
            {
                    "Indonesia",
                    "Malaysia",
                    "Singapura",
                    "Brunei Darusallam",
                    "Thailand",
                    "Vietnam",
                    "Kamboja",
                    "Laos",
                    "Myanmar",
                    "Filipina"
            };
    private static String[] ibukota =
            {
                    "Jakarta",
                    "Kuala Lumpur",
                    "Singapura",
                    "Bandar Seri Begawan",
                    "Bangkok",
                    "Hanoi",
                    "Phnom Penh",
                    "Vientiane",
                    "Naypyitaw",
                    "Manila"
            };
    private static String [] desc =
            {
                    "Indonesia disebut juga dengan Republik Indonesia (RI) atau Negara Kesatuan Republik Indonesia (NKRI), adalah negara di Asia Tenggara yang dilintasi garis khatulistiwa dan berada di antara daratan benua Asia dan Australia, serta antara Samudra Pasifik dan Samudra Hindia",
                    "Malaysia adalah sebuah negara federal yang terdiri dari tiga belas negeri (negara bagian) dan tiga wilayah federal di Asia Tenggara dengan luas 329.847 km persegi. Ibu kotanya adalah Kuala Lumpur, sedangkan Putrajaya menjadi pusat pemerintahan federal.",
                    "Singapura (nama resmi: Republik Singapura) adalah sebuah negara pulau di lepas ujung selatan Semenanjung Malaya, 137 kilometer (85 mi) di utara khatulistiwa di Asia Tenggara. Negara ini terpisah dari Malaysia oleh Selat Johor di utara, dan dari Kepulauan Riau, Indonesia oleh Selat Singapura di selatan",
                    "Brunei Darussalam atau Brunei, nama resmi: Negara Brunei Darussalam adalah negara berdaulat di Asia Tenggara yang terletak di pantai utara pulau Kalimantan. Negara ini memiliki wilayah seluas 5.765 km² yang menempati pulau Borneo dengan garis pantai seluruhnya menyentuh Laut Tiongkok Selatan. Wilayahnya dipisahkan ke dalam dua negara bagian di Malaysia yaitu Sarawak dan Sabah.",
                    "Kerajaan Thai yang lebih sering disebut Thailand dalam bahasa Inggris, atau dalam bahasa aslinya Mueang Thai  berarti Negeri Thai, adalah sebuah negara di Asia Tenggara yang berbatasan dengan Laos dan Kamboja di timur, Malaysia dan Teluk Siam di selatan, dan Myanmar dan Laut Andaman di barat.",
                    "Vietnam, bernama resmi Republik Sosialis Vietnam adalah negara paling timur di Semenanjung Indochina di Asia Tenggara. Vietnam berbatasan dengan Republik Rakyat Tiongkok di sebelah utara, Laos di sebelah barat laut, Kamboja di sebelah barat daya dan di sebelah timur terbentang Laut China Selatan.",
                    "Kerajaan Kamboja adalah sebuah negara berbentuk monarki konstitusional di Asia Tenggara. Negara ini merupakan penerus Kekaisaran Khmer yang pernah menguasai seluruh Semenanjung Indochina antara abad ke-11 dan 14. Kamboja berbatasan dengan Thailand di sebelah barat, Laos di utara, Vietnam di timur, dan Teluk Thailand di selatan. Sungai Mekong dan Danau Tonle Sap melintasi negara ini.",
                    "Republik Demokratik Rakyat Laos adalah negara yang terkurung daratan di Asia Tenggara, berbatasan dengan Myanmar dan Republik Rakyat Tiongkok di sebelah barat laut, Vietnam di timur, Kamboja di selatan, dan Thailand di sebelah barat. Dari abad ke-14 hingga abad ke-18, negara ini disebut Lan Xang atau Negeri Seribu Gajah",
                    "Republik Persatuan Myanmar (juga dikenal sebagai Birma, disebut Burma di dunia Barat) adalah sebuah negara berdaulat di Asia Tenggara. Myanmar berbatasan dengan India dan Bangladesh di sebelah barat, Thailand dan Laos di sebelah timur dan China di sebelah utara dan timur laut. Negara seluas 676.578 km² ini telah diperintah oleh pemerintahan militer sejak kudeta tahun 1988. Negara ini adalah negara berkembang dan memiliki populasi lebih dari 51 juta jiwa (sensus 2014). Ibu kota negara ini sebelumnya terletak di Yangon sebelum dipindahkan oleh pemerintahan junta militer ke Naypyidaw pada tanggal 7 November 2005. Myanmar telah bergabung sebagai anggota Perhimpunan Bangsa-Bangsa Asia Tenggara (ASEAN) sejak tahun 1997.",
                    "Filipina atau Republik Filipina (bahasa Tagalog: Republika ng Pilipinas) adalah sebuah negara republik di Asia Tenggara, sebelah utara Indonesia, dan Malaysia. Filipina merupakan sebuah negara kepulauan yang terletak di Lingkar Pasifik Barat, negara ini terdiri dari 7.641 pulau. Selama ribuan tahun, warga kepulauan Filipina,telah mengembangkan sistem cocok tanam Padi yang sangat maju, yang menyediakan makanan pokok bagi masyarakatnya.",
            };
    private static int[] foto =
            {
                    R.drawable.indonesia,
                    R.drawable.malaysia,
                    R.drawable.singapore,
                    R.drawable.brunei,
                    R.drawable.thailand,
                    R.drawable.vietnam,
                    R.drawable.cambodia,
                    R.drawable.laos,
                    R.drawable.myanmar,
                    R.drawable.philippines
            };
    private static String[] lagu =
            {
                    "Indonesia Raya",
                    "Negaraku",
                    "Majulah Singapura",
                    "Allah Peliharakan Sultan",
                    "Phleng Chat Thai",
                    "Tiến Quân Ca",
                    "Nokor Reach",
                    "Pheng Xat Lao",
                    "Kaba Ma Kyei",
                    "Lupang Hinirang"
            };
    private static String[] pemimpin =
            {
                    "Joko Widodo",
                    "Muhyiddin Yassin",
                    "Halimah Yacob",
                    "Hassanal Bolkiah",
                    "Maha Vajiralongkorn",
                    "Nguyễn Phú Trọng",
                    "Norodom Sihamoni",
                    "Bounnhang Vorachith",
                    "Win Myint",
                    "Rodrigo Duterte"
            };
    private static String[] semboyan =
            {
                    "Bhineka Tunggal Ika",
                    "Bersekutu Bertambah Mutu",
                    "Majulah Singapura",
                    "Sentiasa membuat kebajikan dengan petunjuk Allah",
                    "ชาติ ศาสนา พระมหากษัตริย์",
                    "Ðộc lập, tự do, hạnh phúc",
                    "ជាតិ សាសនា ព្រះមហាក្សត្",
                    "ສັນຕິພາບ ເອກະລາດ ປະຊາທິປະໄຕ ເອກະພາບ",
                    "Gabar Majay Bamar",
                    "Maka-Diyos, Makatao, Makakalikasan at Makabansa"
            };
    private static String[] arti =
            {
                    "(Berbeda - beda tetapi tetap satu)",
                    "(Persatuan adalah kekuatan)",
                    "",
                    "",
                    "(Negara, Agama, Raja)",
                    "(Kemerdekaan, kebebasan dan kebahagiaan)",
                    "(Bangsa, Agama, Raja)",
                    "(Perdamaian, Kemerdekaan, Demokrasi, Persatuan)",
                    "",
                    "(Untuk Cinta Tuhan, Rakyat, Alam dan Negara)"
            };
    static ArrayList<Negara> getdata()
    {
        ArrayList<Negara> daftar = new ArrayList<>();
        for (int posisi = 0; posisi < namanegara.length; posisi++)
        {
            Negara negara = new Negara();
            negara.setNama(namanegara[posisi]);
            negara.setIbukota(ibukota[posisi]);
            negara.setDeskripsi(desc[posisi]);
            negara.setLagu(lagu[posisi]);
            negara.setFoto(foto[posisi]);
            negara.setPemimpin(pemimpin[posisi]);
            negara.setSemboyan(semboyan[posisi]);
            negara.setArti(arti[posisi]);
            daftar.add(negara);
        }
        return daftar;
    }
}
