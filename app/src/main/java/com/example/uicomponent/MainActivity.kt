package com.example.uicomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = findViewById<TextView>(R.id.nameField)
        val buttonAdd = findViewById<ImageButton>(R.id.imgButtonAdd)
        val buttonRemove = findViewById<ImageButton>(R.id.imgButtonCancel)
        buttonRemove.setOnClickListener {
            name.text = null
        }
        buttonAdd.setOnClickListener {
            var id: Int = radioGroup.checkedRadioButtonId
            if (id != -1) {
                val radio: RadioButton = findViewById(id)
                Toast.makeText(applicationContext, "Nama: ${name.text}, gender: ${radio.text} telah berhasil disimpan", Toast.LENGTH_LONG).show()
            }
        }
        printHobby()
    }

    private fun printHobby() {
        val codingCb = findViewById<CheckBox>(R.id.CodingCheckbox)
        val readingCb = findViewById<CheckBox>(R.id.ReadingCheckbox)
        val travelingCb = findViewById<CheckBox>(R.id.TravelingCheckbox)

        codingCb.setOnClickListener {
            if (codingCb.isChecked) {
                Toast.makeText(applicationContext, "Anda memilih hobi ${codingCb.text}", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Anda membatalkan pilihan ${codingCb.text}", Toast.LENGTH_LONG).show()
            }
        }
        readingCb.setOnClickListener {
            if (readingCb.isChecked) {
                Toast.makeText(applicationContext, "Anda memilih hobi ${readingCb.text}", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Anda membatalkan pilihan ${readingCb.text}", Toast.LENGTH_LONG).show()
            }
        }
        travelingCb.setOnClickListener {
            if (travelingCb.isChecked) {
                Toast.makeText(applicationContext, "Anda memilih hobi ${travelingCb.text}", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Anda membatalkan pilihan ${travelingCb.text}", Toast.LENGTH_LONG).show()
            }
        }
    }
}