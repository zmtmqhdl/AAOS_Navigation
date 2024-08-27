package com.example.aaos_navigation

data class PlaceData(val name: String, val latitude: Double, val longitude: Double)

class PlacesRepository {

    // 장소 데이터를 반환하는 메서드
    fun getPlaces(): List<PlaceData> {
        // 예제 장소 데이터를 반환
        return listOf(
            PlaceData("Place 1", 37.7749, -122.4194), // 샌프란시스코
            PlaceData("Place 2", 34.0522, -118.2437), // 로스앤젤레스
            PlaceData("Place 3", 40.7128, -74.0060)  // 뉴욕
        )
    }
}