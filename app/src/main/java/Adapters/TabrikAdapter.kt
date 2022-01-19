package Adapters

import Models.SevgiModel
import Models.SoginchModel
import Models.TabrikModel
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.smssherlar.R
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.item_sevgi.view.*
import kotlinx.android.synthetic.main.item_shield_sevgi.view.*

class TabrikAdapter(var context: Context, var list: ArrayList<TabrikModel>) :
    RecyclerView.Adapter<TabrikAdapter.MyViewHolder>() {
    inner class MyViewHolder(var itemview: View) : RecyclerView.ViewHolder(itemview) {
        fun onBind(model: TabrikModel, position: Int) {
            itemview.tariffName.text = list[position].name
            itemview.tariffCode.text = list[position].code


            itemview.setOnClickListener {
              //  itemview.findNavController().navigate(R.id.tabrikInfoFragment, bundleOf("keyName" to list[position].name, "keyCode" to list[position].code ))

                dialogShow(TabrikModel("${itemview.tariffName.text.toString()}","${itemview.tariffCode.text.toString()}"))


            }
        }
    }

    fun dialogShow(sher: TabrikModel){
        val alerdDialog = BottomSheetDialog(context)
        val viewDialog = LayoutInflater.from(context).inflate(R.layout.item_shield_sevgi, null, false)

        viewDialog.txt_dialog_name.text = sher.name
        viewDialog.txt_dialog_text.text = sher.code


        viewDialog.card_sms_dialog.setOnClickListener {
            var nam=0
            var smsNumberUri= Uri.parse("sms:${ nam.toString()}")
            val smsIntent= Intent(Intent.ACTION_SENDTO, smsNumberUri)
            ContextCompat.startActivity(context, smsIntent, bundleOf())

            Toast.makeText(context, "clickded sms", Toast.LENGTH_SHORT).show()
            true
        }


        viewDialog.card_saqlangan_dialog.setOnClickListener {
            viewDialog.like_saqla.setImageResource(R.drawable.ic_sher_saqlanganda)
        }
        viewDialog.card_share_dialog.setOnClickListener {
            val shareBody = "Uzun qatorlli sherni share qilindi text"
            val shareSub = "Created by Nurmuhammad"

            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub)
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody)
            ContextCompat.startActivity(context, shareIntent, bundleOf())
        }


        viewDialog.btn_copy.setOnClickListener {
            if (sher.code != null) {
                Copydo(sher.code)
                Toast.makeText(context, "Copy", Toast.LENGTH_SHORT).show()
            }
        }


        alerdDialog.setContentView(viewDialog)
        alerdDialog.show()
    }

    private fun Copydo(text: CharSequence) {
        //    val clipboard= getSystemService(View.CLIPBOARD_SERVICE) as android.content.ClipboardManager
        val clipboard = context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager?
        val clip = ClipData.newPlainText("tex", text)
        clipboard?.setPrimaryClip(clip)
        true
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_sevgi, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}