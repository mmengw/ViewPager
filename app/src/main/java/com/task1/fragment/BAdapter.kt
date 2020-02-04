package com.task1.uidesign

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.task1.fragment.R
import kotlinx.android.synthetic.main.fragment_one.view.*

class BAdapter (val context: Context, val business:ArrayList<Business>):RecyclerView.Adapter<BAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MyViewHolder{
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_one,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int{
        return business.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int){
        val name = business[position]
        val nRICNo = business[position]
        val policyNO = business[position]
        holder.setData(name,nRICNo,policyNO,position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var currentName:Business? = null
        var currentNRIC:Business? = null
        var currentPolicyNo:Business? = null
        var currentBPosition: Int = 0

        fun setData(name:Business?,nRICNo: Business?, policyNO: Business?, Position:Int){
            itemView.cusName.text=name!!.bName
            itemView.cusNRICNo.text=nRICNo!!.bNRICNo
            itemView.cusPolicyNo.text=policyNO!!.bPolicyNo

            this.currentName=name
            this.currentNRIC=nRICNo
            this.currentPolicyNo=policyNO
            this.currentBPosition=Position


        }
    }

}
