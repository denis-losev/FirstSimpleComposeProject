package com.practicum.firstsimplecomposeproject.composeFunctions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp

@Composable
fun InfoRow(first: String, second: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.Transparent)
    ) {
        if (second.isNotEmpty()) {
            Column(
                modifier = Modifier.weight(1F),
                horizontalAlignment = Alignment.End,
            ) {
                Text(
                    text = "$first:",
                    fontStyle = FontStyle.Italic
                )
            }
            Column(
                modifier = Modifier
                    .weight(1F)
                    .padding(start = 10.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(second)
            }
        }
    }
}