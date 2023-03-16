package com.example.datafromfragmenttoactivity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel : ViewModel() {
    val messageForActivityOneFragment: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val messageForActivityTwoFragment: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}