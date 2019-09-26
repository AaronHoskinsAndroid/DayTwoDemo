package examples.aaronhoskins.com.daytwodemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        when(view.id) {
            R.id.btnProduceLabel -> populateLabel()

        }
    }

    fun populateLabel() {
        val name = etName.text.toString()
        val address = etStreetAddress.text.toString()
        val city = etCity.text.toString()
        val state = etState.text.toString()
        val zip = etZip.text.toString()

        tvName.text = name
        tvStreetAddress.text = address
        tvCity.text = city
        tvState.text = state
        tvZip.text = zip
    }


}
