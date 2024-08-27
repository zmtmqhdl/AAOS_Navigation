package com.example.aaos_place

import androidx.car.app.Screen
import androidx.car.app.Session

class PlaceSession : Session() {
    override fun onCreateScreen(intent: android.content.Intent): Screen {
        return PlaceScreen(carContext)
    }
}