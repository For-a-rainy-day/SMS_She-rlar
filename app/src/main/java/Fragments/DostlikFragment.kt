package Fragments

import Adapters.DostlikAdapter
import Adapters.OtaOnaAdapter
import Models.DostlikModel
import Models.OtaOnaModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.smssherlar.R
import kotlinx.android.synthetic.main.fragment_dostlik.view.*
import kotlinx.android.synthetic.main.fragment_ota_ona_fragments.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DostlikFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DostlikFragment : Fragment() {
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
    lateinit var adapter: DostlikAdapter
    lateinit var list: ArrayList<DostlikModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_dostlik, container, false)
        list = ArrayList()

        root.btn_back5.setOnClickListener {
            root.findNavController().popBackStack()
        }

        list.add(DostlikModel(" Chin do'st", "Og'ir kunda tirgak do'st,\n" +
                "Havotirda sergak do'st,\n" +
                "100 ta dushman oldida,\n" +
                "Qochmas aslo erkak do'st!" ))

        list.add(DostlikModel(" Chin do'st", "Og'ir kunda tirgak do'st,\n" +
                "Havotirda sergak do'st,\n" +
                "100 ta dushman oldida,\n" +
                "Qochmas aslo erkak do'st!" ))

        list.add(DostlikModel(" Chin do'st", "Og'ir kunda tirgak do'st,\n" +
                "Havotirda sergak do'st,\n" +
                "100 ta dushman oldida,\n" +
                "Qochmas aslo erkak do'st!" ))

        list.add(DostlikModel(" Chin do'st", "Og'ir kunda tirgak do'st,\n" +
                "Havotirda sergak do'st,\n" +
                "100 ta dushman oldida,\n" +
                "Qochmas aslo erkak do'st!" ))

        adapter = DostlikAdapter (root.context, list)


        root.DostlikRecyclerView.adapter = adapter
        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DostlikFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DostlikFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}