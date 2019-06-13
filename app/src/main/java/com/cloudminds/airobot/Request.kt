package com.cloudminds.airobot

import android.util.Log
import java.net.URL

/**
 * @Description TODO
 * Created by sain on 2019-06-13 14:03 Thursday.
 * Copyright © 2019. All rights reserved.
 * ================================================================================
 * 温馨提示
 * 代码千万行，注释第一行。
 * 命名不规范，同事泪两行。
 */

class Request(val url: String) {
    fun run() {
        val foreccastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, foreccastJsonStr)
    }
}