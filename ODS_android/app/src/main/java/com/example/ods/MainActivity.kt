package com.example.ods

import LoadingSpinner
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ods.presentation.screen.HomepageScreen
import com.example.ods.presentation.screen.LoginScreen
import com.example.ods.presentation.screen.OdsScreen
import com.example.ods.presentation.screen.RegisterScreen
import com.example.ods.presentation.screen.ScoreScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyApp()
        }
    }
}

@Preview
@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController) }
        composable("register") { RegisterScreen(navController) }
        composable("homepage") { HomepageScreen(navController) }
        composable("ods/{objectiveId}") { backStackEntry ->
            val objectiveId = backStackEntry.arguments?.getString("objectiveId")?.toIntOrNull()
            if (objectiveId != null) {
                OdsScreen(navController, objectiveId)
            }
        }
        composable("score") { ScoreScreen(navController) }
    }
}






