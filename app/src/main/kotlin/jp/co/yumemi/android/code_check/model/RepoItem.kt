package jp.co.yumemi.android.code_check.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

/**
 * Represents a GitHub repository item.
 *
 * This data class is used to deserialize the information of a single GitHub repository from the API response.
 *
 * @property name The name of the repository.
 * @property owner The owner of the repository.
 * @property language The programming language used in the repository (nullable).
 * @property stargazersCount The number of users who have starred the repository.
 * @property watchersCount The number of users watching the repository.
 * @property forksCount The number of forks (copies) of the repository.
 * @property openIssuesCount The number of open issues in the repository.
 *
 * @constructor Creates an instance of the RepoItem data class.
 *
 */
@Parcelize
data class RepoItem(
    @SerializedName("name") val name: String,
    @SerializedName("owner") val owner: Owner,
    @SerializedName("language") val language: String?,
    @SerializedName("stargazers_count") val stargazersCount: Long,
    @SerializedName("watchers_count") val watchersCount: Long,
    @SerializedName("forks_count") val forksCount: Long,
    @SerializedName("open_issues_count") val openIssuesCount: Long,
) : Parcelable