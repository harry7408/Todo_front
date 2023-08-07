package com.example.mytodoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytodoapp.databinding.ActivitySplashBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        changeToMain()

    }
    private fun changeToMain() {
        GlobalScope.launch {
            delay(4000)
            val intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

/* Handler 의 postDelay 함수를 일반적으로 많이 사용했으나
* Handler 가 Deprecated 되어 코루틴을 사용 */