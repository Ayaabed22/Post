package com.example.postretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var button: Button = findViewById(R.id.buttonlogin)
        var edittextemail=findViewById<EditText>(R.id.et_email)
        var edittextpassword=findViewById<EditText>(R.id.et_password)

        button.setOnClickListener {
            val email = edittextemail.text.toString().trim()
            val password = edittextpassword.text.toString().trim()
            if (email.isEmpty()){
                edittextemail.error="Email REquried"
                edittextemail.requestFocus()
                return@setOnClickListener
            }
            if (password.isEmpty()){
                edittextpassword.error="Email REquried"
                edittextpassword.requestFocus()
                return@setOnClickListener
            }

        }
        RetrofitClient.instance.userLogin(email = "appssquare@gmail.org","123456789")
            .enqueue(object :Callback<LoginResponse>{
                override fun onResponse(
                    call: Call<LoginResponse>?,
                    response: Response<LoginResponse>?
                ) {
                    if (!response?. body()?.status!! ) {
                       response.body().status

                    }else{
                        Toast.makeText(applicationContext,response.body()?.message,Toast.LENGTH_LONG).show()
                    }


                }

                override fun onFailure(call: Call<LoginResponse>?, t: Throwable?) {
                    Toast.makeText(applicationContext, t?.message, Toast.LENGTH_LONG).show()


                     }

            })



    }
    }
