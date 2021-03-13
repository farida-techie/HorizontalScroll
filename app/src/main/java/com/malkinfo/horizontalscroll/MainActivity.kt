package com.malkinfo.horizontalscroll

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.malkinfo.horizontalscroll.ui.theme.HorizontalScrollTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HorizontalScrollTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                   /**ok now call function*/
                    HorizontalScroll()
                }
            }
        }
    }
    /**ok run it*/

}
/** set horizontal Scroll*/
@Composable
fun HorizontalScroll(){
    LazyRow{
        itemsIndexed(items = scenesImages()){index, item ->
           Image(painter = painterResource(id = item) ,
               contentDescription ="Scenes",
               modifier = Modifier.fillMaxSize(),
               contentScale = ContentScale.Crop
           )

        }
    }
}

fun scenesImages()= mutableListOf(
    R.drawable.scene001,
    R.drawable.scene002,
    R.drawable.scene003,
    R.drawable.scene004,
)

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HorizontalScrollTheme {
        Greeting("Android")
    }
}