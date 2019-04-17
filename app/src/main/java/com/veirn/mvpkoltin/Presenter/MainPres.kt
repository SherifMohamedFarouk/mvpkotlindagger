package com.veirn.mvpkoltin.Presenter

import com.veirn.mvpkoltin.Base
import com.veirn.mvpkoltin.Model.MainContracter
import com.veirn.mvpkoltin.Model.MainModel
import javax.inject.Inject

class  MainPres(internal var view : MainContracter.view) :  MainContracter.pres , Base() {

 @Inject lateinit var mainModel:MainModel


    override fun clickbt() {
        super.clickbt()
      var d =  mainModel.getData()
        view.getString(d)

    }

}


//class MainPres(internal var view: MainContracter.view) : MainContracter.Ipres {
//    internal var mainModel: MainModel
//
//    init {
//        mainModel = MainModel()
//
//    }
//
//    fun onCLicktext() {
//        val d = mainModel.getdata()
//        view.getString(d)
//
//    }
//
//
//}