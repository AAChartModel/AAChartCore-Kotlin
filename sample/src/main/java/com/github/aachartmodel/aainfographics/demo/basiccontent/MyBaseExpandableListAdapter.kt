package com.github.aachartmodel.aainfographics.demo.basiccontent

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.github.aachartmodel.aainfographics.demo.R

class MyBaseExpandableListAdapter(
    private val gData: Array<String>,
    private val iData: Array<Array<String>>,
    private val mContext: Context,
    private val colorsArr: Array<String> = arrayOf("#5470c6",
        "#91cc75",
        "#fac858",
        "#ee6666",
        "#73c0de",
        "#3ba272",
        "#fc8452",
        "#9a60b4",
        "#ea7ccc",
        "#5470c6",
        "#91cc75",
        "#fac858",
        "#ee6666",
        "#73c0de",
        "#3ba272",
        "#fc8452",
        "#9a60b4",
        "#ea7ccc"
    )
) :
    BaseExpandableListAdapter() {
    override fun getGroupCount(): Int {
        return gData.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return iData[groupPosition].count()
    }

    override fun getGroup(groupPosition: Int): String {
        return gData[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): String {
        return iData[groupPosition][childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    //取得用于显示给定分组的视图. 这个方法仅返回分组的视图对象
    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup
    ): View? {
        var convertView = convertView
        val groupHolder: ViewHolderGroup
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(
                R.layout.item_exlist_group, parent, false
            )
            groupHolder = ViewHolderGroup()
            groupHolder.tv_group_name = convertView.findViewById<View>(R.id.tv_group_name) as TextView
            convertView.tag = groupHolder
        } else {
            groupHolder = convertView.tag as ViewHolderGroup
        }
        groupHolder.tv_group_name!!.text = gData[groupPosition]
        return convertView
    }

    //取得显示给定分组给定子位置的数据用的视图
    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup
    ): View? {
        var convertView = convertView
        val itemHolder: ViewHolderItem
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(
                R.layout.item_exlist_item, parent, false
            )
            itemHolder = ViewHolderItem()
            itemHolder.tv_color_dot = convertView.findViewById<View>(R.id.tv_color_dot) as TextView
            itemHolder.tv_name = convertView.findViewById<View>(R.id.tv_name) as TextView
            convertView.tag = itemHolder
        } else {
            itemHolder =
                convertView.tag as ViewHolderItem
        }
        val colorStr = colorsArr[groupPosition]
        itemHolder.tv_color_dot?.setTextColor(Color.parseColor(colorStr))
        itemHolder.tv_name?.text = iData[groupPosition][childPosition]
        return convertView
    }

    //设置子列表是否可选中
    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    private class ViewHolderGroup {
        var tv_group_name: TextView? = null
    }

    private class ViewHolderItem {
        var tv_color_dot: TextView? = null
        var tv_name: TextView? = null
    }

}