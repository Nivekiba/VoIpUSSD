/*
 * Copyright (c) 2020. BoostTag E.I.R.L. Romell D.Z.
 * All rights reserved
 * porfile.romellfudi.com
 */

package com.romellfudi.ussd.di.component

import android.content.Context
import com.romellfudi.ussd.di.AppScope
import com.romellfudi.ussd.di.module.USSDModule
import com.romellfudi.ussd.sample.MainActivity
import dagger.BindsInstance
import dagger.Component

@AppScope
@Component(modules = [USSDModule::class, AppSubcomponents::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun uiComponent(): UIComponent.Factory
}