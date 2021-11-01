package edu.stanford.ralbraid.mymaps

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import edu.stanford.ralbraid.mymaps.model.UserMap

class MapsAdapter(val context: Context, val userMaps: List<UserMap> ): RecyclerView.Adapter<MapsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val view = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val userMap = userMaps[position]
        val textViewTitle = holder.itemView.findViewById<TextView>(android.R.id.text1)
        holder.itemView.setOnClickListener(){

        }

        textViewTitle.text = userMap.title
    }

    override fun getItemCount() = userMaps.size

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}
