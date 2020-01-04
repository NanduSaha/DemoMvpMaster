package master.app.demomvp.feature.splash;

import android.os.Handler;

import javax.inject.Inject;

import master.app.demomvp.data.DataManager;
import master.app.demomvp.share.base.BasePresenter;
import master.app.demomvp.share.base.MvpView;

public class SplashPresenter<V extends SplashMvpView & MvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {
    @Inject
    public SplashPresenter(DataManager mdataManager) {
        super(mdataManager);
    }

    @Override
    public void decideNavigation() {
     Navigate();
    }

    private void Navigate()
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getMvpView().navigateToHOme();
            }
        }, 2000);
    }
}
