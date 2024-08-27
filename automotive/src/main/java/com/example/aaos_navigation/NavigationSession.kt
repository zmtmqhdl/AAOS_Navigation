package com.example.aaos_navigation

import androidx.car.app.Screen
import androidx.car.app.Session

class NavigationSession : Session() {
    override fun onCreateScreen(intent: android.content.Intent): Screen {
        return NavigationScreen(carContext)
    }
}