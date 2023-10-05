package com.example.horoscapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.navArgs
import com.example.horoscapp.databinding.ActivityDetailBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HorocospeDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private val horoscopeDetailViewModel: HoroscopeDetailViewModel by viewModels()
    private val args:HorocospeDetailActivityArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}