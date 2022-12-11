package com.example.che_mystery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //creating arrays for spinners
    val dropdownlist1= arrayOf("Air", "Earth", "Fire", "Water")
    val dropdownlist2= arrayOf("Air", "Earth", "Fire", "Water")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)


        modal_button.setOnClickListener{
            Modal.visibility=View.INVISIBLE
            button.visibility=View.VISIBLE
        }


        val adapter=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist1)
        val adapter2=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist2)



        var b1=findViewById(R.id.button) as Button



        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)



        elements1.adapter=adapter
        elements1.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long)
            {
                if(elements1.selectedItemPosition==0)
                {
                    textView.setText(" " + elements1.selectedItem)

                }
                if(elements1.selectedItemPosition==1)
                {
                    textView.setText(" " + elements1.selectedItem)

                }
                if(elements1.selectedItemPosition==2)
                {
                    textView.setText(" " + elements1.selectedItem)

                }
                if(elements1.selectedItemPosition==3)
                {
                    textView.setText(" " + elements1.selectedItem)

                }
            }
        }



        elements2.adapter=adapter2
        elements2.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long)
            {
                if(elements2.selectedItemPosition==0)
                {
                    textView2.setText(" " + elements2.selectedItem)

                }
                if(elements2.selectedItemPosition==1)
                {
                    textView2.setText(" " + elements2.selectedItem)

                }
                if(elements2.selectedItemPosition==2)
                {
                    textView2.setText(" " + elements2.selectedItem)

                }
                if(elements2.selectedItemPosition==3)
                {
                    textView2.setText(" " + elements2.selectedItem)

                }
            }
        }



        b1.setOnClickListener{
            if(elements1.selectedItemPosition==0 && elements2.selectedItemPosition==0)
            {
                textView3.setText("The result is: Pressure")
            }
            if(elements1.selectedItemPosition==0 && elements2.selectedItemPosition==1)
            {
                textView3.setText("The result is: Dust")
            }

            if(elements1.selectedItemPosition==0 && elements2.selectedItemPosition==2)
            {
                textView3.setText("The result is: Smoke")
            }

            if(elements1.selectedItemPosition==0 && elements2.selectedItemPosition==3)
            {
                textView3.setText("The result is: Mist")
            }

            if(elements1.selectedItemPosition==1 && elements2.selectedItemPosition==0)
            {
                textView3.setText("The result is: Dust")
            }

            if(elements1.selectedItemPosition==1 && elements2.selectedItemPosition==1)
            {
                textView3.setText("The result is: Land")
            }

            if(elements1.selectedItemPosition==1 && elements2.selectedItemPosition==2)
            {
                textView3.setText("The result is: Lava")
            }

            if(elements1.selectedItemPosition==1 && elements2.selectedItemPosition==3)
            {
                textView3.setText("The result is: Mud")
            }

            if(elements1.selectedItemPosition==2 && elements2.selectedItemPosition==0)
            {
                textView3.setText("The result is: Smoke")
            }

            if(elements1.selectedItemPosition==2 && elements2.selectedItemPosition==1)
            {
                textView3.setText("The result is: Lava")
            }

            if(elements1.selectedItemPosition==2 && elements2.selectedItemPosition==2)
            {
                textView3.setText("The result is: Energy")
            }

            if(elements1.selectedItemPosition==2 && elements2.selectedItemPosition==3)
            {
                textView3.setText("The result is: Steam")
            }

            if(elements1.selectedItemPosition==3 && elements2.selectedItemPosition==0)
            {
                textView3.setText("The result is: Mist")
            }

            if(elements1.selectedItemPosition==3 && elements2.selectedItemPosition==1)
            {
                textView3.setText("The result is: Mud")
            }

            if(elements1.selectedItemPosition==3 && elements2.selectedItemPosition==2)
            {
                textView3.setText("The result is: Steam")
            }

            if(elements1.selectedItemPosition==3 && elements2.selectedItemPosition==3)
            {
                textView3.setText("The result is: Puddle")
            }

        }
    }
}