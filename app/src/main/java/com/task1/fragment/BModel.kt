package com.task1.uidesign

data class Business (var bName:String, var bNRICNo: String, var bPolicyNo: String){

    companion object{

        val business = listOf<Business>(
            Business("Chan Ching Lok","123456789874","A12546"),
            Business("Chan Ching Lok","123456789874","A12546"),
            Business("Chan Ching Lok","123456789874","A12546"),
            Business("Chan Ching Lok","123456789874","A12546"),
            Business("Chan Ching Lok","123456789874","A12546"),
            Business("Chan Ching Lok","123456789874","A12546"),
            Business("Chan Ching Lok","123456789874","A12546")
        )
    }
}