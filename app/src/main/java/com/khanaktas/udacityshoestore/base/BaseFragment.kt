package com.khanaktas.udacityshoestore.base

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		Log.i(this.javaClass.simpleName, "onCreate")
	}

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {

		Log.i(this.javaClass.simpleName, "onCreateView")

		return super.onCreateView(inflater, container, savedInstanceState)
	}
}