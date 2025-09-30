package com.github.aachartmodel.aainfographics.demo.basiccontent

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.ColorUtils
import androidx.core.view.ViewCompat
import com.github.aachartmodel.aainfographics.demo.R
import com.google.android.material.card.MaterialCardView

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
            groupHolder.iv_indicator = convertView.findViewById(R.id.iv_group_indicator) as ImageView
            groupHolder.cardContainer = convertView.findViewById(R.id.card_group_container) as MaterialCardView
            convertView.tag = groupHolder
        } else {
            groupHolder = convertView.tag as ViewHolderGroup
        }
        val accentColor = parseGroupColor(groupPosition)
        groupHolder.tv_group_name?.text = gData[groupPosition]
        groupHolder.tv_group_name?.setTextColor(ColorUtils.setAlphaComponent(accentColor, 230))

        groupHolder.cardContainer?.strokeColor = ColorUtils.setAlphaComponent(accentColor, 60)
        groupHolder.cardContainer?.rippleColor = ColorStateList.valueOf(ColorUtils.setAlphaComponent(accentColor, 80))
        groupHolder.cardContainer?.setCardBackgroundColor(
            if (isExpanded) ColorUtils.setAlphaComponent(accentColor, 24) else Color.WHITE
        )

        groupHolder.iv_indicator?.let { indicator ->
            val targetRotation = if (isExpanded) 180f else 0f
            if (indicator.rotation != targetRotation) {
                indicator.animate()?.cancel()
                indicator.animate()
                    ?.rotation(targetRotation)
                    ?.setDuration(200L)
                    ?.start()
            } else {
                indicator.animate()?.cancel()
                indicator.rotation = targetRotation
            }
        }
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
            itemHolder.cardContainer = convertView.findViewById(R.id.card_item_container) as MaterialCardView
            itemHolder.tv_color_dot = convertView.findViewById(R.id.tv_color_dot) as TextView
            itemHolder.tv_name = convertView.findViewById(R.id.tv_name) as TextView
            itemHolder.tv_subtitle = convertView.findViewById(R.id.tv_subtitle) as TextView
            itemHolder.ivChevron = convertView.findViewById(R.id.iv_item_chevron) as ImageView
            convertView.tag = itemHolder
        } else {
            itemHolder =
                convertView.tag as ViewHolderItem
        }
        val accentColor = parseGroupColor(groupPosition)
        itemHolder.tv_color_dot?.setTextColor(accentColor)
        itemHolder.tv_color_dot?.let {
            ViewCompat.setBackgroundTintList(
                it,
                ColorStateList.valueOf(ColorUtils.setAlphaComponent(accentColor, 60))
            )
        }

        itemHolder.tv_name?.text = iData[groupPosition][childPosition]
    itemHolder.tv_subtitle?.setTextColor(ColorUtils.setAlphaComponent(accentColor, 170))

    itemHolder.cardContainer?.strokeColor = ColorUtils.setAlphaComponent(accentColor, 45)
    itemHolder.cardContainer?.setCardBackgroundColor(ColorUtils.setAlphaComponent(accentColor, 16))
        itemHolder.cardContainer?.rippleColor = ColorStateList.valueOf(ColorUtils.setAlphaComponent(accentColor, 90))
        itemHolder.ivChevron?.rotation = -90f
        itemHolder.ivChevron?.imageTintList = ColorStateList.valueOf(ColorUtils.setAlphaComponent(accentColor, 200))
        return convertView
    }

    //设置子列表是否可选中
    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    private fun parseGroupColor(groupPosition: Int): Int {
        val colorStr = colorsArr[groupPosition % colorsArr.size]
        return Color.parseColor(colorStr)
    }

    private class ViewHolderGroup {
        var tv_group_name: TextView? = null
        var iv_indicator: ImageView? = null
        var cardContainer: MaterialCardView? = null
    }

    private class ViewHolderItem {
        var cardContainer: MaterialCardView? = null
        var tv_color_dot: TextView? = null
        var tv_name: TextView? = null
        var tv_subtitle: TextView? = null
        var ivChevron: ImageView? = null
    }

}