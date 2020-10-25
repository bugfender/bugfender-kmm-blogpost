package com.bugfender.bugfenderkmm.shared

import android.content.Context
import com.bugfender.bugfenderkmm.android.BuildConfig
import com.bugfender.sdk.Bugfender

actual object BFLogger {

    actual fun activateLogger(bugfenderKey: String, context: Any?) {
        Bugfender.init(context as Context, bugfenderKey, BuildConfig.DEBUG)
    }

    actual fun log(msg: String) {
        Bugfender.d("Tag", msg)
    }

}
