package com.practicum.firstsimplecomposeproject.composeFunctions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.practicum.firstsimplecomposeproject.R
import com.practicum.firstsimplecomposeproject.data.Contact

@Composable
fun ContactInfoScreen(contact: Contact) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Transparent)
        ) {
            ShowContactImage(contact = contact)
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold,
                text = "${contact.name} ${contact.surname.orEmpty()}"
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(3.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                style = MaterialTheme.typography.h5,
                fontWeight = FontWeight.Bold,
                text = contact.familyName
            )
            if (contact.isFavorite) {
                Spacer(modifier = Modifier.width(8.dp))
                Image(
                    painter = painterResource(id = android.R.drawable.star_big_on),
                    contentDescription = stringResource(R.string.favorite_contact)
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ShowContactInfo(contact = contact)
        }

    }
}