package Fragments

import Models.SevgiModel
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.smssherlar.R
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.item_saqlanganlar.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_home, container, false)


        root.card_sevgi.setOnClickListener{
            root.findNavController().navigate(R.id.sevgiFragment)
        }
        root.card_soginch.setOnClickListener{
            root.findNavController().navigate(R.id.sogichFragment2)
        }
        root.card_tabrik.setOnClickListener{
            root.findNavController().navigate(R.id.tabrikFragment)
        }
        root.card_ota_ona.setOnClickListener{
            root.findNavController().navigate(R.id.otaOnaFragments)
        }
        root.card_dostlik.setOnClickListener{
            root.findNavController().navigate(R.id.dostlikFragment)
        }
        root.card_hazil.setOnClickListener{
            root.findNavController().navigate(R.id.hazilFragment)
        }

        root.card_1.setOnClickListener{
            root.findNavController().navigate(R.id.yangiliariFragment)


        }
      root.card_2.setOnClickListener{
            root.findNavController().navigate(R.id.saqlanganlarFragment)
        }

    return root
    }

    fun dialogShow(sher: SevgiModel){
        val alerdDialog = BottomSheetDialog(root.context)
        val viewDialog = LayoutInflater.from(root.context).inflate(R.layout.item_saqlanganlar, null, false)

        viewDialog.txt_sher_saqlanganlar.text = sher.name
        viewDialog.txt_sher_saqlanganlar_matn.text = sher.code

        alerdDialog.setContentView(viewDialog)
        alerdDialog.show()
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}