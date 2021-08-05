package com.pratheek.resume

data class DummyDataClass(
    var a:Int,
    var b:Int,
    var name: String
){
    fun add():Int{
        return a+b
    }

    fun mul():Int{
        return a*b
    }

    fun concate():String{
        return "$name ${a}"
    }
}
