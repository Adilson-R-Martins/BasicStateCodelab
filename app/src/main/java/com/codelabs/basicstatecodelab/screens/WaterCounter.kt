package com.codelabs.basicstatecodelab.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count = 0
        Text(
            text = "You've had $count glasses",
            modifier = modifier.padding(top = 50.dp, start = 18.dp)
        )
        Button(onClick = { count++ }, Modifier.padding(top = 8.dp)) {
            Text(text = "Add one")
        }
    }
}