package com.veirn.mvpkoltin

import dagger.Component
import com.veirn.mvpkoltin.MainActivity
import com.veirn.mvpkoltin.Model.MainModel
import com.veirn.mvpkoltin.Presenter.MainPres

@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {


    fun inject(model: MainPres)

    @Component.Builder
    interface Builder{
        fun build() : ActivityComponent
        fun activityModule(activityModule:ActivityModule) :Builder
    }

}