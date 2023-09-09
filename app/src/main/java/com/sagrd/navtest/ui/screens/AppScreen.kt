import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.navigation.compose.rememberNavController
import com.sagrd.navtest.R
import com.sagrd.navtest.ui.components.BottomNavigationBar
import com.sagrd.navtest.util.nav.Destination
import com.sagrd.navtest.util.navigation.AppNavigation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "Nav APP")},
            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = colorResource(id = R.color.purple_700),
                titleContentColor = Color.White
                ))},
        bottomBar = {
            BottomNavigationBar(
                navController =
            navController, appItems =
            Destination.toList) },
        content = { padding ->
            Box(modifier = Modifier.padding(padding))
            {
                AppNavigation(navController =
                navController)
            }
        }
    )
}