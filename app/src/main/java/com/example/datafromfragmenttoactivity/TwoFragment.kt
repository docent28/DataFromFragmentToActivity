package com.example.datafromfragmenttoactivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.datafromfragmenttoactivity.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {
    lateinit var binding: FragmentTwoBinding
    private val dataModel: DataModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTwoBinding.inflate(inflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnSendInFragmentTwo.setOnClickListener {
            dataModel.messageForActivityTwoFragment.value =
                arrayOf(
                    "Меркурий",
                    "Венера",
                    "Земля",
                    "Марс",
                    "Юпитер",
                    "Сатурн",
                    "Уран",
                    "Нептун",
                ).random()
        }
    }
    companion object {
        @JvmStatic
        fun newInstance() = TwoFragment()
    }
}