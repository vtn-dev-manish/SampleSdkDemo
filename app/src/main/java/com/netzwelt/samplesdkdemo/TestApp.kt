package com.netzwelt.samplesdkdemo

import android.util.Log

class TestApp(name: String, id: Int) {
    private val NUMBER = 100
    fun doMe() {
        Log.v("Test", "DoMeCalled ${NUMBER+1}")
    }
}