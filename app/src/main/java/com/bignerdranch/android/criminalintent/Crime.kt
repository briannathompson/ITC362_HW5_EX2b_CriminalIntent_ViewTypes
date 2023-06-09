package com.bignerdranch.android.criminalintent

import java.util.*

data class Crime(
    val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean,
    val requiresPolice: Boolean     // TODO add requiresPolice Boolean to Crime data class
)
