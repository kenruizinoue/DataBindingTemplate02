package com.kenruizinoue.databindingtemplate02

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val message = MutableLiveData<String>()

    init {
        message.value = "Hello"
    }

}