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

class ScienceFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_science, container, false)
        val rvBuku: RecyclerView = rootView.findViewById(R.id.recyclerViewBuku)
        rvBuku.layoutManager = LinearLayoutManager(requireContext())
        val data = ArrayList<BukuModel>()

        data.add(BukuModel(R.drawable.book1,"Emi's Beach Adventure",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book2,"Ade's Adventure",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book3,"Mermaid To Rescue",
            "Lorem ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))

        val adapter = AdapterHome(data)
        rvBuku.adapter = adapter
        return rootView

    }

}