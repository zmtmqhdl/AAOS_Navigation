package com.example.aaos_navigation

data class PlaceData(val name: String, val latitude: Double, val longitude: Double)

class PlacesRepository {

    // 장소 데이터를 반환하는 메서드
    fun getPlaces(): List<PlaceData> {
        // 예제 장소 데이터를 반환
        return listOf(
            PlaceData("서울", 37.5668, 126.9786),
            PlaceData("부천", 37.5035, 126.7660),
            PlaceData("대전", 36.3505, 127.3848)
        )
    }
}