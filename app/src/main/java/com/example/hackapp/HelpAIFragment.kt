package com.example.hackapp
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
/*
import android.os.Bundle

import com.example.hackapp.R
import kotlinx.android.synthetic.main.fragment_help_ai.*


class HelpAIFragment : Fragment(R.layout.fragment_help_ai) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_help_ai, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        submitButton.setOnClickListener {
            val userInput = userQuery.text.toString()

            // Здесь вы можете вызывать вашу ONNX модель с вводом пользователя
            val aiResponse = runOnnxModel(userInput)

            // Используйте результат, чтобы обновить TextView
            aiResponse?.let {
                aiResponseTextView.text = it
            }
        }
    }

    private fun runOnnxModel(userInput: String): String? {
        // Загрузите вашу ONNX модель
        // TODO: Замените этот код реальной логикой вызова модели ONNX
        return "Это ответ модели на ввод пользователя: $userInput"
    }

    // остальной код фрагмента
}
*/