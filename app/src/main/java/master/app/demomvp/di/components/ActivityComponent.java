package master.app.demomvp.di.components;


import dagger.Component;
import master.app.demomvp.di.PerActivity;
import master.app.demomvp.di.modules.ActivityModule;
import master.app.demomvp.feature.splash.SplashActivity;

@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(SplashActivity activity);
}
