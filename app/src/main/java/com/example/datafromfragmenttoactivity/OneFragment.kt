package com.example.datafromfragmenttoactivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.datafromfragmenttoactivity.databinding.FragmentOneBinding
class OneFragment : Fragment() {
    lateinit var binding: FragmentOneBinding
    private val dataModel: DataModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOneBinding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnSendInFragmentOne.setOnClickListener {
            dataModel.messageForActivityOneFragment.value =
                arrayOf(
                    "красный",
                    "оранжевый",
                    "желтый",
                    "зеленый",
                    "голубой",
                    "синий",
                    "фиолетовый"
                ).random()
        }
    }
    companion object {
        @JvmStatic
        fun newInstance() = OneFragment()
    }
}