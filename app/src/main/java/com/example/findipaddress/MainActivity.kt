package com.example.findipaddress

import android.content.Context
import android.net.wifi.WifiManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.Formatter
import android.util.Log
import android.webkit.WebView
import com.youngfilmmakerz.glitchtext.Glitchtext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findIpAddress()

        val glitchtxt = findViewById<Glitchtext>(R.id.glitchtxt);

        glitchtxt.maintext = "IamStupid";
        glitchtxt.setTextsize(50)


        glitchtxt.setFontstyle("Bugfast.otf")

    }

    private fun findIpAddress() {
        val wifiManager =  applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
        val ipAddress = Formatter.formatIpAddress(wifiManager.connectionInfo.ipAddress)

        Log.d("mainActivity" , ipAddress)

    }
}