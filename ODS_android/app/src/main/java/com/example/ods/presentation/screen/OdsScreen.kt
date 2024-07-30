package com.example.ods.presentation.screen

import LoadingSpinner
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
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
import com.example.ods.domain.model.Meta
import com.example.ods.domain.model.Objective
import com.example.ods.presentation.viewmodel.ObjectiveViewModel
import kotlinx.coroutines.launch

@Composable
fun OdsScreen(navController: NavController, objectiveId: Int, objectiveViewModel: ObjectiveViewModel = viewModel(factory = ObjectiveViewModel.Factory)) {
    var isLoading by remember { mutableStateOf(true) }
    var objective by remember { mutableStateOf<Objective?>(null) }
    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(objectiveId) {
        coroutineScope.launch {
            objective = objectiveViewModel.getObjectiveById(objectiveId)
            isLoading = false
        }
    }
    if (isLoading) {
        LoadingSpinner()
    } else {
        objective?.let {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Text(
                    text = it.title,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = it.description,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = it.details,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                LazyColumn(
                    modifier = Modifier.weight(1f)
                ) {
                    items(it.metas) { meta ->
                        MetaItem(meta = meta, color = it.color)
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                Button(
                    onClick = {
                        navController.navigate("homepage")
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF3E8FDF)
                    )
                ) {
                    Text(text = stringResource(R.string.ods_back_to_initial_page))
                }
            }
        } ?: run {
            Text(stringResource(R.string.ods_object_not_found))
        }
    }
}
fun getObjectiveImageResource(id: Int): Int {
    return when (id) {
        1 -> R.drawable._1
        2 -> R.drawable._2
        3 -> R.drawable._3
        4 -> R.drawable._4
        5 -> R.drawable._5
        6 -> R.drawable._6
        7 -> R.drawable._7
        8 -> R.drawable._8
        9 -> R.drawable._9
        10 -> R.drawable._10
        11 -> R.drawable._11
        12 -> R.drawable._12
        13 -> R.drawable._13
        14 -> R.drawable._14
        15 -> R.drawable._15
        16 -> R.drawable._16
        17 -> R.drawable._17
        else -> R.drawable._logo // Default or placeholder image
    }
}

@Composable
fun OdsImageItem(objective: Objective, onClick: () -> Unit) {
    Image(
        painter = painterResource(id = getObjectiveImageResource(objective.id)),
        contentDescription = "ODS Image ${objective.id}",
        modifier = Modifier
            .size(90.dp)
            .padding(4.dp)
            .background(objective.color)
            .clickable { onClick() }
    )
}

@Composable
fun MetaItem(meta: Meta, color: Color) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Box(
            modifier = Modifier
                .background(color)
                .padding(4.dp)
        ) {
            Text(
                text = meta.title,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = meta.description,
            modifier = Modifier.padding(start = 4.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Indicadores",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 4.dp, bottom = 4.dp)
        )
        meta.indicators.forEach { indicator ->
            Text(
                text = "${indicator.title}: ${indicator.description}",
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 4.dp, bottom = 4.dp)
            )
        }
    }
}