package com.bugfender.bugfenderkmm.shared

import cocoapods.BugfenderSDK.*

actual object BFLogger {

    actual fun activateLogger(bugfenderKey: String, context: Any?) {
        Bugfender.activateLogger(bugfenderKey)
    }

    actual fun log(msg: String) {
        Bugfender.logWithLineNumber(0, "", "", BFLogLevelDefault, "", msg)
    }

}