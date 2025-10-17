package com.example.androidtest3.ui.characters.view

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidtest3.ui.characters.viewmodel.MainViewModel
import com.example.androidtest3.adapter.CharacterRecyclerViewAdapter
import com.example.androidtest3.data.model.Result
import com.example.androidtest3.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val vModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = CharacterRecyclerViewAdapter()

        binding.characterRecycler.layoutManager = LinearLayoutManager(this@MainActivity)
        binding.characterRecycler.adapter = adapter

        lifecycleScope.launch {
            vModel.getCharacter.collect {
                if (it != null) {
                    val list: List<Result?>? = it.let { results ->
                        results.results
                    }

                    list?.let {
                        adapter.submit(list)
                    }
                }

                Log.println(
                    Log.INFO,
                    "http",
                    "Result" + it?.let { results -> results.results?.size ?: 0 })
            }
        }

        vModel.detonatorCharacter()
    }
}