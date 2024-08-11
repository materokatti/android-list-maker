package com.kodeco.android.navigation

sealed class Screens(val route: String) {
    data object TaskListScreen : Screens("taskList")
    data object TaskDetailScreen : Screens("taskDetail")
}
