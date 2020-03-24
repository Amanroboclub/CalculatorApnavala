package com.rajaman.calculatorapnavala

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global.getInt
import android.provider.Settings.Secure.getInt
import android.provider.Settings.Secure.getString
import android.widget.Toast
import com.rajaman.BMI_Calculator.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_normal_b_m_i.*
import kotlinx.android.synthetic.main.activity_pop_u_p.*
import kotlinx.android.synthetic.main.activity_under_age.*
import java.lang.reflect.Array.getInt

class UnderAge : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_under_age)
        val bundle = intent.extras
        val number = bundle!!.getInt("UnderWeight")
        if (number.equals(2)) {
            editText4.text = "your weight is normal"

        }
        if (number.equals(4)) {
            editText4.text = "oops your weight is more"
        }
        if (number.equals(6)) {
            editText4.text = "normal"
        }

        button2.setOnClickListener {
            finish()
            button4.setOnClickListener {
                val message = editText4.text.toString().toInt()
                val intent =Intent()
                intent.action=Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,message)
                intent.type="text/plain"
                startActivity(Intent.createChooser(intent,"Please select application"))
                Toast.makeText(this,"Please select the app to share", Toast.LENGTH_LONG).show()
            }
        }
    }
}
