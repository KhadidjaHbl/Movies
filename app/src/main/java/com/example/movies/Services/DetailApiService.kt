package com.example.movies.Services

import android.os.Parcelable
import com.example.movies.Models.Movie
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DetailApiService (
    val  Detail : Movie

) : Parcelable {
    constructor() : this(Movie())
}