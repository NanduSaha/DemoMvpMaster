package master.app.demomvp.share.base;

public interface MvpPresenter<V extends MvpView> {

    void onAttached(V mvpView);
    void onDettached();
}
