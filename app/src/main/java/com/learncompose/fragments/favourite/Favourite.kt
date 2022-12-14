package com.learncompose.fragments.favourite

import android.util.Log
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController
import com.learncompose.routes.Routes
import com.learncompose.utils.OnLifecycleEvent

@Composable
fun Favourite(navController:NavController){
    val viewModel = hiltViewModel<FavouriteVM>()
    OnLifecycleEvent { owner, event ->
        when (event) {
            Lifecycle.Event.ON_START -> {
                Log.e("Lifecycle-->", "ON_START")
            }
            Lifecycle.Event.ON_CREATE -> {
                Log.e("Lifecycle-->", "ON_CREATE")
            }
            Lifecycle.Event.ON_RESUME -> {
                Log.e("Lifecycle-->", "ON_RESUME")
            }
            Lifecycle.Event.ON_PAUSE -> {
                Log.e("Lifecycle-->", "ON_PAUSE")
            }
            Lifecycle.Event.ON_STOP -> {
                Log.e("Lifecycle-->", "ON_STOP")
            }
            Lifecycle.Event.ON_DESTROY -> {
                Log.e("Lifecycle-->", "ON_DESTROY")
            }
            Lifecycle.Event.ON_ANY -> {
                Log.e("Lifecycle-->", "ON_ANY")
            }
        }
    }
    Main()
    BackHandler(true) {
        navController.navigate(Routes.Home.route)
    }
}

@Composable
fun Main() {
    Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Favourite",
            fontSize = 30.sp,
            modifier = Modifier
                .background(Color.LightGray),
        )
    }
}