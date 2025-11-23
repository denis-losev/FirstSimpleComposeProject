package com.practicum.firstsimplecomposeproject.composeFunctions

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.practicum.firstsimplecomposeproject.R
import com.practicum.firstsimplecomposeproject.data.Contact

@Composable
fun ShowContactInfo(contact: Contact) {
    InfoRow(stringResource(R.string.phone), contact.phone)
    InfoRow(stringResource(R.string.address), contact.address)
    InfoRow(stringResource(R.string.email), contact.email.orEmpty())
}