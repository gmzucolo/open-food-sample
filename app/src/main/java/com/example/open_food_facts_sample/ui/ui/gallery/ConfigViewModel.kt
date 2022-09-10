package com.example.open_food_facts_sample.ui.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ConfigViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is config Fragment"
    }
    val text: LiveData<String> = _text
}