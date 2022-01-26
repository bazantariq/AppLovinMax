package com.codetrix.applovin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxInterstitialAd;

import java.util.concurrent.TimeUnit;

public class InterstitialActivity extends AppCompatActivity {
    private MaxInterstitialAd interstitialAd;
    private int retry = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial);

        getSupportActionBar().setTitle("Interstitial");

        //Load Interstitial Ad
        LoadInterstitalAd();

        findViewById(R.id.show_int).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd.isReady()) {
                    interstitialAd.showAd();
                }
            }
        });
    }
    private void LoadInterstitalAd() {
        interstitialAd = new MaxInterstitialAd(getResources().getString(R.string.interstitial), this);
        MaxAdListener adListener = new MaxAdListener() {
            @Override
            public void onAdLoaded(MaxAd ad) {

            }

            @Override
            public void onAdDisplayed(MaxAd ad) {

            }

            @Override
            public void onAdHidden(MaxAd ad) {

            }

            @Override
            public void onAdClicked(MaxAd ad) {

            }

            @Override
            public void onAdLoadFailed(String adUnitId, MaxError error) {
                retry++;
                long delay = TimeUnit.SECONDS.toMillis((long) Math.pow(2, Math.min(6, retry)));
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        interstitialAd.loadAd();
                    }
                }, delay);

            }

            @Override
            public void onAdDisplayFailed(MaxAd ad, MaxError error) {

            }
        };
        interstitialAd.setListener(adListener);
        interstitialAd.loadAd();
    }
}