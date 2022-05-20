package com.nepplus.a20220520_jickbangcopy_recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nepplus.a20220520_jickbangcopy_recyclerview.R
import com.nepplus.a20220520_jickbangcopy_recyclerview.modles.RoomData

class RoomRecyclerViewAdapter(val mContext : Context, val mList : List<RoomData>) : RecyclerView.Adapter<RoomRecyclerViewAdapter.MyviewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val row = LayoutInflater.from(mContext).inflate(R.layout.room_list_item, parent, false)
        return MyviewHolder(row)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return mList.size
    }
    inner class MyviewHolder(view : View) : RecyclerView.ViewHolder(view){

    }
}