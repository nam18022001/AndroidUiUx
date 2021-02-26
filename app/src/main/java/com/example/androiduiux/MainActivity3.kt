package com.example.androiduiux

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {

    lateinit var content :String
     private var contentcheckbao :String = ""
     private var contentcheckcode :String = ""
     private var contentchecksach :String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        btnbai4.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        txtPost.setOnClickListener {
            if (txtName.text.isEmpty() || txtCMND.text.isEmpty()){
                Toast.makeText(this, "Vui lòng điền đầy đủ các trường", Toast.LENGTH_SHORT).show()
            }else{
                var txtname = txtName.text.toString()
                var txtcmnd = txtCMND.text.toString()
                if(!(txtcmnd.trim().length == 9)){
                    Toast.makeText(this, "Nhập CMND phải lớn hơn 9 số", Toast.LENGTH_SHORT).show()
                }else{

                    var hoTen = "Họ Tên: $txtname"
                    var CMND = "CMND: $txtcmnd"
                    var bangcap = "Bằng cấp : $content"
                    var sothich = "Sở thích : $contentcheckbao \n           : $contentcheckcode\n           : $contentchecksach"
                    var add = ""

                    if (!txtAdd.text.isEmpty()){
                        add = txtAdd.text.toString()
                    }
                    txtGet.text = "$hoTen\n $CMND\n $bangcap\n $sothich\n $add"
                }


            }
        }

    }
    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.checkBao -> {
                    if (checked) {
                        contentcheckbao = "Đọc báo"
                    } else {
                        // Remove the meat

                    }
                }
                R.id.checkCode -> {
                    if (checked) {
                        contentcheckcode = "Đọc code"
                    } else {
                    }
                }
                R.id.checkSach -> {
                    if (checked) {

                        contentchecksach = "Đọc sách"
                    } else {
                        // I'm lactose intolerant
                    }
                }
                else -> contentcheckbao = "Không có sở thích"
                }
        }
    }
    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked
            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radioTrungCap ->
                    if (checked) {
                        // Pirates are the best
                        content = "Bằng cấp: Trung cấp"
                    }
                R.id.radioTrungCap2 ->
                    if (checked) {
                        // Ninjas rule
                        content = "Bằng cấp: Cao đẳng"
                    }
                R.id.radioTrungCap3->
                    if (checked){
                        content = "Bằng cấp: Đại học"
                    }
                else -> content = "Không có bằng cấp"
            }
        }
    }

}