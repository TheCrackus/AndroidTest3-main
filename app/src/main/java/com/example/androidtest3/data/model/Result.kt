package com.example.androidtest3.data.model

import com.example.androidtest3.data.model.Location
import com.example.androidtest3.data.model.Origin

data class Result(
    var created: String?,
    var episode: List<String?>?,
    var gender: String?,
    var id: Int?,
    var image: String?,
    var location: Location?,
    var name: String?,
    var origin: Origin?,
    var species: String?,
    var status: String?,
    var type: String?,
    var url: String?
)