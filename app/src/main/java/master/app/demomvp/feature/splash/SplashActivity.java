package master.app.demomvp.feature.splash;

import android.os.Bundle;

import javax.inject.Inject;

import butterknife.ButterKnife;
import master.app.demomvp.R;
import master.app.demomvp.share.base.BaseActivity;

public class SplashActivity extends BaseActivity implements SplashMvpView{

    @Inject
    SplashPresenter <SplashMvpView> presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUnBinder(ButterKnife.bind(this));
        getActivityComponent().inject(this);
        setUp();
        initUi();

    }

    private void initUi()
    {
        presenter.decideNavigation();
    }

    protected void setUp()
    {
        presenter.onAttached(this);

    }
    @Override
    public void navigateToHOme() {

       // gotoNext(HomeActivity.class,null);
    }


    @Override
    protected void onDestroy() {
        presenter.onDettached();
        super.onDestroy();
    }
}
