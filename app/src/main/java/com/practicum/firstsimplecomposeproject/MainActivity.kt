package com.practicum.firstsimplecomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.practicum.firstsimplecomposeproject.composeFunctions.ContactInfoScreen
import com.practicum.firstsimplecomposeproject.data.Contact

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContactInfoScreen(
                contact = Contact(
                    name = "Евгений",
                    surname = "Андреевич",
                    familyName = "Лукашин",
                    imageRes = null,
                    isFavorite = true,
                    phone = "+7 495 495 95 95",
                    address = "г. Москва, 3-я улица Строителей, д. 25, кв. 12",
                    email = "ELukashin@practicum.ru"
                )
            )
        }
    }

    @Preview(name = "portrait", showSystemUi = true)
    @Composable
    fun ShowContactInfoScreenPreview() {
        ContactInfoScreen(
            contact = Contact(
                name = "Евгений",
                surname = "Андреевич",
                familyName = "Лукашин",
                imageRes = null,
                isFavorite = true,
                phone = "+7 495 495 95 95",
                address = "г. Москва, 3-я улица Строителей, д. 25, кв. 12",
                email = "ELukashin@practicum.ru"
            )
        )
    }

    @Preview(name = "portrait", showSystemUi = true)
    @Composable
    fun ShowContactInfoWithImageScreenPreview() {
        ContactInfoScreen(
            contact = Contact(
                name = "Василий",
                surname = null,
                familyName = "Кузякин",
                imageRes = R.drawable.my_contact_img,
                isFavorite = false,
                phone = "...",
                address = "Ивановская область,дер. Крутово,д. 4",
                email = null
            )
        )
    }
}