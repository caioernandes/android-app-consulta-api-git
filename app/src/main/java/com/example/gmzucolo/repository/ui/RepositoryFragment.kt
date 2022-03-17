package com.example.gmzucolo.repository.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.gmzucolo.R
import com.example.gmzucolo.repository.viewmodel.RepositoryViewModel

class RepositoryFragment : Fragment() {

    companion object {
        fun newInstance() = RepositoryFragment()
    }

    private lateinit var viewModel: RepositoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.repository_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RepositoryViewModel::class.java)
        // TODO: Use the ViewModel
    }

}