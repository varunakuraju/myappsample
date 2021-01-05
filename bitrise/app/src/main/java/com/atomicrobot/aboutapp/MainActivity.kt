package com.atomicrobot.aboutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.app_version).text = formattedVersionName()
        findViewById<TextView>(R.id.app_version_code).text = formattedVersionCode()
        findViewById<TextView>(R.id.app_build_type).text = formattedBuildType()
    }

    private fun formattedVersionName() = BuildConfig.VERSION_NAME

    private fun formattedVersionCode() = BuildConfig.VERSION_CODE.toString()

    private fun formattedBuildType() = if (BuildConfig.DEBUG) "DEBUG" else "RELEASE"
}
