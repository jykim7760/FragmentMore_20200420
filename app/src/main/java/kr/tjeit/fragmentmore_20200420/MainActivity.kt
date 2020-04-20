package kr.tjeit.fragmentmore_20200420

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.tjeit.fragmentmore_20200420.adapters.MyFragPagerAdapter

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        hideTxtBtn.setOnClickListener {
//            프래그머느 안으로 접근하여 코드 제어



        }

    }

    override fun setValues() {
        myViewPager.adapter = MyFragPagerAdapter(supportFragmentManager)

        myTabLayout.setupWithViewPager(myViewPager)



    }

}


// 유용한 라이브러리 - gradel : 앱모듈의 전반적 설정/의존성 관리 파일 = maven
// gradle : 빌드수행하는 파일관리 _ 대부분의 일반적인 세팅은 모듈에서 편집
// 특수상황 라이브러리 가져오는 출처확장 : Project 파일 편집