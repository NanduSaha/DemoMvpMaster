package master.app.demomvp;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import master.app.demomvp.data.DataManager;
import master.app.demomvp.di.components.ApplicationComponent;
import master.app.demomvp.di.components.DaggerApplicationComponent;
import master.app.demomvp.di.modules.ApplicationModule;
import master.app.demomvp.di.modules.NetworkModule;
import master.app.demomvp.utils.AppData;

public class demomvp extends Application {

    ApplicationComponent applicationComponent;

    @Inject
    DataManager mDataManager;


    @Override
    public void onCreate() {
        super.onCreate();
       // Fabric.with(this, new Crashlytics());




        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .networkModule(new NetworkModule(AppData.BASE_URL)).build();

        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        /*MultiDex.install(this);*/
    }
}
