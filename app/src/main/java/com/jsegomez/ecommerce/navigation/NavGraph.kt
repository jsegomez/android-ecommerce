package com.jsegomez.ecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.jsegomez.ecommerce.features.auth.navigation.authGraph

// Grafo raíz: único NavHost de la app. Cada feature aporta su subgrafo.
@Composable
fun NavGraph(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Auth
    ) {
        authGraph()
    }
}
