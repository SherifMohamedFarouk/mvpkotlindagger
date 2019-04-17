package com.veirn.mvpkoltin

import android.app.Activity
import com.veirn.mvpkoltin.Model.MainModel
import dagger.Module
import dagger.Provides
import com.veirn.mvpkoltin.MainActivity
import com.veirn.mvpkoltin.Presenter.MainPres


@Module
object ActivityModule {

    @Provides
    fun provideActivity():MainActivity{
        return MainActivity()
    }


    @Provides
    fun providepres(activity:MainActivity):MainPres{
        return MainPres(activity)
    }

    @Provides
    fun providemodel():MainModel{
        return MainModel()
    }

}