package io.benjamintan.kayaknife

import android.content.Context
import android.test.AndroidTestCase
import android.widget.LinearLayout
import android.widget.TextView
import kotlin.properties.ReadOnlyProperty

class ViewTest : AndroidTestCase() {

    fun testBindView() {
        class Example(context: Context) : LinearLayout(context) {
             val name: TextView by bindView(1)
        }

        val example = Example(context)
        val tv = TextView(context).apply { id = 1 }
        example.addView(tv)

        assertNotNull(example.name)

    }

}
