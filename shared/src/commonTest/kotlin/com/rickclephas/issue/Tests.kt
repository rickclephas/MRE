package com.rickclephas.issue

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Tests {

    @Test
    fun testSwitchPropertyToFalseA() {
        val a = ImplA()
        assertTrue(a.property)
        a.property = false
        assertFalse(a.property)
    }

    @Test
    fun testSwitchPropertyToFalseB() {
        val b = ImplB()
        assertTrue(b.property)
        b.property = false
        assertFalse(b.property)
    }
}
