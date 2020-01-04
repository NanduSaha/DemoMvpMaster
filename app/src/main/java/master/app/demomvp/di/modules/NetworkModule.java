package master.app.demomvp.di.modules;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import master.app.demomvp.data.network.ApiHelper;
import master.app.demomvp.di.WithAuth;
import master.app.demomvp.di.WithOutAuth;
import master.app.demomvp.share.BasicAuthInterceptor;
import master.app.demomvp.utils.AppData;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {


    private String baseUrl;

    public NetworkModule(String baseUrl) {
        this.baseUrl = baseUrl;
    }



    @Singleton
    @Provides
    Retrofit provideRetrofit(@WithAuth OkHttpClient httpClient){
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build();
    }



    @Singleton
    @Provides
    @WithAuth
    OkHttpClient provideHttpClient(HttpLoggingInterceptor logging, BasicAuthInterceptor interceptor){

        Log.d("Nandita","Calling");
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);
        httpClient.addInterceptor(interceptor);
        httpClient.connectTimeout(10000, TimeUnit.SECONDS);
        httpClient.readTimeout(10000, TimeUnit.SECONDS);
        return httpClient.build();

    }

    @Singleton
    @Provides
    @WithOutAuth
    OkHttpClient provideHttpClientWithoutAuth(HttpLoggingInterceptor logging){

        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        Log.d("Nandita",logging.toString());
        httpClient.addInterceptor(logging);
        httpClient.connectTimeout(10000, TimeUnit.SECONDS);
        httpClient.readTimeout(10000, TimeUnit.SECONDS);
        return httpClient.build();

    }


    @Singleton
    @Provides
    HttpLoggingInterceptor provideLogInterceptor(){

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override public void log(String message) {
                Log.d("OkHttp",message);
            }
        });
        return logging;
    }

    @Singleton
    @Provides
    BasicAuthInterceptor provideAuthInterceptor(){
        return new BasicAuthInterceptor(AppData.USERNAME, AppData.APP_SECRET);
    }

    @Singleton
    @Provides
    ApiHelper provideApiHelper(Retrofit retrofit){
        return retrofit.create(ApiHelper.class);
    }

}
