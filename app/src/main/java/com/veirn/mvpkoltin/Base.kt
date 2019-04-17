package com.veirn.mvpkoltin

import android.support.v7.app.AppCompatActivity
import com.veirn.mvpkoltin.Presenter.MainPres
import dagger.Component

abstract class Base : AppCompatActivity(){
    private val injector: ActivityComponent = DaggerActivityComponent
        .builder()
        .activityModule(ActivityModule)
        .build()

    init{
        inject()
    }


    private fun inject(){
        when (this){
            is MainPres -> injector.inject(this)
        }
    }

}
