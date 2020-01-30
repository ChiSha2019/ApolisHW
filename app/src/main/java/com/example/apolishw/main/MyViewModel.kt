package com.example.apolishw.main

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MyViewModel : ViewModel @Inject constructor( randomApi : RandomApi){

    val MYTAG = "MyViewModel"

    Log.d(MYTAG , "MyViewModel: my viewmodel is working...")



}