package com.example.projectbp2636

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.projectbp2636.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {
    private fun replaceFragment(frg: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmrntKidBook,frg)
        fragmentTrx.commit()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_kid)

        val btnFairy:Button = findViewById(R.id.buttonFairy)
        val btnFable:Button = findViewById(R.id.buttonFable)
        val btnScience:Button = findViewById(R.id.buttonScience)

        //event button fairy
        btnFairy.setOnClickListener{
            replaceFragment(FairyFragment())
        }
            //event button fairy
        btnFable.setOnClickListener{
                replaceFragment(FableFragment())
        }
                //event button fairy
        btnScience.setOnClickListener{
            replaceFragment(ScienceFragment())
        }
    }
}
