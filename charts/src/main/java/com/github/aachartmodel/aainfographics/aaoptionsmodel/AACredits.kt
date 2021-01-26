/**
 * Copyright (C), 2015-2021
 * FileName: AACredits
 * Author: AnAn
 * Date: 2021/1/26 10:55 AM
 * Description:
 * History:
 */
package com.github.aachartmodel.aainfographics.aaoptionsmodel;


class AACredits {
    var enabled: Boolean? = null
    var href: String? = null
    var position: AAPosition? = null
    var style: AAStyle? = null
    var text: String? = null
    fun enabled(prop: Boolean): AACredits {
        enabled = prop
        return this
    }

    fun href(prop: String?): AACredits {
        href = prop
        return this
    }

    fun position(prop: AAPosition?): AACredits {
        position = prop
        return this
    }

    fun style(prop: AAStyle?): AACredits {
        style = prop
        return this
    }

    fun text(prop: String?): AACredits {
        text = prop
        return this
    }
}


class AAPosition {
    var align: String? = null
    var verticalAlign: String? = null
    var x: Number? = null
    var y: Number? = null
    fun align(prop: String?): AAPosition {
        align = prop
        return this
    }

    fun verticalAlign(prop: String?): AAPosition {
        verticalAlign = prop
        return this
    }

    fun align(prop: Number?): AAPosition {
        x = prop
        return this
    }

    fun y(prop: Number?): AAPosition {
        y = prop
        return this
    }
}

