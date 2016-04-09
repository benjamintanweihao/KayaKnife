package io.benjamintan.kayaknife

import android.view.View
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

fun <V : View> View.bindView(resId: Int): ReadOnlyProperty<View, V> {
    return Lazy(resId)
}

private class Lazy<V : View>(val resId: Int) : ReadOnlyProperty<View, V> {
    override fun getValue(thisRef: View, property: KProperty<*>): V {
        return thisRef.findViewById(resId) as V
    }
}

