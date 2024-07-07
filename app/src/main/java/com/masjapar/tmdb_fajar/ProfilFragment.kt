package com.masjapar.tmdb_fajar

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.masjapar.tmdb_fajar.R

class ProfilFragment : Fragment() {

    lateinit var image: ImageView
    lateinit var title: TextView
    lateinit var subtitle: TextView
    lateinit var list: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val root = inflater.inflate(R.layout.fragment_profil, container, false)

        title = root.findViewById(R.id.title)
        subtitle = root.findViewById(R.id.subtitle)
        image = root.findViewById(R.id.image)
        list = root.findViewById(R.id.list)

        title.text = "FAJAR HIDAYAT"
        subtitle.text = "2210031802013"
        list.adapter = linkAdapter

        return root
    }


    private val linkAdapter by lazy {
        val items = listOf<LinkModel>(
            LinkModel("Fajar Hidayat", R.drawable.wa, "https://wa.me/qr/E25Q5KHVM7WOB1"),
            LinkModel("fajarhidayat___", R.drawable.ig, "https://www.instagram.com/fajarhidayat___?igsh=MWU2dXJvM2dyYTN5Yg=="),
            LinkModel("acijikiwirrruhuyy", R.drawable.tt, "https://www.tiktok.com/@acijiwirrruhuyy?_t=8nKR91XRzTl&_r=1"),
            LinkModel("Mas Black", R.drawable.yt, "https://www.youtube.com/@masblack_"),
            LinkModel("Fajar Hidayat", R.drawable.linkedin, "https://www.linkedin.com/in/fajar-hidayat-78085a312?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app"),
            LinkModel("Fajar22-Dev", R.drawable.git, "https://github.com/Fajar22-Dev"),


        )

        LinkAdapter(items, object : LinkAdapter.AdapterListener {
            override fun onClick(linktree: LinkModel) {1
                Log.e("onClick", linktree.url)
                openUrl(linktree.url)
            }

        })
    }

    private fun openUrl(url: String) {
        val openUrl = Intent(Intent.ACTION_VIEW)
        openUrl.data = Uri.parse(url)
        startActivity(openUrl)
    }
}