package com.task1.uidesign

data class Business (var bName:String, var bNRICNo: String, var bPolicyNo: String){

    companion object{
        val business = ArrayList<Business>()
    }
}