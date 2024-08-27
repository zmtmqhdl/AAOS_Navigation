package com.example.aaos_navigation

import android.text.Spannable
import android.text.SpannableString
import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.CarLocation
import androidx.car.app.model.Distance
import androidx.car.app.model.DistanceSpan
import androidx.car.app.model.ItemList
import androidx.car.app.model.Place
import androidx.car.app.model.PlaceListMapTemplate
import androidx.car.app.model.PlaceMarker
import androidx.car.app.model.Row
import androidx.car.app.model.Template
import androidx.car.app.model.Metadata

class NavigationScreen(carContext: CarContext) : Screen(carContext) {
    override fun onGetTemplate(): Template {
        val placesRepository = PlacesRepository()
        val itemListBuilder = ItemList.Builder()
            .setNoItemsMessage("No places to show")

        placesRepository.getPlaces().forEach {
            itemListBuilder.addItem(
                Row.Builder()
                    .setTitle(it.name)
                    .addText(SpannableString(" ").apply {
                        setSpan(
                            DistanceSpan.create(
                                Distance.create(Math.random() * 100, Distance.UNIT_KILOMETERS)
                            ), 0, 1, Spannable.SPAN_INCLUSIVE_INCLUSIVE
                        )
                    })
                    .setOnClickListener { /* 클릭 시 동작 구현 */ }
                    .setMetadata(
                        Metadata.Builder()
                            .setPlace(
                                Place.Builder(CarLocation.create(it.latitude, it.longitude))
                                    .setMarker(PlaceMarker.Builder().build())
                                    .build()
                            )
                            .build()
                    ).build()
            )
        }

        // PlaceListMapTemplate 생성
        return PlaceListMapTemplate.Builder()
            .setTitle("Places")
            .setItemList(itemListBuilder.build())
            .build()
    }
}