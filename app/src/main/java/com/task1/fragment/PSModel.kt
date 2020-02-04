package com.task1.uidesign

data class PService (var PSName:String, var PSNRICNo: String , var PSPolicyNo: String, var PSProcess: String){

    companion object{
        val policyService = listOf<PService>(
            PService("ching chong ling","123456789874","PS123456","deposit withdrawal"),
            PService("ching chong ling","123456789874","PS123456","deposit withdrawal"),
            PService("ching chong ling","123456789874","PS123456","deposit withdrawal")
        )
    }
}