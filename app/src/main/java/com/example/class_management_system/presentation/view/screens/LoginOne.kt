package com.example.class_management_system.presentation.view.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.class_management_system.R

@Preview(showBackground = true)
@Composable
fun LightBg(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier.fillMaxSize()
            .background(Color(0XFF06919C))
    ){

        Box(
            modifier = modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(R.drawable.child),
                contentDescription = "screen1",
                modifier = Modifier
                    .align(Alignment.TopCenter)
            )

        }

        Box(
            modifier = modifier.fillMaxWidth()
                .height(600.dp)
                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(R.drawable.rectangle_5),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
            )

        }

    }


}