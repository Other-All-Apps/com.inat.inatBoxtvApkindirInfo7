package com.inatboxtvapkindirinfo.inat;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;


public class inatboxtvapkindir7_Video_view_4 extends AppCompatActivity {

    public String TAG = String.valueOf(getClass());
    InterstitialAd interstitialAd;

    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inatboxtvapkindir7_activity_video_view_4);


        ShowFullAds();
    }

    public void ShowFullAds() {
        Log.e(TAG, "fbfull1 " + getString(R.string.fbfull));
        try {
            if (inatboxtvapkindir7_splesh.interstitialAd1 != null && inatboxtvapkindir7_splesh.interstitialAd1.isAdLoaded())
                inatboxtvapkindir7_splesh.interstitialAd1.show();
            else {
                if (!inatboxtvapkindir7_splesh.interstitialAd1.isAdLoaded())
                    inatboxtvapkindir7_splesh.interstitialAd1.loadAd();

                interstitialAd = new InterstitialAd(this, getString(R.string.fbfull));
                InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {


                    @Override
                    public void onInterstitialDisplayed(Ad ad) {

                    }

                    @Override
                    public void onInterstitialDismissed(Ad ad) {
                        // Interstitial dismissed callback
                        Log.e(TAG, "fbfull1 " + "Interstitial ad dismissed.");
                    }

                    @Override
                    public void onError(Ad ad, AdError adError) {
                        // Ad error callback
                        Log.e(TAG, "fbfull1 " + adError.getErrorMessage());
                        ShowFullAds1();
                    }

                    @Override
                    public void onAdLoaded(Ad ad) {
                        Log.d(TAG, "fbfull1 " + "Interstitial ad is loaded and ready to be diSplash_screenlayed!");
                        if (interstitialAd != null && interstitialAd.isAdLoaded())
                            interstitialAd.show();
                    }

                    @Override
                    public void onAdClicked(Ad ad) {
                        // Ad clicked callback
                        Log.d(TAG, "fbfull1 " + "Interstitial ad clicked!");
                    }

                    @Override
                    public void onLoggingImpression(Ad ad) {
                        // Ad impression logged callback
                        Log.d(TAG, "fbfull1 " + "Interstitial ad impression logged!");
                    }
                };

                interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(interstitialAdListener).build());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ShowFullAds1() {
        Log.e(TAG, "fbfull2 " + getString(R.string.fbfull1));
        try {
            if (inatboxtvapkindir7_splesh.interstitialAd2 != null && inatboxtvapkindir7_splesh.interstitialAd2.isAdLoaded())
                inatboxtvapkindir7_splesh.interstitialAd2.show();
            else {
                if (!inatboxtvapkindir7_splesh.interstitialAd2.isAdLoaded())
                    inatboxtvapkindir7_splesh.interstitialAd2.loadAd();

                interstitialAd = new InterstitialAd(this, getString(R.string.fbfull1));
                InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {


                    @Override
                    public void onInterstitialDisplayed(Ad ad) {

                    }

                    @Override
                    public void onInterstitialDismissed(Ad ad) {
                        // Interstitial dismissed callback
                        Log.e(TAG, "fbfull2 " + "Interstitial ad dismissed.");
                    }

                    @Override
                    public void onError(Ad ad, AdError adError) {
                        // Ad error callback
                        Log.e(TAG, "fbfull2 " + adError.getErrorMessage());

                    }

                    @Override
                    public void onAdLoaded(Ad ad) {
                        Log.d(TAG, "fbfull2 " + "Interstitial ad is loaded and ready to be diSplash_screenlayed!");
                        if (interstitialAd != null && interstitialAd.isAdLoaded())
                            interstitialAd.show();
                    }

                    @Override
                    public void onAdClicked(Ad ad) {
                        // Ad clicked callback
                        Log.d(TAG, "fbfull2 " + "Interstitial ad clicked!");
                    }

                    @Override
                    public void onLoggingImpression(Ad ad) {
                        // Ad impression logged callback
                        Log.d(TAG, "fbfull2 " + "Interstitial ad impression logged!");
                    }
                };

                interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(interstitialAdListener).build());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}