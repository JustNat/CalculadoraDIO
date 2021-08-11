package com.example.helloworld

import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        calculate.setOnClickListener {
            val grade1 = Integer.parseInt(GradeOne.text.toString())
            val grade2 = Integer.parseInt(GradeTwo.text.toString())
            val abscense = Integer.parseInt(abscenses.text.toString())

            val media = (grade1 + grade2) / 2

            if (grade1 > 10) {
                val builder = AlertDialog.Builder(this)
                builder.setMessage("Nota inválida, por favor coloque valores de 0 a 10.")
                builder.setNeutralButton("Ok", { dialogInterface: DialogInterface, i: Int -> })
                builder.show()
            }
            else if (grade2 > 10) {
                val builder = AlertDialog.Builder(this)
                builder.setMessage("Nota inválida, por favor coloque valores de 0 a 10.")
                builder.setNeutralButton("Ok", { dialogInterface: DialogInterface, i: Int -> })
                builder.show()
            }
            else if (media >= 6 && abscense <= 10) {
                result.setText("Aluno aprovado" + "\n" + "Média:" + media + "\n" + "Faltas:" + abscense)
                result.setTextColor(Color.GREEN)
            }
            else {
                result.setText("Aluno reprovado" + "\n" + "Média:" + media + "\n" + "Faltas:" + abscense)
                result.setTextColor(Color.RED)
                finishAfterTransition()
            }
            }
        }
    }
