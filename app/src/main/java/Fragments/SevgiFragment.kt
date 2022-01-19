package Fragments

import Adapters.SevgiAdapter
import Models.OtaOnaModels
import Models.SevgiModel
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.smssherlar.R
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.fragment_sevgi.view.*
import kotlinx.android.synthetic.main.item_shield_sevgi.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SevgiFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SevgiFragment : Fragment() {
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

    lateinit var root: View
    lateinit var adapter: SevgiAdapter
    lateinit var list: ArrayList<SevgiModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_sevgi, container, false)

        list = ArrayList()

        root.btn_back.setOnClickListener {
            root.findNavController().popBackStack()
        }

        list.add(SevgiModel(" oshiq_derlar_meni", "Sevdimmm degan so`zingni asra,\n" +
                "Meni kutgan ko`zingni asra,\n" +
                "Seni topgum, yoningga borgum,\n" +
                "Men uchun ham o`zingni asra.\n" ))

        list.add(SevgiModel(" oshiq_derlar_meni", "Sevdimmm degan so`zingni asra,\n" +
                "Meni kutgan ko`zingni asra,\n" +
                "Seni topgum, yoningga borgum,\n" +
                "Men uchun ham o`zingni asra.\n" ))
        list.add(SevgiModel(" oshiq_derlar_meni", "Sevdimmm degan so`zingni asra,\n" +
                "Meni kutgan ko`zingni asra,\n" +
                "Seni topgum, yoningga borgum,\n" +
                "Men uchun ham o`zingni asra.\n" ))
        list.add(SevgiModel(" oshiq_derlar_meni", "Sevdimmm degan so`zingni asra,\n" +
                "Meni kutgan ko`zingni asra,\n" +
                "Seni topgum, yoningga borgum,\n" +
                "Men uchun ham o`zingni asra.\n" ))

        adapter = SevgiAdapter(root.context, list)

        root.tariffsRecyclerView.adapter = adapter

    return root
    }

    fun dialogShow(sher: SevgiModel){
//        val alerdDialog = BottomSheetDialog(root.context)
//        val viewDialog = LayoutInflater.from(root.context).inflate(R.layout.item_shield_sevgi, null, false)
//
//
//        viewDialog.txt_dialog_name.text = SevgiModel.name
//        viewDialog.txt_dialog_text.text = sher.matni
//
//        alerdDialog.setContentView(viewDialog)
//        alerdDialog.show()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SevgiFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SevgiFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}