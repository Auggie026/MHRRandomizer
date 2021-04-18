package Controller

import Adapters.MonstersAdapter
import Adapters.WeaponsAdapter
import Services.DataService.monsters
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mhrrandomizer.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var adapter : MonstersAdapter
    lateinit var wadapter : WeaponsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        randomizerBtn.setOnClickListener{


                val random = Random()
                val randomMonster = monsters.elementAt(random.nextInt(monsters.size))
                val resourceId = this.resources.getIdentifier(randomMonster.image, "drawable", this.packageName)
                monsterImage.setImageResource(resourceId)


        }

        }


}


