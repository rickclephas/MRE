package com.rickclephas.issue

class ImplB: InterfaceB<Boolean> {

    private var _property = true

    override var property: Boolean
        get() = _property
        set(value) {
            println("new value: $value")
            _property = value
        }
}
