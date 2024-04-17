package com.example.recyclerview08012024

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun formatDistance() {
        var distance1 = 1001
        var distance2 = 1190
        var distance3 = 1900
        var distance4 = 999
        var distance5 = 9

        assertEquals(TextUtils.formatDistance(distance1), "1 km")
        assertEquals(TextUtils.formatDistance(distance2),"1.2 km")
        assertEquals(TextUtils.formatDistance(distance3),"1.9 km")
        assertEquals(TextUtils.formatDistance(distance4),"999 m")
        assertEquals(TextUtils.formatDistance(distance5),"9 m")
    }
}

