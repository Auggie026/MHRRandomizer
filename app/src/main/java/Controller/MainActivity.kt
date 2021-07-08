package Controller

import Services.DataService.monsters
import Services.DataService.weapons
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.auggiementeddevelopment.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()



        randomizerBtn.setOnClickListener{


                val random = Random()
                val randomMonster = monsters.elementAt(random.nextInt(monsters.size))
                val resourceId = this.resources.getIdentifier(randomMonster.image
                    , "drawable", this.packageName)
                monsterImage.setImageResource(resourceId)


                val randomWeapon = weapons.elementAt(random.nextInt(weapons.size))
                val resourceId2 = this.resources.getIdentifier(randomWeapon.image
                    , "drawable", this.packageName)
                weaponImage.setImageResource(resourceId2)
        }
        }
}


