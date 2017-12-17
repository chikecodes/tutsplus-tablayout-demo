package com.chikeandroid.tutsplusttablayoutdemo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Chike on 12/11/2017.
 */
class FragmentOne : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            inflater!!.inflate(R.layout.fragment_one, container, false)

    companion object {
        fun newInstance(): FragmentOne = FragmentOne()
    }
}