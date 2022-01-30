package com.codetrix.applovin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;

import java.io.FileReader;

public class ActivityMREC extends AppCompatActivity {

    private MaxAdView MRECAdview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mrec);
        getSupportActionBar().setTitle("MRECs");

        createMREC();

    }
    public void createMREC(){
        MRECAdview= new MaxAdView(getResources().getString(R.string.mrec),MaxAdFormat.MREC,this);
        MRECAdview.setListener(new MaxAdViewAdListener() {
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
        int width= AppLovinSdkUtils.dpToPx(this,300);
        int height= AppLovinSdkUtils.dpToPx(this,250);
        MRECAdview.setLayoutParams(new FrameLayout.LayoutParams(width,height,Gravity.CENTER));
        MRECAdview.setBackgroundColor(Color.WHITE);

        FrameLayout layout= findViewById(R.id.mrec);
        layout.addView(MRECAdview);
        MRECAdview.loadAd();
        MRECAdview.startAutoRefresh();
    }
}