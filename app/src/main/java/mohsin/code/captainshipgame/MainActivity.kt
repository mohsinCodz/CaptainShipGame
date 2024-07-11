package mohsin.code.captainshipgame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mohsin.code.captainshipgame.ui.theme.CaptainShipGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainShipGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainShipGame()
                }
            }
        }
    }
    @Composable
    fun CaptainShipGame(){
        val treasuresFound = remember { mutableStateOf(0) }
        val direction = remember { mutableStateOf("North") }
        val stormOrTreasure = remember { mutableStateOf("") }

        Column {
            Text(text = "Treasures Found: ${treasuresFound.value}")
            Text(text = "Current Direction: ${direction.value}")
            Text(text = stormOrTreasure.value)
            Button(onClick = {
                direction.value = "East"
                if(Random.nextBoolean()){
                    treasuresFound.value += 1
                    stormOrTreasure.value = "Found a Treasure!"
                } else {
                    stormOrTreasure.value = "Storm Ahead!"
                }
            }) {
                Text("Sail East")
            }
            Button(onClick = {
                direction.value = "West"
                if(Random.nextBoolean()){
                    treasuresFound.value += 1
                    stormOrTreasure.value = "Found a Treasure!"
                } else {
                    stormOrTreasure.value = "Storm Ahead!"
                }
            }) {
                Text("Sail West")
            }
            Button(onClick = {
                direction.value = "North"
                if(Random.nextBoolean()){
                    treasuresFound.value += 1
                    stormOrTreasure.value = "Found a Treasure!"
                } else {
                    stormOrTreasure.value = "Storm Ahead!"
                }
            }) {
                Text("Sail North")
            }
            Button(onClick = {
                direction.value = "South"
                if(Random.nextBoolean()){
                    treasuresFound.value += 1
                    stormOrTreasure.value = "Found a Treasure!"
                } else {
                    stormOrTreasure.value = "Storm Ahead!"
                }
            }) {
                Text("Sail South")
            }
        }
    }
}
