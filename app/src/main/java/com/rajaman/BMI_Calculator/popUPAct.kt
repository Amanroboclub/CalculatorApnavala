package com.rajaman.BMI_Calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rajaman.calculatorapnavala.NormalBMI
import com.rajaman.calculatorapnavala.OverWeight
import com.rajaman.calculatorapnavala.UnderAge
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_normal_b_m_i.*
import kotlinx.android.synthetic.main.activity_pop_u_p.*

class popUPAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop_u_p)
        button2.setOnClickListener {
            val age = editText.text.toString().toInt()
            val height = editText2.text.toString().toInt()
            val weight = editText3.text.toString().toInt()
            var number = 0
            if( (age>=10)and (height>=142) and (weight>=41)){
                number = +2
                val intent = Intent(this, UnderAge::class.java)
                    intent.putExtra("UnderWeight", number)
                    startActivity(intent)
            }
            if((age>=10)and (height>=142) and (weight>=41)){
                number = +4
                val intent=Intent(this, UnderAge::class.java)
                intent.putExtra("UnderWeight",number)
                startActivity(intent)

            }
            if((age>=10)and (height>=142) and (weight>=41)){
                number = +6
                val intent = Intent(this, UnderAge::class.java)
                intent.putExtra("UnderWeight",number)
                startActivity(intent)
            }
        }
        }
}

