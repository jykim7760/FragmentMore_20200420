package kr.tjeit.fragmentmore_20200420.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kr.tjeit.fragmentmore_20200420.R
import kr.tjeit.fragmentmore_20200420.datas.App
import kr.tjeit.fragmentmore_20200420.datas.Post

class PostAdapter(context: Context, resId: Int, list:ArrayList<Post>) : ArrayAdapter<Post>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        tempRow?.let {
//            null이 아닐때
        }.let {
//            null 일때
            tempRow = inf.inflate(R.layout.fragment_game_list, null)
        }

        val row = tempRow!!

        val   companyNametxt = row.findViewById<TextView>(R.id.companyNameTxt)
                val amounttxt = row.findViewById<TextView>(R.id.amountTxt)
        val usernametxt = row.findViewById<TextView>(R.id.usernameTxt)

        val postData = mList.get(position)

        companyNametxt.text = postData. companyName
        usernametxt.text = postData.UserName
        amounttxt.text = String.format("%,주", postData, amounttxt)





        return row
    }


}