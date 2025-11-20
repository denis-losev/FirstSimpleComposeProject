package com.practicum.firstsimplecomposeproject.composeFunctions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.practicum.firstsimplecomposeproject.R
import com.practicum.firstsimplecomposeproject.data.Contact

@Composable
fun ShowContactImage(contact: Contact) {

    fun getInitials(): String {
        val firstNameInitial = contact.name.take(1)
        val surnameInitial = contact.surname?.take(1) ?: contact.familyName.take(1)
        return firstNameInitial + surnameInitial
    }

    Box(
        modifier = Modifier.padding(vertical = 16.dp),
        contentAlignment = Alignment.Center
    ) {
        if (contact.imageRes != null) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(contact.imageRes),
                contentDescription = null
            )
        } else {
            Icon(
                painter = painterResource(id = R.drawable.circle),
                contentDescription = "Аватар контакта",
                modifier = Modifier.fillMaxSize(),
                tint = Color.LightGray
            )
            Text(
                text = contact.imageRes
                    ?.let { null }
                    ?: getInitials(),
                fontSize = 27.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}