package com.dhana.expandablerecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VersionAdapter(val versionlist: List<Versions>) :
    RecyclerView.Adapter<VersionAdapter.VersionVH>() {

    inner class VersionVH(itemView: View) : RecyclerView.ViewHolder(itemView) {


        var card_name = itemView.findViewById<TextView>(R.id.card_name)
        var version = itemView.findViewById<TextView>(R.id.version)
        var api = itemView.findViewById<TextView>(R.id.api)
        var description = itemView.findViewById<TextView>(R.id.description)
        var linearlayout = itemView.findViewById<LinearLayout>(R.id.linearlayout)
        var expandable_layout = itemView.findViewById<RelativeLayout>(R.id.expandable_layout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VersionVH {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return VersionVH(view)

    }

    override fun onBindViewHolder(holder: VersionVH, position: Int) {

        val versions: Versions = versionlist[position]
        holder.card_name.text = versions.card_name
        holder.api.text = versions.api
        holder.version.text = versions.version
        holder.description.text = versions.description

        val isexpand: Boolean = versionlist[position].isexpand
        holder.expandable_layout.visibility = if (isexpand) VISIBLE else GONE

        holder.linearlayout.setOnClickListener(){
            val versions = versionlist[position]
            versions.isexpand = !versions.isexpand
            notifyItemChanged(position)


        }

    }

    override fun getItemCount(): Int {
        return versionlist.size

    }
}