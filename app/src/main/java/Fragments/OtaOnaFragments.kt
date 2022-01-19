package Fragments

import Adapters.OtaOnaAdapter
import Adapters.SevgiAdapter
import Models.HazilModel
import Models.OtaOnaModels
import Models.SevgiModel
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.smssherlar.R
import kotlinx.android.synthetic.main.fragment_ota_ona_fragments.view.*
import kotlinx.android.synthetic.main.fragment_sevgi.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [OtaOnaFragments.newInstance] factory method to
 * create an instance of this fragment.
 */
class OtaOnaFragments : Fragment() {
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
    lateinit var adapter: OtaOnaAdapter
    lateinit var list: ArrayList<OtaOnaModels>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_ota_ona_fragments, container, false)

        list = ArrayList()

        root.btn_back4.setOnClickListener {
            root.findNavController().popBackStack()
        }

        list.add(OtaOnaModels(" KECHIRING OTА KECHIRING ONА", "Meni joni ichra saqlagan onam,\n" +
                "Dunyoga kelishim xoxlagan onam,\n" +
                "Аlla aytib baxtlar tilagan onam,\n" +
                "Bedor tunlar haqqi kechiring ona,\n" +
                "Gunohlarim qalbdan oʼchiring ona."))

        list.add(OtaOnaModels(" KECHIRING OTА KECHIRING ONА", "Meni joni ichra saqlagan onam,\n" +
                "Dunyoga kelishim xoxlagan onam,\n" +
                "Аlla aytib baxtlar tilagan onam,\n" +
                "Bedor tunlar haqqi kechiring ona,\n" +
                "Gunohlarim qalbdan oʼchiring ona."))

        list.add(OtaOnaModels(" KECHIRING OTА KECHIRING ONА", "Meni joni ichra saqlagan onam,\n" +
                "Dunyoga kelishim xoxlagan onam,\n" +
                "Аlla aytib baxtlar tilagan onam,\n" +
                "Bedor tunlar haqqi kechiring ona,\n" +
                "Gunohlarim qalbdan oʼchiring ona."))

        list.add(OtaOnaModels(" KECHIRING OTА KECHIRING ONА", "Meni joni ichra saqlagan onam,\n" +
                "Dunyoga kelishim xoxlagan onam,\n" +
                "Аlla aytib baxtlar tilagan onam,\n" +
                "Bedor tunlar haqqi kechiring ona,\n" +
                "Gunohlarim qalbdan oʼchiring ona."))

        adapter = OtaOnaAdapter(root.context, list)


        root.OtaOnaRecyclerView.adapter = adapter


        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment OtaOnaFragments.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            OtaOnaFragments().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}