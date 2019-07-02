package com.example.android.androidskeletonapp.ui.splash;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.androidskeletonapp.R;
import com.example.android.androidskeletonapp.data.Sdk;

import org.hisp.dhis.android.core.D2;

import io.reactivex.Single;
import io.reactivex.disposables.Disposable;

import org.hisp.dhis.android.core.d2manager.D2Configuration;
import org.hisp.dhis.android.core.d2manager.D2Manager;

public class SplashActivity extends AppCompatActivity {

    private Disposable disposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        disposable =
                instantiateD2()
                .doOnSuccess(d2 -> {
                    // TODO Toast success
                    }
                ).doOnError(throwable -> {
                    // TODO Toast error
                })
                .subscribe();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (disposable != null) {
            disposable.dispose();
        }
    }

    private Single<D2> instantiateD2() {
        // TODO Instantiate d2

        Single<D2> d2Single = D2Manager.setUp(Sdk.getD2Configuration(this))
                .andThen(D2Manager.setServerUrl("http://android2.dhis2.org:8080"))
                .andThen(D2Manager.instantiateD2());

        //d2Single.subscribe(d2 -> …)


        return Single.never();
    }
}