package com.zia.util

import android.content.Context
import android.content.pm.PackageManager

/**
 * Created by zia on 2018/11/2.
 */
object Version {
    fun packageCode(context: Context): Int {
        val manager = context.packageManager
        var code = 0
        try {
            val info = manager.getPackageInfo(context.packageName, 0)
            code = info.versionCode
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }

        return code
    }

    fun packageName(context: Context): String {
        val manager = context.packageManager
        var name = ""
        try {
            val info = manager.getPackageInfo(context.packageName, 0)
            name = info.versionName
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }

        return name
    }
}
