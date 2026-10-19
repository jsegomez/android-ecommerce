package com.jsegomez.ecommerce.features.auth.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.jsegomez.ecommerce.features.auth.presentation.login.LoginScreen
import com.jsegomez.ecommerce.features.auth.presentation.register.RegisterScreen
import com.jsegomez.ecommerce.navigation.Auth

// Subgrafo de autenticación: agrupa todas las pantallas del flujo de auth.
fun NavGraphBuilder.authGraph() {
    navigation<Auth>(startDestination = LoginRoute) {
        composable<LoginRoute> { LoginScreen() }
        composable<RegisterRoute> { RegisterScreen() }
    }
}
