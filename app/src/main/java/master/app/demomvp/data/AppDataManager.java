package master.app.demomvp.data;

import android.content.Context;

import javax.inject.Inject;

import master.app.demomvp.data.network.ApiHelper;
import master.app.demomvp.data.pref.PreferencesHelper;
import master.app.demomvp.di.ApplicationContext;

public class AppDataManager implements DataManager {

    ApiHelper mApiHelper;
    PreferencesHelper mPreferencesHelper;
    Context mContext;

    @Inject
    public AppDataManager(ApiHelper mApiHelper, PreferencesHelper mPreferencesHelper,@ApplicationContext Context mContext) {
        this.mApiHelper = mApiHelper;
        this.mPreferencesHelper = mPreferencesHelper;
        this.mContext = mContext;
    }

    @Override
    public void logout() {

    }

    @Override
    public String getUserId() {
        return null;
    }

    @Override
    public void setUserId(String userId) {

    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail(String Email) {

    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public void setFirstName(String FirstName) {

    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public void setLastName(String LastName) {

    }

    @Override
    public String getFullName() {
        return null;
    }

    @Override
    public void setFullName(String FullName) {

    }

    @Override
    public String getPhoneNumber() {
        return null;
    }

    @Override
    public void setPhoneNumber(String PhoneNumber) {

    }

    @Override
    public String getAgentId() {
        return null;
    }

    @Override
    public void setAgentId(String AgentId) {

    }

    @Override
    public String getPassWord() {
        return null;
    }

    @Override
    public void setPassword(String Password) {

    }

    @Override
    public String getCartCount() {
        return null;
    }

    @Override
    public void setCartCount(String cartcount) {

    }

    @Override
    public String getSearch() {
        return null;
    }

    @Override
    public void setSearch(String search) {

    }

    @Override
    public String getEnqury() {
        return null;
    }

    @Override
    public void setEnqury(String enqey) {

    }

    @Override
    public String getWhatsapp() {
        return null;
    }

    @Override
    public void setWhatsapp(String whatsapp) {

    }

    @Override
    public String getGstNumber() {
        return null;
    }

    @Override
    public void setGstNumber(String gstnumber) {

    }
}
