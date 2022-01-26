package com.codetrix.applovin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;

public class BannerActivity extends AppCompatActivity {
    private MaxAdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);

        getSupportActionBar().setTitle("Banner");

        //Calling Banner AD
        LoadBannerAd();
    }

    private void LoadBannerAd() {
        adView = new MaxAdView(getResources().getString(R.string.banner), this);
        adView.setListener(new MaxAdViewAdListener() {
            @Override
            public void onAdExpanded(MaxAd ad) {

            }

            @Override
            public void onAdCollapsed(MaxAd ad) {

            }

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

            }

            @Override
            public void onAdDisplayFailed(MaxAd ad, MaxError error) {

            }
        });

        int width = ViewGroup.LayoutParams.MATCH_PARENT;
        int height = getResources().getDimensionPixelSize(R.dimen.banner_height);
        adView.setLayoutParams(new FrameLayout.LayoutParams(width, height, Gravity.BOTTOM));
        adView.setBackgroundColor(Color.WHITE);

        LinearLayout layout = findViewById(R.id.adLayout);
        layout.addView(adView);
        adView.loadAd();

    }
}