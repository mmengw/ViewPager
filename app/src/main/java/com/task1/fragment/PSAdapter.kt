package com.task1.uidesign

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.task1.fragment.R
import kotlinx.android.synthetic.main.fragment_two.view.*

class PSAdapter (val context: Context, val policyService:ArrayList<PService>):RecyclerView.Adapter<PSAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MyViewHolder{
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_two,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int{
        return policyService.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int){
        val name = PService.policyService[position]
        val nRICNo = PService.policyService[position]
        val policyNo = PService.policyService[position]
        val pros = PService.policyService[position]
        holder.setData(name,nRICNo,policyNo,pros,position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var currentName:PService? = null
        var currentNRIC:PService? = null
        var currentPolicyNo:PService? = null
        var currrentProcess:PService? = null
        var currentBPosition: Int = 0

        fun setData(name:PService?,nRICNo: PService?, policyNo: PService?,pros:PService?, Position:Int){
            itemView.PSName.text=name!!.PSName
            itemView.PSNRICNo.text=nRICNo!!.PSNRICNo
            itemView.PSPolicyNo.text=policyNo!!.PSPolicyNo
            itemView.PSProcess.text=pros!!.PSProcess

            this.currentName=name
            this.currentNRIC=nRICNo
            this.currentPolicyNo=policyNo
            this.currrentProcess=pros
            this.currentBPosition=Position


        }
    }

}
