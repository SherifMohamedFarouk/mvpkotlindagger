package com.veirn.mvpkoltin.Model

class MainContracter {

    interface pres{
        fun clickbt(){

        }

    }
    interface model{
        fun getData() : String



    }
    interface view {
       fun getString(d:String){

       }

    }

}