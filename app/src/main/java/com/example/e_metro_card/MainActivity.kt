package com.example.e_metro_card

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mapbtn2.setOnClickListener{
            val mapInt=Intent(this, dmrc_map::class.java)
            startActivity(mapInt)
        }


 /*       loginbtn.setOnClickListener{
            val loginint=Intent(this, Loginscreen::class.java)
            startActivity(loginint)
        }*/

        routesbtn.setOnClickListener{
            val routesInt=Intent(this, SearchActivity::class.java)
            startActivity(routesInt)

        }
        qrbtn.setOnClickListener{
            val qrint=Intent(this, qr::class.java)
            startActivity(qrint)
        }
        signingupbtn.setOnClickListener{
            val signingup=Intent(this,Signup::class.java)
            startActivity(signingup)
        }
            loginto.setOnClickListener{
            val logging=Intent(this,PhoneNumber::class.java)
            startActivity(logging)
        }
        paybtn.setOnClickListener{
            val payint=Intent(this, PaymentActivity::class.java)
            startActivity(payint)
        }
    }

}