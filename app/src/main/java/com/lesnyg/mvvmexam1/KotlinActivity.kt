package com.lesnyg.mvvmexam1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kotlin.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
//상수 java의 final과 같다
        val i = 10  //val i:Int = 10,final int i = 10;
        val str = "하하하"
        val ddd = 30.0

        //변수
        var a = 20  //int a = 20;과 같다

        var item = ItemKotlin("와랄라랄라라",1)
//        item.title = "제목수정"
        val title = item.title

        mybutton.setOnClickListener {
//            Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
            //startActivity(new Intent(this, MainActivity.class));
            //startActivity(Intent(this, MainActivity::class.java));
//            startActivity<MainActivity>()
            tv_text.setText(title)
        }




    }
}
