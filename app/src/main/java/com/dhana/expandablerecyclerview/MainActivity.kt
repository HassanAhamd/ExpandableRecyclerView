package com.dhana.expandablerecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {


    val versionlist = ArrayList<Versions>()
    lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)


        intialdata()
        setRecyclerView()
    }

    fun intialdata() {
        versionlist.add(Versions("Kotlin1", "Version 2.2", "Api level 19", "This is Kotlin Card1"))
        versionlist.add(Versions("Kotlin2", "Version 2.3", "Api level 20", "This is Kotlin Card2"))
        versionlist.add(Versions("Kotlin3", "Version 2.4", "Api level 21", "This is Kotlin Card3"))
        versionlist.add(Versions("Kotlin4", "Version 2.5", "Api level 22", "This is Kotlin Card4"))
        versionlist.add(Versions("Kotlin5", "Version 2.6", "Api level 23", "This is Kotlin Card5"))
        versionlist.add(Versions("Kotlin6", "Version 2.7", "Api level 24", "This is Kotlin Card6"))
        versionlist.add(Versions("Kotlin7", "Version 2.8", "Api level 25", "This is Kotlin Card7"))
        versionlist.add(Versions("Kotlin8", "Version 2.9", "Api level 26", "This is Kotlin Card8"))
        versionlist.add(Versions("Kotlin9", "Version 3.0", "Api level 27", "This is Kotlin Card9"))
    }


    fun setRecyclerView() {

        val versionadapter = VersionAdapter(versionlist)

        recyclerView.adapter = VersionAdapter(versionlist)
        recyclerView.setHasFixedSize(true)


    }
}