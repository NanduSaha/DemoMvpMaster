package master.app.demomvp.di.modules;


import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import master.app.demomvp.data.AppDataManager;
import master.app.demomvp.data.DataManager;
import master.app.demomvp.data.pref.AppPreferencesHelper;
import master.app.demomvp.data.pref.PreferencesHelper;
import master.app.demomvp.di.ApplicationContext;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext()
    {
        return mApplication;
    }

    @Provides
    Application provideApplication()
    {
        return mApplication;
    }


    @Singleton
    @Provides
    PreferencesHelper providePrefHelper(AppPreferencesHelper mAppPreferencesHelper){
        return mAppPreferencesHelper;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager)
    {return  appDataManager;}
}
