package io.shonazarova.todos

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import io.shonazarova.todos.databinding.FragmentLoginBinding

class login_fragment : Fragment (R.layout.fragment_login) {

    private lateinit var binding: FragmentLoginBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentLoginBinding.bind(view)

        binding.cntBtn.setOnClickListener {
            findNavController().navigate(R.id.from_login_to_todos)
        }

    }
}