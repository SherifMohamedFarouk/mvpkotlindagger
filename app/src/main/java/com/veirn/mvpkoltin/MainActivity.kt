package com.veirn.mvpkoltin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.veirn.mvpkoltin.Model.MainContracter
import com.veirn.mvpkoltin.Presenter.MainPres
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() , MainContracter.view {


  lateinit var mainPres : MainPres

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPres= MainPres(this)
//        injectDependencies()
        clickk.setOnClickListener(View.OnClickListener {
mainPres.clickbt()
        })
    }

//    private fun injectDependencies() {
//        val activityComponent = DaggerActivityComponent.builder()
//            .activityModule(ActivityModule(this))
//            .build()
//
//        activityComponent.inject(this)
//    }

    override fun getString(d: String) {
        clickk.text = d
    }

}
