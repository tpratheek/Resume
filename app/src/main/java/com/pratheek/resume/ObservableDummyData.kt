package com.pratheek.resume

import androidx.databinding.ObservableInt

data class ObservableDummyData(
    var a: ObservableInt,
    var b: ObservableInt,
    var c: ObservableInt
) {
    fun increaseA() {
        a.set(a.get() + 1)
        c.set(a.get() + b.get())
    }

    fun decreaseA() {
        a.set(a.get() - 1)
        c.set(a.get() + b.get())
    }

}
