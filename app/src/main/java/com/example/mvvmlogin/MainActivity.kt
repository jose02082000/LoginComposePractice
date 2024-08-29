package com.example.mvvmlogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.mvvmlogin.ui.login.ui.LoginScreen
import com.example.mvvmlogin.ui.login.ui.LoginViewModel
import com.example.mvvmlogin.ui.theme.MVVMLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVMLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    /*se debe crear una instancia en este punto de la app porque como queremos que para el password y para el email se pueda ver cuando escriben entonces hay que "suscribirlos" al live data
                     * y como el valor del livedata se podría sobre escibir en más de 1 lugar entonces para no violar el (SSOT) debemos definirlos en la parte más alta del code para poderlo pasar a sus "hijos"
                     */
                    LoginScreen(LoginViewModel())
                }
            }
        }
    }
}

