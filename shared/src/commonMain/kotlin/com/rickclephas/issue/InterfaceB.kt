package com.rickclephas.issue

interface InterfaceB<T>: InterfaceA<T> {
    override var property: T
}
