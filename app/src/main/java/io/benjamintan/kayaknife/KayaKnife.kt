package io.benjamintan.kayaknife

import android.view.View
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

fun <V : View> View.bindView(resId: Int): ReadOnlyProperty<View, V> {
    return Lazy(resId)
}

private class Lazy<V : View>(val resId: Int) : ReadOnlyProperty<View, V> {

    private object EMPTY
    private var value : Any = EMPTY

    override fun getValue(thisRef: View, property: KProperty<*>): V {

        if (value == EMPTY) {
            value = thisRef.findViewById(resId)
        }

        return value as V
    }
}

