package io.benjamintan.kayaknife

import android.content.Context
import android.test.AndroidTestCase
import android.widget.LinearLayout
import android.widget.TextView

class ViewTest : AndroidTestCase() {

    fun testBindView() {
        class Example(context: Context) : LinearLayout(context) {
            // val name: TextView by bindView(1)
            val name: TextView? = null
        }

        val example = Example(context)
        val tv = TextView(context).apply { id = 1 }

        assertNotNull(example.name)

    }

}
