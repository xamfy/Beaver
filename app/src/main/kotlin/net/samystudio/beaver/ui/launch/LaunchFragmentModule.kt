package net.samystudio.beaver.ui.launch

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.ViewModel
import android.support.v4.app.Fragment
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import net.samystudio.beaver.di.key.ViewModelKey
import net.samystudio.beaver.di.qualifier.FragmentLifecycle
import net.samystudio.beaver.di.scope.FragmentScope
import net.samystudio.beaver.ui.base.fragment.BaseFragmentModule

@Module(includes = [BaseFragmentModule::class])
abstract class LaunchFragmentModule
{
    @Binds
    @FragmentScope
    abstract fun bindFragment(fragment: LaunchFragment): Fragment

    @Binds
    @FragmentScope
    @FragmentLifecycle
    abstract fun bindLifeCycleOwner(fragment: LaunchFragment): LifecycleOwner

    @Binds
    @IntoMap
    @ViewModelKey(LaunchFragmentViewModel::class)
    @FragmentScope
    abstract fun bindLaunchViewModel(fragment: LaunchFragmentViewModel): ViewModel
}