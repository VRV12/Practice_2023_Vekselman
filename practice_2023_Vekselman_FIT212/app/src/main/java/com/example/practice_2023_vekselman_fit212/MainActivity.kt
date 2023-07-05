package com.example.practice_2023_vekselman_fit212

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practice_2023_vekselman_fit212.ui.theme.Black100
import com.example.practice_2023_vekselman_fit212.ui.theme.Blue100
import com.example.practice_2023_vekselman_fit212.ui.theme.Blue24
import com.example.practice_2023_vekselman_fit212.ui.theme.Grey100
import com.example.practice_2023_vekselman_fit212.ui.theme.Grey90
import com.example.practice_2023_vekselman_fit212.ui.theme.Practice_2023_Vekselman_FIT212Theme
import com.example.practice_2023_vekselman_fit212.ui.theme.White100_100
import com.example.practice_2023_vekselman_fit212.ui.theme.White100_40
import com.example.practice_2023_vekselman_fit212.ui.theme.White40
import com.example.practice_2023_vekselman_fit212.ui.theme.White70
import com.example.practice_2023_vekselman_fit212.ui.theme.Yellow80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practice_2023_Vekselman_FIT212Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Dota2()
                }
            }
        }
    }
}

@Composable
fun Head() {
    Image(
        painter = painterResource(id = R.drawable.image_head),
        contentDescription = "Contact profile picture",
        contentScale = ContentScale.FillWidth,
        modifier = Modifier
            .wrapContentSize(
                align = Alignment.TopCenter,
                unbounded = true)
            .size(628.dp, 290.dp)
    )
}

@Composable
fun LogoNameRate() {
    Row (modifier = Modifier.padding(start = 30.dp)) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(108.dp)
                .background(
                    color = Black100,
                    RoundedCornerShape(20.dp)
                )
                .border(
                    2.dp,
                    SolidColor(Grey90),
                    RoundedCornerShape(20.dp)
                )
                .clip(RoundedCornerShape(50.dp))
                .padding(20.dp)
        )
        Column(
            modifier = Modifier.padding(
                start = 15.dp,
                top = 30.dp)
        ) {
            Text(
                text = "DoTA 2",
                color = White100_100,
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                )
            )
            Row (modifier = Modifier.padding(top = 10.dp)){
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(15.dp))
                Text(
                    text = "70M",
                    color = Grey100
                )
            }
        }
    }
}

@Composable
fun Categories() {
    Row (modifier = Modifier.padding(25.dp)) {
        Text(
            text = "MOBA",
            color = Blue100,
            style = TextStyle(fontSize = 10.sp),
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(color = Blue24)
                .padding(
                    start = 15.dp,
                    end = 15.dp,
                    top = 3.dp,
                    bottom = 3.dp
                )
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = "MULTIPLAYER",
            color = Blue100,
            style = TextStyle(fontSize = 10.sp),
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(color = Blue24)
                .padding(
                    start = 15.dp,
                    end = 15.dp,
                    top = 3.dp,
                    bottom = 3.dp
                )
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = "STRATEGY",
            color = Blue100,
            style = TextStyle(fontSize = 10.sp),
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(color = Blue24)
                .padding(start = 15.dp,
                    end = 15.dp,
                    top = 3.dp,
                    bottom = 3.dp
                )
        )
    }

}

@Composable
fun Description() {
    Text(
        text = "Dota 2 is a multiplayer online battle arena (MOBA) game" +
            " which has two teams of five players compete to collectively destroy a large structure defended" +
            " by the opposing team known as the \"Ancient\", whilst defending their own.",
        color = White70,
        style = TextStyle(fontSize = 12.sp),
        modifier = Modifier.padding(
            start = 30.dp,
            end = 30.dp
        )
    )
}

@Composable
fun Screenshots() {
    LazyRow (
        modifier = Modifier.padding(
            start = 30.dp,
            top = 15.dp
        ),
        horizontalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        item {
            Image(
            painter = painterResource(id = R.drawable.screenshot1),
            contentDescription = "Contact profile picture",
            modifier = Modifier.size(240.dp, 150.dp)
            )
        }
        item {
            Image(
            painter = painterResource(id = R.drawable.screenshot2),
            contentDescription = "Contact profile picture",
            modifier = Modifier.size(240.dp, 150.dp)
            )
        }
    }
}

@Composable
fun Ratings() {
    Column (
        modifier = Modifier.padding(
            start = 30.dp,
            top = 15.dp
        )
    ) {
        Text(
            text = "Review & Ratings",
            color = White100_100,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Row {
            Text(
                text = "4.9",
                color = White100_100,
                style = TextStyle(
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Column (
                modifier = Modifier.padding(
                    start = 15.dp,
                    top = 15.dp
                ),
                verticalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = "Contact profile picture",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Image(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = "Contact profile picture",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Image(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = "Contact profile picture",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Image(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = "Contact profile picture",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Image(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = "Contact profile picture",
                        modifier = Modifier.size(20.dp)
                    )
                }
                Text(
                    text = "70M Reviews",
                    color = White40,
                    style = TextStyle(fontSize = 15.sp)
                )
            }
        }
    }
}

@Composable
fun Reviews(
    @DrawableRes icon: Int,
    author: String,
    date: String,
    message: String
) {
    Column (
        modifier = Modifier.padding(
            start = 30.dp,
            top = 15.dp,
            end = 30.dp
        )
    ) {
        Row {
            Image(
                painter = painterResource(id = icon),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Column (modifier = Modifier.padding(start = 20.dp)) {
                Text(text = author, color = White100_100)
                Text(text = date, color = White100_40)
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = message,
            color = White40,
            style = TextStyle(fontSize = 12.sp)
        )
    }
}

@Composable
fun Install() {
    Text(
        text = "Install",
        color = Black100,
        style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        ),
        modifier = Modifier
            .padding(30.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(color = Yellow80)
            .padding(20.dp)
            .fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}

@Composable
fun Dota2() {
    LazyColumn (modifier = Modifier.background(color = Black100)) {
        item { Head() }
        item { LogoNameRate() }
        item { Categories() }
        item { Description() }
        item { Screenshots() }
        item { Ratings() }
        item { Reviews(R.drawable.people1,
            "Auguste Conte",
            "February 14, 2023",
            "“Once you start to learn its secrets, " +
                    "there’s a wild and exciting variety of " +
                    "play here that’s unmatched, even by its peers.”") }
        item { Spacer(modifier = Modifier.height(20.dp)) }
        item { Reviews(R.drawable.people2,
            "Jang Marcelino",
            "February 14, 2023",
            "“Once you start to learn its secrets, " +
                    "there’s a wild and exciting variety of " +
                    "play here that’s unmatched, even by its peers.”") }
        item { Install() }
    }
}

@Composable
fun Dota2_2() {
    LazyColumn (modifier = Modifier
        .background(color = Black100)
    ) {
        item { Ratings() }
        item { Reviews(R.drawable.people1,
            "Auguste Conte",
            "February 14, 2023",
            "“Once you start to learn its secrets, " +
                    "there’s a wild and exciting variety of " +
                    "play here that’s unmatched, even by its peers.”") }
        item { Spacer(modifier = Modifier.height(20.dp)) }
        item { Reviews(R.drawable.people2,
            "Jang Marcelino",
            "February 14, 2023",
            "“Once you start to learn its secrets, " +
                    "there’s a wild and exciting variety of " +
                    "play here that’s unmatched, even by its peers.”") }
        item { Install() }
    }
}

@Preview(showBackground = true)
@Composable
fun Dota2Preview() {
    Practice_2023_Vekselman_FIT212Theme {
        Surface() {
            Dota2()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Dota2_2Preview() {
    Practice_2023_Vekselman_FIT212Theme {
        Surface() {
            Dota2_2()
        }
    }
}