package com.example.androiduiux

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnbai3.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        btnCong.setOnClickListener {
            cong()
        }
        btnTru.setOnClickListener {
            tru()
        }
        btnNhan.setOnClickListener {
            nhan()
        }
        btnChia.setOnClickListener {
            chia()
        }

    }
    private fun cong(){
        if (numberone.text.isEmpty() || numbertwo.text.isEmpty() ){
            Toast.makeText(this, "Vui lòng nhập đầy đủ số hạng", Toast.LENGTH_SHORT).show()
        }else{
            txtKQ.text = (numberone.text.toString().toInt() + numbertwo.text.toString().toInt()).toString()
        }
    }
    private fun tru(){
        if (numberone.text.isEmpty() || numbertwo.text.isEmpty() ){
            Toast.makeText(this, "Vui lòng nhập đầy đủ số hạng", Toast.LENGTH_SHORT).show()
        }else{
            txtKQ.text = (numberone.text.toString().toInt() - numbertwo.text.toString().toInt()).toString()
        }
    }
    private fun nhan(){
        if (numberone.text.isEmpty() || numbertwo.text.isEmpty() ){
            Toast.makeText(this, "Vui lòng nhập đầy đủ số hạng", Toast.LENGTH_SHORT).show()
        }else{
            txtKQ.text = (numberone.text.toString().toInt() * numbertwo.text.toString().toInt()).toString()
        }
    }
    private fun chia(){
        if (numberone.text.isEmpty() || numbertwo.text.isEmpty() ){
            Toast.makeText(this, "Vui lòng nhập đầy đủ số hạng", Toast.LENGTH_SHORT).show()
        }else{
            txtKQ.text = (numberone.text.toString().toInt() / numbertwo.text.toString().toInt()).toString()
        }
    }
}