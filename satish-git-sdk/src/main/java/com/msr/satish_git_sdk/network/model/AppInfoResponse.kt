package com.msr.satish_git_sdk.network.model

data class AppInfoResponse(
    var status: Boolean?,

    var appInfo: AppInfo?,

    var statusCode: Int?,

    var error: Error?
) {
    constructor(status: Boolean, appInfo: AppInfo, networkError: Error) :
            this(
                status,
                appInfo,
                0,
                networkError
            )

    constructor(status: Boolean) :
            this(
                status,
                null, 400,
                null
            )

    constructor() :
            this(
                null,
                null,
                null,
                null
            )

}