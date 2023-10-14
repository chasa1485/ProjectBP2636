package com.example.project2636

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectbp2636.AdapterHome
import com.example.projectbp2636.BukuModel
import com.example.projectbp2636.R

class FableFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_fable, container, false)
        val rvBuku: RecyclerView = rootView.findViewById(R.id.recyclerViewBuku)
        rvBuku.layoutManager = LinearLayoutManager(requireContext())
        val data = ArrayList<BukuModel>()

        data.add(BukuModel(R.drawable.book4,"Sang Raja Hutan",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book5,"Sinbad si Pelaut",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book6,"The of Toofus",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))

        val adapter = AdapterHome(data)
        rvBuku.adapter = adapter
        return rootView

    }

}