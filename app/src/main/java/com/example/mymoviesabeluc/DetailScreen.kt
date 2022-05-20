package com.example.mymoviesabeluc

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import coil.annotation.ExperimentalCoilApi

@ExperimentalCoilApi
@Composable
fun DetailScreen(mediaId:Int) {
   val mediaItem=remember{ getMedia().first(){it.id==mediaId} }
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text =mediaItem.title)}) }
    ) {
            Thumb(item = mediaItem)
    }
}