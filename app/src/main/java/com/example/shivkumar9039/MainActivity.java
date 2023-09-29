package com.example.shivkumar9039;


import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize AppsFlyer SDK
        AppsFlyerLib.getInstance().init("fb8Q2zo9PAxeMYGSwXo6Bo", new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> conversionData) {
                // Handle conversion data
            }

            @Override
            public void onConversionDataFail(String errorMessage) {
                // Handle conversion data failure
            }

            @Override
            public void onAppOpenAttribution(Map<String, String> attributionData) {
                // Handle attribution data
            }

            @Override
            public void onAttributionFailure(String errorMessage) {
                // Handle attribution failure
            }
        }, this);

        // Enable AppsFlyer debug logs (remove for production)
        AppsFlyerLib.getInstance().setDebugLog(true);

    }
}



