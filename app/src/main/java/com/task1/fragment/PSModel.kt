package com.task1.uidesign

data class PService (var PSName:String, var PSNRICNo: String , var PSPolicyNo: String, var PSProcess: String){

    companion object{
        val policyService = ArrayList<PService>()
    }
}