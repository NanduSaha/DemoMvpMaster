package master.app.demomvp.feature.splash;

import master.app.demomvp.di.PerActivity;
import master.app.demomvp.share.base.MvpPresenter;
import master.app.demomvp.share.base.MvpView;


@PerActivity
public interface SplashMvpPresenter<V extends SplashMvpView & MvpView> extends MvpPresenter<V> {

    void decideNavigation();
}
