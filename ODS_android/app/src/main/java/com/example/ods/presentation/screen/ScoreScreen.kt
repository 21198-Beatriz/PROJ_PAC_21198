package com.example.ods.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.ods.R
import com.example.ods.domain.model.Objective
import com.example.ods.presentation.viewmodel.ObjectiveViewModel

@Composable
fun ScoreScreen(navController: NavController, objectiveViewModel: ObjectiveViewModel = viewModel(factory = ObjectiveViewModel.Factory)) {
    val objectives by objectiveViewModel.filteredObjectives.observeAsState(emptyList())
    objectiveViewModel.fetchObjectivesWithScores()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.score_screen_title),
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .align(Alignment.CenterHorizontally),
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = {
            navController.navigate("homepage")
        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF3E8FDF)
            )
        ) {
            Text(text = "Voltar à página inicial")
        }
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(objectives, key = { it.id }) { objective ->
                ObjectiveRow(
                    objectiveViewModel = objectiveViewModel,
                    objective = objective,
                    onEditClick = { /* Handle edit action */ },
                    onDeleteClick = {  }
                )
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }

}


@Composable
fun ObjectiveRow(objectiveViewModel: ObjectiveViewModel, objective: Objective, onEditClick: () -> Unit, onDeleteClick: () -> Unit) {
    var score by remember { mutableStateOf(objective.score) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .background(Color.White)
            .border(1.dp, Color.Gray),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = objective.title,
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier
                .background(objective.color)
                .padding(8.dp)
                .weight(1f),
            textAlign = TextAlign.Center
        )

        TextField(
            value = score.toString(),
            onValueChange = {
                val newScore = it.toIntOrNull() ?: 0
                if (newScore <= 100) {
                    score = newScore
                }
            },
            modifier = Modifier
                .width(100.dp)
                .padding(horizontal = 8.dp)
                .background(Color.White),
            textStyle = TextStyle(fontSize = 16.sp),
            placeholder = { Text("Score", color = Color.Gray) },
            singleLine = true
        )

        Row(
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .align(Alignment.CenterVertically)
        ) {
            IconButton(
                onClick = {
                    onEditClick()
                    objectiveViewModel.updateObjectiveScore(objective, score)
                },
                modifier = Modifier.size(40.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = stringResource(R.string.score_screen_edit_button)
                )
            }

            IconButton(
                onClick = {
                    onDeleteClick()
                    score = 0
                    objectiveViewModel.updateObjectiveScore(objective, score)
                },
                modifier = Modifier.size(40.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.delete),
                    contentDescription = "Excluir"
                )
            }
        }
    }
}
