package com.github.aachartmodel.aainfographics.aaoptionsmodel


open class AALine {
    var dataLabels: AADataLabels? = null

    fun dataLabels(prop: AADataLabels): AALine {
        dataLabels = prop
        return this
    }
}


open class AASpline {
    var dataLabels: AADataLabels? = null

    fun dataLabels(prop: AADataLabels): AASpline {
        dataLabels = prop
        return this
    }
}


open class AAArea {
    var dataLabels: AADataLabels? = null

    fun dataLabels(prop: AADataLabels): AAArea {
        dataLabels = prop
        return this
    }
}


open class AAAreaspline {
    var dataLabels: AADataLabels? = null

    fun dataLabels(prop: AADataLabels): AAAreaspline {
        dataLabels = prop
        return this
    }
}


open class AAArearange {
    var dataLabels: AADataLabels? = null

    fun dataLabels(prop: AADataLabels): AAArearange {
        dataLabels = prop
        return this
    }
}