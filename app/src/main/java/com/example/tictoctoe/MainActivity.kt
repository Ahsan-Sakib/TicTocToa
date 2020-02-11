package com.example.tictoctoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tictoctoe.databinding.ActivityMainBinding
import com.example.tictoctoe.model.Datax
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var lstdata:List<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        lstdata = listOf("","","","","","")

        var data:Datax = Datax(lstdata)
        binding.text = data
        var player:Int = 1
        binding.bt1.setOnClickListener{
           when(player){
               1->{ bt1.setText("x")
               bt1.setBackgroundColor(getColor(R.color.colorAccent))
               player =2
                   bt1.isClickable = false
               }
               2->{
                   bt1.setText("O")
                   bt1.setBackgroundColor(getColor(R.color.colorplayer2))
                   player = 1
                   bt1.isClickable = false
               }
           }
        }
        binding.bt2.setOnClickListener{
            when(player){
                1->{ bt2.setText("x")
                    bt2.setBackgroundColor(getColor(R.color.colorAccent))
                    player =2
                    bt2.isClickable = false
                }
                2->{
                    bt2.setText("O")
                    bt2.setBackgroundColor(getColor(R.color.colorplayer2))
                    player = 1
                    bt1.isClickable = false
                }
            }
        }
        binding.bt3.setOnClickListener{
            when(player){
                1->{ bt3.setText("x")
                    bt3.setBackgroundColor(getColor(R.color.colorAccent))
                    player =2
                    bt3.isClickable = false
                }
                2->{
                    bt3.setText("O")
                    bt3.setBackgroundColor(getColor(R.color.colorplayer2))
                    player = 1
                    bt3.isClickable = false
                }
            }
        }
        binding.bt3.setOnClickListener{
            when(player){
                1->{ bt3.setText("x")
                    bt3.setBackgroundColor(getColor(R.color.colorAccent))
                    player =2
                    bt3.isClickable = false
                }
                2->{
                    bt3.setText("O")
                    bt3.setBackgroundColor(getColor(R.color.colorplayer2))
                    player = 1
                    bt3.isClickable = false
                }
            }
        }
        binding.bt4.setOnClickListener{
            when(player){
                1->{ bt4.setText("x")
                    bt4.setBackgroundColor(getColor(R.color.colorAccent))
                    player =2
                    bt4.isClickable = false
                }
                2->{
                    bt4.setText("O")
                    bt4.setBackgroundColor(getColor(R.color.colorplayer2))
                    player = 1
                    bt4.isClickable = false
                }
            }
        }
        binding.bt5.setOnClickListener{
            when(player){
                1->{ bt5.setText("x")
                    bt5.setBackgroundColor(getColor(R.color.colorAccent))
                    player =2
                    bt5.isClickable = false
                }
                2->{
                    bt5.setText("O")
                    bt5.setBackgroundColor(getColor(R.color.colorplayer2))
                    player = 1
                    bt5.isClickable = false
                }
            }
        }
        binding.bt6.setOnClickListener{
            when(player){
                1->{ bt6.setText("x")
                    bt6.setBackgroundColor(getColor(R.color.colorAccent))
                    player =2
                    bt6.isClickable = false
                }
                2->{
                    bt6.setText("O")
                    bt6.setBackgroundColor(getColor(R.color.colorplayer2))
                    player = 1
                    bt6.isClickable = false
                }
            }
        }
        binding.bt7.setOnClickListener{
            when(player){
                1->{ bt7.setText("x")
                    bt7.setBackgroundColor(getColor(R.color.colorAccent))
                    player =2
                    bt7.isClickable = false
                }
                2->{
                    bt7.setText("O")
                    bt7.setBackgroundColor(getColor(R.color.colorplayer2))
                    player = 1
                    bt7.isClickable = false
                }
            }
        }
        binding.bt8.setOnClickListener{
            when(player){
                1->{ bt8.setText("x")
                    bt8.setBackgroundColor(getColor(R.color.colorAccent))
                    player =2
                    bt8.isClickable = false
                }
                2->{
                    bt8.setText("O")
                    bt8.setBackgroundColor(getColor(R.color.colorplayer2))
                    player = 1
                    bt8.isClickable = false
                }
            }
        }
        binding.bt9.setOnClickListener{
            when(player){
                1->{ bt9.setText("x")
                    bt9.setBackgroundColor(getColor(R.color.colorAccent))
                    player =2
                    bt9.isClickable = false
                }
                2->{
                    bt9.setText("O")
                    bt9.setBackgroundColor(getColor(R.color.colorplayer2))
                    player = 1
                    bt9.isClickable = false
                }
            }
        }
    }


}
