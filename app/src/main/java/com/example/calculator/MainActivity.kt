package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var isNewOp = true
    fun buNumberEv(view:View){
        if (isNewOp){
            tvShowNumber.text=""
        }
        var tvNumber = tvShowNumber.text.toString()
        val buSelect = view as Button

        when(buSelect.id){
            bu0.id->{
                tvNumber+="0"
            }
            bu1.id->{
                tvNumber+="1"
            }
            bu2.id->{
                tvNumber+="2"
            }
            bu2.id->{
                tvNumber+="2"
            }
            bu3.id->{
                tvNumber+="3"
            }
            bu4.id->{
                tvNumber+="4"
            }
            bu5.id->{
                tvNumber+="5"
            }
            bu6.id->{
                tvNumber+="6"
            }
            bu7.id->{
                tvNumber+="7"
            }
            bu8.id->{
                tvNumber+="8"
            }
            bu9.id->{
                tvNumber+="9"
            }
            buDot.id->{
                tvNumber+="."
            }
            buPlusMins.id->{
                tvNumber+= "-$tvNumber"
            }
        }
        tvShowNumber.text = tvNumber
    }

    var oldNumber = ""
    var op = ""
    fun buOpEvent(view: View){
        oldNumber = tvShowNumber.text.toString()
        isNewOp=true
        val buSelect = view as Button
        when(buSelect.id){
            buDiv.id->{
                op = "/"
            }
            buMul.id->{
                op = "X"
            }
            buPlus.id->{
                op = "+"
            }
            buMins.id->{
                op = "-"
            }
        }
    }

    fun buEqualEvent(view: View){
        val newNumber = tvShowNumber.text.toString()
        var findNumber:Double?=null
        when(op){
            "/"->{
                findNumber = oldNumber.toDouble() / newNumber.toDouble()
            }
            "X"->{
                findNumber = oldNumber.toDouble() * newNumber.toDouble()
            }
            "+"->{
                findNumber = oldNumber.toDouble() + newNumber.toDouble()
            }
            "-"->{
                findNumber = oldNumber.toDouble() - newNumber.toDouble()
            }
        }
        tvShowNumber.text = findNumber.toString()
        isNewOp=true
    }

    fun buClearEvent(view: View){
        isNewOp=true
        tvShowNumber.text="0"
    }
}