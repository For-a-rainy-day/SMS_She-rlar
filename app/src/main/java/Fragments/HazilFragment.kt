package Fragments

import Adapters.HazilAdapter
import Adapters.OtaOnaAdapter
import Models.DostlikModel
import Models.HazilModel
import Models.OtaOnaModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.smssherlar.R
import kotlinx.android.synthetic.main.fragment_hazil.view.*
import kotlinx.android.synthetic.main.fragment_ota_ona_fragments.view.*
import kotlinx.android.synthetic.main.fragment_ota_ona_fragments.view.OtaOnaRecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HazilFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HazilFragment : Fragment() {
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
    lateinit var adapter: HazilAdapter
    lateinit var list: ArrayList<HazilModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_hazil, container, false)

        list = ArrayList()

        root.btn_back6.setOnClickListener {
            root.findNavController().popBackStack()
        }

        list.add(HazilModel(" Hazil She`r", "\n" +
                "DO'STLAR SEROB BO'LIB QOLADI\n" +
                "DOMLALARHAM QO'LING OLADI\n" +
                "QALBDA QUVONCH YOG'DU SOLADI\n" +
                "STIPENDIYA OLGAN KUNINGDA"))

        list.add(HazilModel(" Hazil She`r", "\n" +
                "DO'STLAR SEROB BO'LIB QOLADI\n" +
                "DOMLALARHAM QO'LING OLADI\n" +
                "QALBDA QUVONCH YOG'DU SOLADI\n" +
                "STIPENDIYA OLGAN KUNINGDA"))

        list.add(HazilModel(" Hazil She`r", "\n" +
                "DO'STLAR SEROB BO'LIB QOLADI\n" +
                "DOMLALARHAM QO'LING OLADI\n" +
                "QALBDA QUVONCH YOG'DU SOLADI\n" +
                "STIPENDIYA OLGAN KUNINGDA"))
        
        list.add(HazilModel(" Hazil She`r", "\n" +
                "DO'STLAR SEROB BO'LIB QOLADI\n" +
                "DOMLALARHAM QO'LING OLADI\n" +
                "QALBDA QUVONCH YOG'DU SOLADI\n" +
                "STIPENDIYA OLGAN KUNINGDA"))

        adapter = HazilAdapter(root.context, list)


        root.HazilRecyclerView.adapter = adapter


        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HazilFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HazilFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}