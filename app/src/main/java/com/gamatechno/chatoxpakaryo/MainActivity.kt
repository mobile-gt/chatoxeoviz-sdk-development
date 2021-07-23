package com.gamatechno.chatoxpakaryo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gamatechno.chato.sdk.app.main.ChatoFragmentNew

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*supportFragmentManager.beginTransaction()
            .replace(R.id.flMain, ChatoFragmentNew())
            .commitAllowingStateLoss()*/
    }
}