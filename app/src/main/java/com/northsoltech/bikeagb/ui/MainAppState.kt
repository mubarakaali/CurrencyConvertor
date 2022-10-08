///*
// * Copyright 2022 The Android Open Source Project
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *     https://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
//package com.northsoltech.bikeagb.ui
//
//import androidx.compose.material3.windowsizeclass.WindowSizeClass
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.Stable
//import androidx.compose.runtime.remember
//import androidx.core.os.trace
//import androidx.navigation.NavDestination
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.currentBackStackEntryAsState
//import androidx.navigation.compose.rememberNavController
//import com.northsoltech.framework.navigation.AppNavigationDestination
//
//@Composable
//fun rememberNiaAppState(
//    windowSizeClass: WindowSizeClass,
//    navController: NavHostController = rememberNavController()
//): MainAppState {
////    NavigationTrackingSideEffect(navController)
//    return remember(navController, windowSizeClass) {
//        MainAppState(navController, windowSizeClass)
//    }
//}
//
//@Stable
//class MainAppState(
//    val navController: NavHostController,
//    val windowSizeClass: WindowSizeClass
//) {
//    val currentDestination: NavDestination?
//        @Composable get() = navController
//            .currentBackStackEntryAsState().value?.destination
//
////    val shouldShowBottomBar: Boolean
////        get() = windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact ||
////            windowSizeClass.heightSizeClass == WindowHeightSizeClass.Compact
//
////    val shouldShowNavRail: Boolean
////        get() = !shouldShowBottomBar
//
//    /**
//     * Top level destinations to be used in the BottomBar and NavRail
//     */
////    val topLevelDestinations: List<TopLevelDestination> = listOf(
////        TopLevelDestination(
////            route = ForYouDestination.route,
////            destination = ForYouDestination.destination,
////            selectedIcon = DrawableResourceIcon(NiaIcons.Upcoming),
////            unselectedIcon = DrawableResourceIcon(NiaIcons.UpcomingBorder),
////            iconTextId = forYouR.string.for_you
////        ),
////        TopLevelDestination(
////            route = BookmarksDestination.route,
////            destination = BookmarksDestination.destination,
////            selectedIcon = DrawableResourceIcon(NiaIcons.Bookmarks),
////            unselectedIcon = DrawableResourceIcon(NiaIcons.BookmarksBorder),
////            iconTextId = bookmarksR.string.saved
////        ),
////        TopLevelDestination(
////            route = InterestsDestination.route,
////            destination = InterestsDestination.destination,
////            selectedIcon = ImageVectorIcon(NiaIcons.Grid3x3),
////            unselectedIcon = ImageVectorIcon(NiaIcons.Grid3x3),
////            iconTextId = interestsR.string.interests
////        )
////    )
//
//    /**
//     * UI logic for navigating to a particular destination in the app. The NavigationOptions to
//     * navigate with are based on the type of destination, which could be a top level destination or
//     * just a regular destination.
//     *
//     * Top level destinations have only one copy of the destination of the back stack, and save and
//     * restore state whenever you navigate to and from it.
//     * Regular destinations can have multiple copies in the back stack and state isn't saved nor
//     * restored.
//     *
//     * @param destination: The [NiaNavigationDestination] the app needs to navigate to.
//     * @param route: Optional route to navigate to in case the destination contains arguments.
//     */
//    fun navigate(destination: AppNavigationDestination, route: String? = null) {
////        trace("Navigation: $destination") {
////            if (destination is TopLevelDestination) {
////                navController.navigate(route ?: destination.route) {
////                    // Pop up to the start destination of the graph to
////                    // avoid building up a large stack of destinations
////                    // on the back stack as users select items
////                    popUpTo(navController.graph.findStartDestination().id) {
////                        saveState = true
////                    }
////                    // Avoid multiple copies of the same destination when
////                    // reselecting the same item
////                    launchSingleTop = true
////                    // Restore state when reselecting a previously selected item
////                    restoreState = true
////                }
////            } else {
//                navController.navigate(route ?: destination.route)
////            }
////        }
//    }
//
//    fun onBackClick() {
//        navController.popBackStack()
//    }
//}
//
///**
// * Stores information about navigation events to be used with JankStats
// */
////@Composable
////private fun NavigationTrackingSideEffect(navController: NavHostController) {
////    JankMetricDisposableEffect(navController) { metricsHolder ->
////        val listener = NavController.OnDestinationChangedListener { _, destination, _ ->
////            metricsHolder.state?.putState("Navigation", destination.route.toString())
////        }
////
////        navController.addOnDestinationChangedListener(listener)
////
////        onDispose {
////            navController.removeOnDestinationChangedListener(listener)
////        }
////    }
////}
