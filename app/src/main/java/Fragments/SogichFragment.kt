package Fragments

import Adapters.SevgiAdapter
import Adapters.SoginchAdapter
import Models.SevgiModel
import Models.SoginchModel
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.smssherlar.R
import kotlinx.android.synthetic.main.fragment_sevgi.view.*
import kotlinx.android.synthetic.main.fragment_sevgi.view.tariffsRecyclerView
import kotlinx.android.synthetic.main.fragment_sogich.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SogichFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SogichFragment : Fragment() {
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
    lateinit var adapter: SoginchAdapter
    lateinit var list: ArrayList<SoginchModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_sogich, container, false)

        list = ArrayList()

        root.btn_back2.setOnClickListener {
            root.findNavController().popBackStack()
        }

        list.add(SoginchModel(" Men sizni sogindim, sogindim yomon", "Yo'q sizni unitmoq \n" +
                "Emasdir onson\n" +
                "Qalbimni  ortaydi siz yoqan chiroq\n" +
                "Yurakda bir tuygu uradi tozon \n" +
                "Men sizni sogindim, sogindim yomon" ))

        list.add(SoginchModel(" Men sizni sogindim, sogindim yomon", "Yo'q sizni unitmoq \n" +
                "Emasdir onson\n" +
                "Qalbimni  ortaydi siz yoqan chiroq\n" +
                "Yurakda bir tuygu uradi tozon \n" +
                "Men sizni sogindim, sogindim yomon" ))

        list.add(SoginchModel(" Men sizni sogindim, sogindim yomon", "Yo'q sizni unitmoq \n" +
                "Emasdir onson\n" +
                "Qalbimni  ortaydi siz yoqan chiroq\n" +
                "Yurakda bir tuygu uradi tozon \n" +
                "Men sizni sogindim, sogindim yomon" ))
        list.add(SoginchModel(" Men sizni sogindim, sogindim yomon", "Yo'q sizni unitmoq \n" +
                "Emasdir onson\n" +
                "Qalbimni  ortaydi siz yoqan chiroq\n" +
                "Yurakda bir tuygu uradi tozon \n" +
                "Men sizni sogindim, sogindim yomon" ))
        adapter = SoginchAdapter(root.context, list)

        root.SoginchsRecyclerView.adapter = adapter


    return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SogichFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SogichFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}