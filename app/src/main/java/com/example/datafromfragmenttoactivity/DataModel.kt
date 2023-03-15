package com.example.datafromfragmenttoactivity

import androidx.lifecycle.MutableLiveData

open class DataModel {
    val messageForActivityOneFragment: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val messageForActivityTwoFragment: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}