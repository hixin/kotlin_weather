package com.cloudminds.airobot

import android.content.Context
import android.widget.Toast

/**
 * @Description TODO
 * Created by sain on 2019-06-13 09:56 Thursday.
 * Copyright © 2019. All rights reserved.
 * ================================================================================
 * 温馨提示
 * 代码千万行，注释第一行。
 * 命名不规范，同事泪两行。
 */
class Person (name: String, surname: String) : Animal(name){

    fun add (x: Int, y: Int) : Int {
        return x + y
    }

    fun aad2 (x: Int, y: Int) : Int = x + y

    var i: Int = 7
    var d: Double  = i.toDouble()
    val s = "Example"
    val c  = s[2]

    fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }



}

