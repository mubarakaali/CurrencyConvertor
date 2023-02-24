# Welcome to ComposeNavigationModule
 The ComposeNavigationModule is following MVVM , Repository pattern and Clean Architecture with SOLID design principle.To make the app flow 
 clean and easy,I have used multi modular approach with the features that I am implementing in the app.To make the centralized dependencies
implementation I have used version-catalog with kotlin gradle, 'libs.version.toml' file have all dependencies.The most important thing about this app 
is that it is using Jetpack compose UI declarative framework. 
<br/>

## Index

- [Key Features](#key-features)
- [ScreenShots](#screenShots)
- [Libraries](#libraries)

<br/>

## Key Features
1. **Separation of Concerns:** The app is built using Uncle Bob's clean architecture (see architecture below)
2. **Reusable feature modules:** Modern feature module design pattern is used so that in future the same module is used other apps also.
3. **Scalable navigation architecture:** Feature modules are independent of app-level implementation detail. Navigation architecture can be changed at any time without effecting the features


<br/>

## Modules
The app has mainly following modules

### Framework
It will contain the general methods and classes that will need in all our feature modules and app module like theming,components,utility functions.

### Feature Modules
- **Sign** - contains the login and registration of rider and user.
- **Home** - contains the login and registration of rider and user.
Feature modules are unaware of each other. Hence, they can be used independently in any app

### Navigation 

The feature modules are unaware of the app-level navigation. App controls the navigation between each module. Currently, it uses Jetpack Navigation. But this can be changed at any time without affecting any feature module.

This is implemented as per [Google's recommendation](https://developer.android.com/guide/navigation/navigation-multi-module) for multi-module navigation. This allows us to have an independent navigation architecture in each feature module.


<br/>

## Screenshots

<img src="images/splash.jpg" width=200> <img src="images/login.jpg" width=200> 
<img src="images/usertype.jpg" width=200> <img src="images/signup.jpg" width=200>


<br/>

## Libraries

- **UI Design** - Compose UI
- **AndroidX** - ViewModel
- **KotlinX** - Coroutines
- **Hilt** -  Dependency Injection
- **Compose Navigation** - User navigation


<br/>
























