package master.app.demomvp.di.modules;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import dagger.Module;
import dagger.Provides;
import master.app.demomvp.di.ActivityContext;
import master.app.demomvp.di.PerActivity;
import master.app.demomvp.feature.splash.SplashMvpPresenter;
import master.app.demomvp.feature.splash.SplashMvpView;
import master.app.demomvp.feature.splash.SplashPresenter;

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }


    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }


    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }
}
