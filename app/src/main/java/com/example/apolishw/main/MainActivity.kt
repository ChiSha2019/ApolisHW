package com.example.apolishw.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject
import com.example.apolishw.R
import sun.jvm.hotspot.utilities.IntArray



class MainActivity : DaggerAppCompatActivity {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        @Inject
        val providerFactory: ViewModelProviderFactory

        val viewModel = ViewModelProviders.of(this, providerFactory).get(MyViewModel::class.java)
    }
}
