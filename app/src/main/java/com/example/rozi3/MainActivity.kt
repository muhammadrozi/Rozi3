package com.example.rozi3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview =  findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Ir soekarno", "Presiden ke-1 Indonesia.", R.drawable.soekarnoo))
        list.add(Model("Soeharto", "Presiden ke-2 Indonesia.", R.drawable.soehartoo))
        val add = list.add(Model("BJ Habibie", "Presiden ke-3 Indonesia.", R.drawable.habibiee))
        list.add(Model("Abdurrahman Wahid", "Presiden ke-4 Indonesia.", R.drawable.gusdurr))
        list.add(Model("megawati", "Presiden ke-5 Indonesia", R.drawable.megaw))
        list.add(Model("Susilo Bambang Yudhoyono", "Presiden ke-6 Indonesia", R.drawable.sbyy))
        list.add(Model("Joko Widodo", "Presiden ke-7 Indonesia", R.drawable.jokowii))

        listview.adapter = MyAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position == 0 ){
                Toast.makeText(this@MainActivity, "(Soekkarno)(lahir di Surabaya, Jawa Timur, 6 Juni 1901 ) adalah Presiden Indonesia yang menjabat pada tahun 1945–1966.", Toast.LENGTH_LONG).show()
            }
            if (position == 1 ){
                Toast.makeText(this@MainActivity, "(Soeharto)lahir di Dusun Kemusuk, Desa Argomulyo, Kecamatan Sedayu, Bantul, Yogyakarta, 8 Juni 1921 ) adalah Presiden Indonesia yang menjabat pada tahun 1967-1998. ", Toast.LENGTH_LONG).show()
            }
            if (position == 2 ){
                Toast.makeText(this@MainActivity, "Prof. Dr.-Ing. H. Bacharuddin Jusuf Habibie, Freng (lahir di Parepare, Sulawesi Selatan, 25 Juni 1936 ) adalah Presiden Indonesia. Ia menggantikan Soeharto yang mengundurkan diri dari jabatan presiden pada tanggal 21-05-1998. ", Toast.LENGTH_LONG).show()
            }
            if (position == 3 ){
                Toast.makeText(this@MainActivity, "Dr.(H.C.) K. H. Abdurrahman Wahid atau yang akrab disapa Gus Dur (lahir di Jombang, Jawa Timur, 7 September 1940 ) adalah tokoh Muslim Indonesia dan pemimpin politik yang menjadi Presiden Indonesia yang menjabat dari tahun 1999-2001.", Toast.LENGTH_LONG).show()
        }
        if (position == 4 ){
            Toast.makeText(this@MainActivity, "Dr.(H.C.) Hj. Dyah Permata megawati Setyawati Soekarnoputri atau umumnya lebih dikenal sebagai megawati Soekarnoputri (lahir di Yogyakarta, 23 Januari 1947) adalah Presiden Indonesia yang menjabat sejak 23-05-2001 - 20-10-2004.", Toast.LENGTH_LONG).show()
        }
        if (position == 5 ){
            Toast.makeText(this@MainActivity, "Jenderal TNI (Purn.) Prof. Dr. H. Susilo Bambang Yudhoyono GCB AC (lahir di Tremas, Arjosari, Pacitan, Jawa Timur, Indonesia, 9 September 1949) adalah Presiden Indonesia yang menjabat sejak 20-10-2004 - 20-10-2014.", Toast.LENGTH_LONG).show()
        }
            if (position == 6 ){
                Toast.makeText(this@MainActivity, "Ir. H. Joko Widodo atau yang lebih akrab disapa Jokowi (lahir di Surakarta, Jawa Tengah, 21 Juni 1961) adalah Presiden Indonesia yang menjabat sejak 20-10-2014.", Toast.LENGTH_LONG).show()
            }
        }
    }
}