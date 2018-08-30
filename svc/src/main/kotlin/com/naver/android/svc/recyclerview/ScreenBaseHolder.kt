package com.naver.android.svc.recyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.naver.android.svc.core.common.ResourceProvider
import com.naver.android.svc.core.screen.Screen

abstract class ScreenBaseHolder(layoutId: Int, parent: ViewGroup, val screen: Screen<*, *>)
    : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(layoutId, parent, false))
        , ResourceProvider {

    override val context: Context?
        get() = itemView.context

}