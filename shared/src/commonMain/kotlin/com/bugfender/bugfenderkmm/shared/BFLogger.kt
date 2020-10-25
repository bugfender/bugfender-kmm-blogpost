package com.bugfender.bugfenderkmm.shared

expect object BFLogger {

    fun activateLogger(bugfenderKey: String, context: Any? = null)

    fun log(msg: String)

}