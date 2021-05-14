package com.msr.satish_git_sdk.network.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Owner",
        foreignKeys = [
            ForeignKey(entity = Item::class, parentColumns = ["id"], childColumns = ["ownerId"])
        ],
        indices = [Index("content_id")])
class Owner {
    @SerializedName("login")
    @Expose
    var login: String? = null

    @ColumnInfo(name = "ownerId")
    @SerializedName("id")
    @Expose
    var ownerId: Int? = null

    @SerializedName("node_id")
    @Expose
    var nodeId: String? = null

    @SerializedName("avatar_url")
    @Expose
    var avatarUrl: String? = null

    @SerializedName("gravatar_id")
    @Expose
    var gravatarId: String? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("received_events_url")
    @Expose
    var receivedEventsUrl: String? = null

    @SerializedName("type")
    @Expose
    var type: String? = null

    @SerializedName("html_url")
    @Expose
    var htmlUrl: String? = null

    @SerializedName("followers_url")
    @Expose
    var followersUrl: String? = null

    @SerializedName("following_url")
    @Expose
    var followingUrl: String? = null

    @SerializedName("gists_url")
    @Expose
    var gistsUrl: String? = null

    @SerializedName("starred_url")
    @Expose
    var starredUrl: String? = null

    @SerializedName("subscriptions_url")
    @Expose
    var subscriptionsUrl: String? = null

    @SerializedName("organizations_url")
    @Expose
    var organizationsUrl: String? = null

    @SerializedName("repos_url")
    @Expose
    var reposUrl: String? = null

    @SerializedName("events_url")
    @Expose
    var eventsUrl: String? = null

    @SerializedName("site_admin")
    @Expose
    var siteAdmin: Boolean? = null
}