package com.example.studyapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_lesson.view.*

class AndroidAdapter(val context: Context, val AsLessons: List<LessonsAndroid>): RecyclerView.Adapter<AndroidAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun setData(lesson: LessonsAndroid? , pos: Int) {
            itemView.tvTitle.text = lesson!!.title
            itemView.tvDescription.text = lesson!!.description
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =  LayoutInflater.from(context).inflate(R.layout.row_lesson, parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val lessonsAndroid  = AsLessons[position]
        holder.setData(lessonsAndroid  , position)

    }

    override fun getItemCount(): Int {
        return AsLessons.size
    }



}