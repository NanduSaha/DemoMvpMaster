package master.app.demomvp.data;

import master.app.demomvp.data.network.ApiHelper;
import master.app.demomvp.data.pref.PreferencesHelper;

public interface DataManager extends ApiHelper, PreferencesHelper {

    void logout();
}
