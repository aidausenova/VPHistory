package com.example.viewpagerhistory

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var counter = 0
    private val archive = MutableLiveData<String>()
    private val mCounter = MutableLiveData<Int>()

    val archiveCount: LiveData<Int>
        get() = mCounter

    val history: LiveData<String>
        get() = archive

    fun onPlusClick() {
        counter++
        mCounter.value = counter

        archive.value += plus
    }

    fun onMinusClick() {
        counter--
        mCounter.value = counter

        archive.value += minus
    }

    init {
        mCounter.postValue(0)
        archive.postValue("")
    }

    companion object {
        const val plus = " +"
        const val minus = " -"
    }
}
