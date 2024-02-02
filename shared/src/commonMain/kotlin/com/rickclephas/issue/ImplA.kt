package com.rickclephas.issue

class ImplA: InterfaceA<Boolean> {

    private var _property = true

    override var property: Boolean
        get() = _property
        set(value) { _property = value }
}
