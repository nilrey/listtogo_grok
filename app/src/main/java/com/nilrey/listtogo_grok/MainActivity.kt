package com.example.myslists

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.myslists.ui.screens.MyListsScreen
import com.example.myslists.ui.theme.MyListsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyListsTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MyListsScreen(
                        onListClick = { /* TODO: открыть список */ },
                        onEditClick = { /* TODO: редактировать */ },
                        onNewListClick = { /* TODO: новый список */ },
                        onTabSelected = { /* TODO: смена вкладки */ }
                    )
                }
            }
        }
    }
}