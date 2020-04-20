package kr.tjeit.fragmentmore_20200420

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_board.*
import kr.tjeit.fragmentmore_20200420.adapters.PostAdapter
import kr.tjeit.fragmentmore_20200420.datas.Post
import kr.tjeit.fragmentmore_20200420.fragments.BaseFragment

class boardFragment : BaseFragment(){

    var mPostAdapter : PostAdapter? = null
    var mPostList : ArrayList<Post>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.post_list_item, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

    }

    override fun setValues() {

        mPostList.add(Post(companyName = "삼성전자",  Amount = 10, UserName = "김지영"))
        mPostList.add(Post(companyName = "삼성즌자",  Amount = 10, UserName = "김지영"))
        mPostList.add(Post(companyName = "삼성잔자",  Amount = 10, UserName = "김지영"))
        mPostList.add(Post(companyName = "삼성친자",  Amount = 10, UserName = "김지영"))
        mPostList.add(Post(companyName = "삼성주자",  Amount = 10, UserName = "김지영"))
        mPostList.add(Post(companyName = "삼성차자",  Amount = 10, UserName = "김지영"))
        mPostList.add(Post(companyName = "삼성빵자",  Amount = 10, UserName = "김지영"))
        mPostList.add(Post(companyName = "삼성즐자",  Amount = 10, UserName = "김지영"))

        mPostAdapter = PostAdapter(mContext!!, R.layout.post_list_item, mPostList)
        boardListView.adapter = mPostAdapter
    }


}