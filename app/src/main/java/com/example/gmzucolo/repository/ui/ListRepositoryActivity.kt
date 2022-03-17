package com.example.gmzucolo.repository.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gmzucolo.R

class ListRepositoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_repository_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, RepositoryFragment.newInstance())
                .commitNow()
        }
    }
}