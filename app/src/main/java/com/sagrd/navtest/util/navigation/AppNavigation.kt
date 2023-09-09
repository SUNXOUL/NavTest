package com.sagrd.navtest.util.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sagrd.navtest.ui.screens.BudgetScreen
import com.sagrd.navtest.ui.screens.SettingsScreen
import com.sagrd.navtest.ui.screens.TaskScreen
import com.sagrd.navtest.ui.screens.TransactionScreen
import com.sagrd.navtest.util.nav.Destination

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController, startDestination =
    Destination.Transaction.route) {
        composable(Destination.Transaction.route) {
            TransactionScreen()
        }
        composable(Destination.Budgets.route) {
            BudgetScreen()
        }
        composable(Destination.Tasks.route) {
            TaskScreen()
        }
        composable(Destination.Settings.route) {
            SettingsScreen()
        }
    }
}