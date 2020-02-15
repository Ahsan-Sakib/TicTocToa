package com.example.tictoctoe

import android.content.Context
import android.media.AsyncPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.tictoctoe.databinding.ActivityMainBinding
import com.example.tictoctoe.model.Datax
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMainBinding
    lateinit var lstdata: MutableList<String>
    lateinit var buttonNumber: MutableList<Int>
    lateinit var data: Datax
    var player: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        lstdata = mutableListOf("", "", "", "", "", "", "", "", "")
        buttonNumber = mutableListOf(1,2,3,4,5,6,7,8,9)
        data = Datax(lstdata)
        binding.text = data

        /*  binding.bt1.setOnClickListener {
              when (player) {
                  1 -> {
                      bt1.setText("x")
                      bt1.setBackgroundColor(getColor(R.color.colorAccent))
                      player = 2
                      bt1.isClickable = false
                  }
                  2 -> {
                      bt1.setText("O")
                      bt1.setBackgroundColor(getColor(R.color.colorplayer2))
                      player = 1
                      bt1.isClickable = false
                  }
              }
          }
          binding.bt2.setOnClickListener {
              when (player) {
                  1 -> {
                      bt2.setText("x")
                      bt2.setBackgroundColor(getColor(R.color.colorAccent))
                      player = 2
                      bt2.isClickable = false
                  }
                  2 -> {
                      bt2.setText("O")
                      bt2.setBackgroundColor(getColor(R.color.colorplayer2))
                      player = 1
                      bt1.isClickable = false
                  }
              }
          }
          binding.bt3.setOnClickListener {
              when (player) {
                  1 -> {
                      bt3.setText("x")
                      bt3.setBackgroundColor(getColor(R.color.colorAccent))
                      player = 2
                      bt3.isClickable = false
                  }
                  2 -> {
                      bt3.setText("O")
                      bt3.setBackgroundColor(getColor(R.color.colorplayer2))
                      player = 1
                      bt3.isClickable = false
                  }
              }
          }
          binding.bt4.setOnClickListener {
              when (player) {
                  1 -> {
                      bt4.setText("x")
                      bt4.setBackgroundColor(getColor(R.color.colorAccent))
                      player = 2
                      bt4.isClickable = false
                  }
                  2 -> {
                      bt4.setText("O")
                      bt4.setBackgroundColor(getColor(R.color.colorplayer2))
                      player = 1
                      bt4.isClickable = false
                  }
              }
          }
          binding.bt5.setOnClickListener {
              when (player) {
                  1 -> {
                      bt5.setText("x")
                      bt5.setBackgroundColor(getColor(R.color.colorAccent))
                      player = 2
                      bt5.isClickable = false
                  }
                  2 -> {
                      bt5.setText("O")
                      bt5.setBackgroundColor(getColor(R.color.colorplayer2))
                      player = 1
                      bt5.isClickable = false
                  }
              }
          }
          binding.bt6.setOnClickListener {
              when (player) {
                  1 -> {
                      bt6.setText("x")
                      bt6.setBackgroundColor(getColor(R.color.colorAccent))
                      player = 2
                      bt6.isClickable = false
                  }
                  2 -> {
                      bt6.setText("O")
                      bt6.setBackgroundColor(getColor(R.color.colorplayer2))
                      player = 1
                      bt6.isClickable = false
                  }
              }
          }
          binding.bt7.setOnClickListener {
              when (player) {
                  1 -> {
                      bt7.setText("x")
                      bt7.setBackgroundColor(getColor(R.color.colorAccent))
                      player = 2
                      bt7.isClickable = false
                  }
                  2 -> {
                      bt7.setText("O")
                      bt7.setBackgroundColor(getColor(R.color.colorplayer2))
                      player = 1
                      bt7.isClickable = false
                  }
              }
          }
          binding.bt8.setOnClickListener {
              when (player) {
                  1 -> {
                      bt8.setText("x")
                      bt8.setBackgroundColor(getColor(R.color.colorAccent))
                      player = 2
                      bt8.isClickable = false
                  }
                  2 -> {
                      bt8.setText("O")
                      bt8.setBackgroundColor(getColor(R.color.colorplayer2))
                      player = 1
                      bt8.isClickable = false
                  }
              }
          }
          binding.bt9.setOnClickListener {
              when (player) {
                  1 -> {
                      bt9.setText("x")
                      bt9.setBackgroundColor(getColor(R.color.colorAccent))
                      player = 2
                      bt9.isClickable = false
                  }
                  2 -> {
                      bt9.setText("O")
                      bt9.setBackgroundColor(getColor(R.color.colorplayer2))
                      player = 1
                      bt9.isClickable = false
                  }
              }
          }*/
        bt1.setOnClickListener(this)
        bt2.setOnClickListener(this)
        bt3.setOnClickListener(this)
        bt4.setOnClickListener(this)
        bt5.setOnClickListener(this)
        bt6.setOnClickListener(this)
        bt7.setOnClickListener(this)
        bt8.setOnClickListener(this)
        bt9.setOnClickListener(this)

    }

    fun changeState(view: View) {
        var id: Int = 0
        when (view) {
            bt1 -> id = 1
            bt2 -> id = 2
            bt3 -> id = 3
            bt4 -> id = 4
            bt5 -> id = 5
            bt6 -> id = 6
            bt7 -> id = 7
            bt8 -> id = 8
            bt9 -> id = 9
        }
        action(id)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.bt1 -> {
                    bt1.isClickable = false
                    buttonNumber.remove(1)
                    player = 2
                    changeState(bt1)
                }
                R.id.bt2 ->{
                    bt2.isClickable = false
                    buttonNumber.remove(2)
                    player = 2
                    changeState(bt2)
                }
                R.id.bt3 -> {
                    bt3.isClickable = false
                    buttonNumber.remove(3)
                    player = 2
                    changeState(bt3)
                }
                R.id.bt4 -> {
                    bt4.isClickable = false
                    buttonNumber.remove(4)
                    player = 2
                    changeState(bt4)
                }
                R.id.bt5 -> {
                    bt5.isClickable = false
                    buttonNumber.remove(5)
                    player = 2
                    changeState(bt5)
                }
                R.id.bt6 -> {
                    bt6.isClickable = false
                    buttonNumber.remove(6)
                    player = 2
                    changeState(bt6)
                }
                R.id.bt7 -> {
                    bt7.isClickable = false
                    buttonNumber.remove(7)
                    player = 2
                    changeState(bt7)
                }
                R.id.bt8 -> {
                    bt8.isClickable = false
                    buttonNumber.remove(8)
                    player = 2
                    changeState(bt8)
                }
                R.id.bt9 -> {
                    bt9.isClickable = false
                    buttonNumber.remove(9)
                    player = 2
                    changeState(bt9)
                }
            }
            Log.d("tab", "" + R.id.bt1 + " " + v.id)
        } //To change body of created functions use File | Settings | File Templates.
    }

    fun action(id: Int) {
        when (id) {
            1 -> lstdata[0] = "X"
            2 -> lstdata[1] = "X"
            3 -> lstdata[2] = "X"
            4 -> lstdata[3] = "X"
            5 -> lstdata[4] = "X"
            6 -> lstdata[5] = "X"
            7 -> lstdata[6] = "X"
            8 -> lstdata[7] = "X"
            9 -> lstdata[8] = "X"
        }
        data = Datax(lstdata)
        binding.text = data
        Log.e("hhsfh", "test"+player)
        if(player == 2){
            player = 1
            player2action()
        }
    }
    fun player2action(){
        if(buttonNumber.size>0){
            var ran = Random.nextInt(0, buttonNumber.size)
            action2(buttonNumber[ran])
            buttonNumber.removeAt(ran)

        }
        Log.e("check",""+buttonNumber)
    }

    fun action2(id: Int) {
        when (id) {
            1 -> lstdata[0] = "O"
            2 -> lstdata[1] = "O"
            3 -> lstdata[2] = "O"
            4 -> lstdata[3] = "O"
            5 -> lstdata[4] = "O"
            6 -> lstdata[5] = "O"
            7 -> lstdata[6] = "O"
            8 -> lstdata[7] = "O"
            9 -> lstdata[8] = "O"
        }
        data = Datax(lstdata)
        binding.text = data
        Log.e("hhsfh", "test"+player)
        player = 1
    }

}
