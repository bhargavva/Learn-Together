package com.apptechinnovationlab.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.apptechinnovationlab.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticlePage()
                }
            }
        }
    }
}


@Composable
fun ArticlePage() {
    Column(verticalArrangement = Arrangement.Top) {
        ArticleImage()
        ArticleTitle(name = stringResource(R.string.article_title))
        ArticleContent(name = stringResource(R.string.article_content1))
        ArticleContent(name = stringResource(R.string.article_content2))
    }
}

@Composable
fun ArticleImage() {
    val image: Painter = painterResource(R.drawable.androidcompose)
    Image(
        painter = image,
        contentDescription = "Jetpack Image Banner",
        Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    )
}

@Composable
fun ArticleTitle(name: String, modifier: Modifier = Modifier) {
    Text(text = name, modifier = Modifier.padding(16.dp), fontSize = 24.sp)
}

@Composable
fun ArticleContent(name: String, modifier: Modifier = Modifier) {
    Text(text = name, modifier = Modifier.padding(16.dp), textAlign = TextAlign.Justify)
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    LearnTogetherTheme {
        ArticlePage()
    }
}