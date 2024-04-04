package com.example.horoscapp.data.providers

import com.example.horoscapp.domain.model.HoroscopeInfo
import com.example.horoscapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProviders @Inject constructor() {
    fun getHoroscopeInfo(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}