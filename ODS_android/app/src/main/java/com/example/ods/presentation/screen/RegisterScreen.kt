package com.example.ods.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.ods.R
import com.example.ods.presentation.viewmodel.RegistrationViewModel

@Composable
fun RegisterScreen(navController: NavController, registrationViewModel: RegistrationViewModel = viewModel(factory = RegistrationViewModel.Factory)) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }


    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        val (title, image, usernameField, passwordField, confirmPasswordField, backButton, registerButton, errorText) = createRefs()

        Text(
            text = "Criar conta",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.constrainAs(title) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )

        Image(
            painter = painterResource(id = R.drawable._logo_ods),
            contentDescription = "Logo",
            modifier = Modifier
                .fillMaxWidth()
                .height(117.dp)
                .padding(bottom = 32.dp)
                .constrainAs(image) {
                    top.linkTo(title.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text(stringResource(R.string.register_username_label)) },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .constrainAs(usernameField) {
                    top.linkTo(if (errorMessage.isNotEmpty()) errorText.bottom else image.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
            textStyle = LocalTextStyle.current.copy(fontSize = 16.sp),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text)
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(stringResource(R.string.register_password_label)) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .constrainAs(passwordField) {
                    top.linkTo(usernameField.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
            textStyle = LocalTextStyle.current.copy(fontSize = 16.sp),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password)
        )

        OutlinedTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            label = { Text(stringResource(R.string.register_confirm_password_label)) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .constrainAs(confirmPasswordField) {
                    top.linkTo(passwordField.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
            textStyle = LocalTextStyle.current.copy(fontSize = 16.sp),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password)
        )
        Button(
            onClick = {
                registrationViewModel.register(username, password, confirmPassword) { success, message ->
                    if (success) {
                        navController.navigate("homepage")
                    } else {
                        errorMessage = message
                    }
                }
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3E8FDF)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
                .constrainAs(registerButton) {
                    top.linkTo(confirmPasswordField.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            Text(text = stringResource(R.string.register_create_account_button_label))
        }

        Button(
            onClick = {
                navController.navigate("login")
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3E8FDF)),
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(backButton) {
                    top.linkTo(registerButton.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {
            Text(text = stringResource(R.string.register_back_to_login_button_label))
        }

        if (errorMessage.isNotEmpty()) {
            Text(
                text = errorMessage,
                color = Color.Red,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .constrainAs(errorText) {
                        top.linkTo(image.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
            )
        }
    }
}
