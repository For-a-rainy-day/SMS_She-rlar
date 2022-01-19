package Fragments

import Adapters.DostlikAdapter
import Adapters.SaqlanganAdapter
import Models.DostlikModel
import Models.OtaOnaModels
import Models.SaqlanganModel
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.smssherlar.R
import kotlinx.android.synthetic.main.fragment_dostlik.view.*
import kotlinx.android.synthetic.main.fragment_dostlik.view.DostlikRecyclerView
import kotlinx.android.synthetic.main.fragment_saqlanganlar.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SaqlanganlarFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SaqlanganlarFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    lateinit var root:View
    lateinit var adapter: SaqlanganAdapter
    lateinit var list: ArrayList<SaqlanganModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_saqlanganlar, container, false)
        list = ArrayList()
        root.btn_back7.setOnClickListener {
            root.findNavController().popBackStack()
        }
        list.add(SaqlanganModel(" oshiq_derlar_meni", "Sevdimmm degan so`zingni asra,\n" +
                "Meni kutgan ko`zingni asra,\n" +
                "Seni topgum, yoningga borgum,\n" +
                "Men uchun ham o`zingni asra.\n" ))
      

//        list.add(SaqlanganModel(" Men uchun ozingni saqla2", "Sevdim degan so`zingni asra,\n" +
//                "Meni kutgan ko`zingni asra,\n" +
//                "Seni topgum, yoningga borgum,\n" +
//                "Men uchun ham o`zingni asra.\n" +
//                "\n" +
//                "Asra, dilda muxabbatingni,\n" +
//                "Asra menga ko`ngil xatingni,\n" +
//                "Menga atab hamma gapingni,\n" +
//                "Men uchun ham o`zingni asra."))


//        list.add(SaqlanganModel(" Men uchun ozingni asra3", "Sevdim degan so`zingni asra,\n" +
//                "Meni kutgan ko`zingni asra,\n" +
//                "Seni topgum, yoningga borgum,\n" +
//                "Men uchun ham o`zingni asra.\n" +
//                "\n" +
//                "Asra, dilda muxabbatingni,\n" +
//                "Asra menga ko`ngil xatingni,\n" +
//                "Menga atab hamma gapingni,\n" +
//                "Men uchun ham o`zingni asra."))



        adapter = SaqlanganAdapter (root.context, list)


        root.SaqlanganRecyclerView.adapter = adapter


        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SaqlanganlarFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SaqlanganlarFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}