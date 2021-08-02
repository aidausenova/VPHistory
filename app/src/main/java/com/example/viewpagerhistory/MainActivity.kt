package com.example.viewpagerhistory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.viewpagerhistory.fragments.ArchiveFragment
import com.example.viewpagerhistory.fragments.ButtonFragment
import com.example.viewpagerhistory.fragments.CounterFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val list: ArrayList<Fragment> =
        arrayListOf(ButtonFragment(), CounterFragment(), ArchiveFragment())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view_pager.offscreenPageLimit = 3
        init()

    }

    private fun init() {
        view_pager.adapter = Adapter(list, supportFragmentManager, lifecycle)
        btn_view.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.btn_nav -> {
                    view_pager.currentItem = 0

                }
                R.id.count_nav -> {
                    view_pager.currentItem = 1
                }
                R.id.archive_nav -> {
                    view_pager.currentItem = 2
                }
            }
        }
    }

}