package com.example.studyapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_lesson.view.*

class KotlinAdapter(val context: Context , val ktLessons: List<Lessons>): RecyclerView.Adapter<KotlinAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun setData(lesson: Lessons?, pos: Int) {
          itemView.tvTitle.text = lesson!!.title
            itemView.tvDescription.text = lesson!!.description
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
      val view =  LayoutInflater.from(context).inflate(R.layout.row_lesson, parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val lesson = ktLessons[position]
        holder.setData(lesson, position)

    }

    override fun getItemCount(): Int {
        return ktLessons.size
    }
}