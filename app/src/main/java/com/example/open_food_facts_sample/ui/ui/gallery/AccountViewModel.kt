package com.example.open_food_facts_sample.ui.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AccountViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is conta Fragment"
    }
    val text: LiveData<String> = _text
}