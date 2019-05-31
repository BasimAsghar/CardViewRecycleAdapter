package com.asghar.cardlistapplication

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private val titles = arrayOf("Jessica Jones",
        "Dwayne Johnson", "Howard Smith", "Darren Michael",
        "Mohammad Ali", "Sophia Ava", "Isla Alfie",
        "Isabella Freddie", "Jacob Howard", "George Oliver", "Noah D Jack",
        "Aaron Faison")

    private val details = arrayOf("Details", "Details",
        "Details", "Details",
        "Details", "Details",
        "Details", "Details",
        "Details", "Details",
        "Details", "Details")

    private val images = intArrayOf(R.drawable.person_image,
        R.drawable.person_image, R.drawable.person_image,
        R.drawable.person_image, R.drawable.person_image,
        R.drawable.person_image, R.drawable.person_image,
        R.drawable.person_image, R.drawable.person_image,
        R.drawable.person_image, R.drawable.person_image,
        R.drawable.person_image)
    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.cardview, viewGroup, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])

        viewHolder.itemView.setOnClickListener{view->
            //Toast.makeText(view.context,viewHolder.itemTitle.text.toString(), Toast.LENGTH_SHORT).show()
            val adapterIntent = Intent(view.context, CardActivity::class.java)
            adapterIntent.putExtra("FRAGMENT_TEXT",viewHolder.itemTitle.text.toString())
            view.context.startActivity(adapterIntent)
        }

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.image_person)
            itemTitle = itemView.findViewById(R.id.person_name)
            itemDetail = itemView.findViewById(R.id.person_age)

        }



    }
}