package utb.praktikum.uts

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
//        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        val itemList = listOf(
            ItemList("Ilmuan Ungkap Ynag terjadi Pada Otak Manusia Sebelum Meninggal", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEiGy-Fves8nC6f5QO1Vh0dXwAgL19cx13eg&s",
            "https://shorturl.at/UZkNO"),
            ItemList(
                "Listrik Bali Pulih Lagi, Sempat Blackout Gara-gara ini", "https://akcdn.detik.net.id/community/media/visual/2025/02/03/diskon-50-bikin-tarif-listrik-alami-deflasi-3203-2_169.jpeg?w=700&q=90",
            "https://shorturl.at/u0Cyt"),
            ItemList(
                "Modus Bejat Predator Seks di Jepara Pakai Medsos Untuk Rayu Korban", "https://akcdn.detik.net.id/community/media/visual/2025/04/30/pelaku-predator-seks-di-jepara-pria-inisial-s-21-tampak-memakai-baju-tahanan-warna-biru-dan-bermasker-rabu-3042025-1745995803988_169.jpeg?w=700&q=90",
            "https://shorturl.at/zqFoY"),
            ItemList(
                "Kompolnas Dukung Polisi Usut Jaringan Narkoba soal bisnis ", "https://akcdn.detik.net.id/community/media/visual/2019/12/05/4078cee0-1b00-4800-bf73-6f87416b9e52_169.jpeg?w=700&q=90",
                "https://shorturl.at/7NskY"),
            ItemList(
                "Prabowo Beri Selamat ke PM Albanese, Harap Kerja Sama RI-Australia Makin Kuat", "https://akcdn.detik.net.id/community/media/visual/2025/03/22/prabowo-subianto-pimpin-sidang-kabinet-jumat-213-1742593498287_169.jpeg?w=700&q=90",
                "https://shorturl.at/Eh0YE"),
            ItemList(
                "Vasektomi Jadi Syarat Bansos Dikritik, Dedi Mulyadi: Ada Alternatif Lain", "https://akcdn.detik.net.id/community/media/visual/2025/05/03/gubernur-jabar-dedi-mulyadi-di-purwakarta-1746267267625_169.jpeg?w=700&q=90",
                "https://tinyurl.com/yjxcvfew"),

        )

        val adapter = AdapterList(itemList)
        recyclerView.adapter = adapter

        }

    }



