package master.app.demomvp.di.components;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import master.app.demomvp.data.DataManager;
import master.app.demomvp.di.ApplicationContext;
import master.app.demomvp.di.modules.ApplicationModule;
import master.app.demomvp.di.modules.NetworkModule;
import master.app.demomvp.demomvp;

@Singleton
@Component(modules={ApplicationModule.class, NetworkModule.class})
public interface ApplicationComponent {


    void inject(demomvp app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();

}
