package com.example.ods.presentation.screen

import LoadingSpinner
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.ods.R
import com.example.ods.presentation.viewmodel.LoginViewModel
import com.example.ods.presentation.viewmodel.ObjectiveViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomepageScreen(
    navController: NavController,
    objectiveViewModel: ObjectiveViewModel = viewModel(factory = ObjectiveViewModel.Factory),
    loginViewModel: LoginViewModel = viewModel(factory = LoginViewModel.Factory)
    ) {
    val objectives by objectiveViewModel.objectives.observeAsState(emptyList())
    val loading by objectiveViewModel.loading.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        TopBar(
            onLogoutClick = {
                loginViewModel.logout {
                    navController.navigate("login")
                }
            }
        )
        Text(
            text = "Os 17 Objetivos de Desenvolvimento Sustentável",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        if (loading) {
            LoadingSpinner()
        } else {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                ) {
                    Spacer(modifier = Modifier.weight(1f))
                }

                LazyVerticalGrid(
                    columns = GridCells.Fixed(3),
                    modifier = Modifier.weight(1f), // This makes the grid take up available space
                    contentPadding = PaddingValues(4.dp)
                ) {
                    items(objectives.size) { index ->
                        val objective = objectives[index]
                        OdsImageItem(objective) {
                            navController.navigate("ods/${objective.id}")
                        }
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {
                        navController.navigate("score")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF3E8FDF)
                    ),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = stringResource(R.string.homepage_button_text_bottom))
                }
            }
        }
    }
}

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun TopBar(onLogoutClick: () -> Unit) {
        TopAppBar(
            title = {
                Text(text = "", fontSize = 20.sp, color = Color.Black)
            },
            actions = {
                IconButton(onClick = onLogoutClick) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_logout_24),
                        contentDescription = "Logout",
                        tint = Color.Black
                    )
                }
                Text(
                    text = "Sair",
                    color = Color.Black,
                    fontSize = 16.sp,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            },
            modifier = Modifier.fillMaxWidth()
        )
    }
