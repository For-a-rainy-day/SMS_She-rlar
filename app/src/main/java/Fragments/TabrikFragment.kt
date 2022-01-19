package Fragments

import Adapters.SoginchAdapter
import Adapters.TabrikAdapter
import Models.SoginchModel
import Models.TabrikModel
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.smssherlar.R
import kotlinx.android.synthetic.main.fragment_sevgi.view.*
import kotlinx.android.synthetic.main.fragment_sogich.view.*
import kotlinx.android.synthetic.main.fragment_sogich.view.SoginchsRecyclerView
import kotlinx.android.synthetic.main.fragment_tabrik.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TabrikFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TabrikFragment : Fragment() {
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
    lateinit var adapter: TabrikAdapter
    lateinit var list: ArrayList<TabrikModel>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_tabrik, container, false)
        list = ArrayList()

        root.btn_back3.setOnClickListener {
            root.findNavController().popBackStack()
        }

        list.add(TabrikModel(" Sizdek insonlarni ko’proq yaratsin!", "Tilaklar ichida izlab topganim,\n" +
                "Alloh nigohini sizga qaratsin.\n" +
                "Yagona o’tinchim Allohdan bu kun,\n" +
                "Sizdek insonlarni ko’proq yaratsin!\n" +
                "Tavallud ayyomingiz qutlug’ bo’lsin!" ))

        list.add(TabrikModel(" Sizdek insonlarni ko’proq yaratsin!", "Tilaklar ichida izlab topganim,\n" +
                "Alloh nigohini sizga qaratsin.\n" +
                "Yagona o’tinchim Allohdan bu kun,\n" +
                "Sizdek insonlarni ko’proq yaratsin!\n" +
                "Tavallud ayyomingiz qutlug’ bo’lsin!" ))
        list.add(TabrikModel(" Sizdek insonlarni ko’proq yaratsin!", "Tilaklar ichida izlab topganim,\n" +
                "Alloh nigohini sizga qaratsin.\n" +
                "Yagona o’tinchim Allohdan bu kun,\n" +
                "Sizdek insonlarni ko’proq yaratsin!\n" +
                "Tavallud ayyomingiz qutlug’ bo’lsin!" ))

        list.add(TabrikModel(" Sizdek insonlarni ko’proq yaratsin!", "Tilaklar ichida izlab topganim,\n" +
                "Alloh nigohini sizga qaratsin.\n" +
                "Yagona o’tinchim Allohdan bu kun,\n" +
                "Sizdek insonlarni ko’proq yaratsin!\n" +
                "Tavallud ayyomingiz qutlug’ bo’lsin!" ))



        adapter = TabrikAdapter(root.context, list)

        root.TabrikRecyclerView.adapter = adapter


        return  root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TabrikFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TabrikFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}