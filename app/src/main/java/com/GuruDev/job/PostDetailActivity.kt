package com.GuruDev.job

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class PostDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_POST_ID = "extra_post_id"
        const val EXTRA_POST_TITLE = "extra_post_title"
        const val EXTRA_POSTBODY_TITLE = "extra_postBody_title"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_detail)

        val postId = intent.getIntExtra(EXTRA_POST_ID, 0)
        val postTitle = intent.getStringExtra(EXTRA_POST_TITLE)
        val postBody = intent.getStringExtra(EXTRA_POSTBODY_TITLE)

        val title: TextView = findViewById(R.id.textViewTitle)
        val Id: TextView = findViewById(R.id.textVieWPostId)
        val body: TextView = findViewById(R.id.textViewBody)

        title.text = "TITLE : ${postTitle}"
        Id.text = "POST ID : ${postId}"
        body.text = "BODY : ${postBody}"
    }
}
