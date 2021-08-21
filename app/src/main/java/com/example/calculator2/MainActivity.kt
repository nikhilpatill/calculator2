package com.example.calculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_add.setOnClickListener(this)
        btn_substract.setOnClickListener(this)
        btn_multiply.setOnClickListener(this)
        btn_devide.setOnClickListener(this)
    }

    //Integer.parsseInt(String) which is used to convert string to Int
    override fun onClick(view: View?) {
        var num1 = Integer.parseInt(et1.text.toString())
        var num2 = Integer.parseInt(et2.text.toString())

        when (view?.id) {
            R.id.btn_add -> text_result.text = (num1 + num2).toString()
            R.id.btn_substract -> text_result.text = (num1 - num2).toString()
            R.id.btn_multiply -> text_result.text = (num1 * num2).toString()

            R.id.btn_devide -> {
                try {
                    text_result.text = (num1 / num2).toString()
                } catch (e: Exception) {
                    text_result.text = "infinity"
                }
            }
        }

    }
}






