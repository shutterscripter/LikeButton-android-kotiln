package com.jayesh.likebutton

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.like.LikeButton
import com.like.OnLikeListener

class MainActivity : AppCompatActivity() {
    lateinit var lbLike: LikeButton
    lateinit var lbStar: LikeButton
    lateinit var txtCount: TextView
    lateinit var txtCountStar: TextView

    var likeCount: Int = 0
    var starCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lbLike = findViewById(R.id.lbLike)
        lbStar = findViewById(R.id.lbStar)
        txtCount = findViewById(R.id.txtCount)
        txtCountStar = findViewById(R.id.txtCountStar)


        //setting OnClickListener on like button
        lbLike.setOnLikeListener(
            object : OnLikeListener {
                override fun liked(likeButton: LikeButton?) {
                    likeCount += 1
                    txtCount.text = likeCount.toString()
                }

                override fun unLiked(likeButton: LikeButton?) {
                    println("Unliked")
                }
            }
        )

        //setting OnClickListener on Star button
        lbStar.setOnLikeListener(
            object : OnLikeListener {
                override fun liked(likeButton: LikeButton?) {
                    starCount += 1
                    txtCountStar.text = starCount.toString()
                }

                override fun unLiked(likeButton: LikeButton?) {
                    println("Unliked")
                }
            }
        )
    }
}
