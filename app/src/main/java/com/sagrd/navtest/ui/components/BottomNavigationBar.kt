package com.sagrd.navtest.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import com.sagrd.navtest.R
import com.sagrd.navtest.util.nav.Destination

@Composable
fun BottomNavigationBar(
    navController: NavController, appItems:
    List<Destination>
) {
    BottomAppBar(
        containerColor = colorResource(id =
        R.color.purple_700),
        contentColor = Color.White
    ) {
        LazyRow(modifier=Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween){
            items(appItems){ appitem ->
                IconButton(onClick = { navController.navigate(appitem.route)}) {
                    Icon(imageVector = appitem.icon, contentDescription = appitem.title)
                }
            }
        }
    }
}