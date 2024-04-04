package com.example.horoscapp.ui.luck.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LuckyModel(
    @DrawableRes
    val img: Int,
    @StringRes
    val text: Int
)
