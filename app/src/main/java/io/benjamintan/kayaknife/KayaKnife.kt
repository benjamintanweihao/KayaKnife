package io.benjamintan.kayaknife

import android.view.View
import android.widget.TextView
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

fun View.bindView(resId: Int): ReadOnlyProperty<View, TextView> {
    return Lazy(resId)
}

class Lazy(val resId: Int) : ReadOnlyProperty<View, TextView> {
    override fun getValue(thisRef: View, property: KProperty<*>): TextView {
        return thisRef.findViewById(resId) as TextView
    }
}

