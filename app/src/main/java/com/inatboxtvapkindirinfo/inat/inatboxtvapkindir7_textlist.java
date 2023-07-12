package com.inatboxtvapkindirinfo.inat;

import androidx.appcompat.app.AppCompatActivity;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;






import com.google.android.material.button.MaterialButton;


public class inatboxtvapkindir7_textlist extends AppCompatActivity  {
    MaterialButton t1, t2, t3, t4, t5, t6;
   
    
    private com.facebook.ads.AdView bannerAdContainer;
    LinearLayout adView1;
    FrameLayout nativeAdContainer;

    NativeAd nativeAd1;
    InterstitialAd interstitialAd;

    public String TAG = String.valueOf(getClass());

    
    
    
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inatboxtvapkindir7_activity_textlist);


        
        inatboxtvapkindir7_splesh.url_passing(inatboxtvapkindir7_textlist.this);
        inatboxtvapkindir7_splesh.url_passing1(inatboxtvapkindir7_textlist.this);

        loadfbNativeAd();
        showfbbanner();
        ShowFullAds();

        findViewById(R.id.fl_adplaceholder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inatboxtvapkindir7_splesh.url_passing(inatboxtvapkindir7_textlist.this);
        inatboxtvapkindir7_splesh.url_passing1(inatboxtvapkindir7_textlist.this);

            }
        });

        findViewById(R.id.fl_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inatboxtvapkindir7_splesh.url_passing(inatboxtvapkindir7_textlist.this);
        inatboxtvapkindir7_splesh.url_passing1(inatboxtvapkindir7_textlist.this);

            }
        });

        findViewById(R.id.Ad1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inatboxtvapkindir7_splesh.url_passing(inatboxtvapkindir7_textlist.this);
                inatboxtvapkindir7_splesh.url_passing1(inatboxtvapkindir7_textlist.this);

            }
        });

        findViewById(R.id.Ad3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inatboxtvapkindir7_splesh.url_passing(inatboxtvapkindir7_textlist.this);
                inatboxtvapkindir7_splesh.url_passing1(inatboxtvapkindir7_textlist.this);

            }
        });

        findViewById(R.id.Ad5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inatboxtvapkindir7_splesh.url_passing(inatboxtvapkindir7_textlist.this);
                inatboxtvapkindir7_splesh.url_passing1(inatboxtvapkindir7_textlist.this);

            }
        });
        findViewById(R.id.Ad6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inatboxtvapkindir7_splesh.url_passing(inatboxtvapkindir7_textlist.this);
                inatboxtvapkindir7_splesh.url_passing1(inatboxtvapkindir7_textlist.this);

            }
        });



        findViewById(R.id.nv1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inatboxtvapkindir7_splesh.url_passing(inatboxtvapkindir7_textlist.this);
                inatboxtvapkindir7_splesh.url_passing1(inatboxtvapkindir7_textlist.this);

            }
        });

        findViewById(R.id.nv2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inatboxtvapkindir7_splesh.url_passing(inatboxtvapkindir7_textlist.this);
                inatboxtvapkindir7_splesh.url_passing1(inatboxtvapkindir7_textlist.this);

            }
        });

        findViewById(R.id.nv3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inatboxtvapkindir7_splesh.url_passing(inatboxtvapkindir7_textlist.this);
                inatboxtvapkindir7_splesh.url_passing1(inatboxtvapkindir7_textlist.this);

            }
        });
        findViewById(R.id.nv4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inatboxtvapkindir7_splesh.url_passing(inatboxtvapkindir7_textlist.this);
                inatboxtvapkindir7_splesh.url_passing1(inatboxtvapkindir7_textlist.this);

            }
        });


        findViewById(R.id.nv5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inatboxtvapkindir7_splesh.url_passing(inatboxtvapkindir7_textlist.this);
                inatboxtvapkindir7_splesh.url_passing1(inatboxtvapkindir7_textlist.this);

            }
        });
        findViewById(R.id.nv6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inatboxtvapkindir7_splesh.url_passing(inatboxtvapkindir7_textlist.this);
                inatboxtvapkindir7_splesh.url_passing1(inatboxtvapkindir7_textlist.this);

            }
        });





        findViewById(R.id.img8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inatboxtvapkindir7_splesh.url_passing(inatboxtvapkindir7_textlist.this);
        inatboxtvapkindir7_splesh.url_passing1(inatboxtvapkindir7_textlist.this);

            }
        });


        t1 = findViewById(R.id.img2);
        t1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(inatboxtvapkindir7_textlist.this.getApplicationContext(), inatboxtvapkindir7_detail1.class);
                
                inatboxtvapkindir7_textlist.this.startActivity(intent);


            }
        });
        t2 = findViewById(R.id.img3);
        t2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(inatboxtvapkindir7_textlist.this.getApplicationContext(), inatboxtvapkindir7_detail2.class);
                
                inatboxtvapkindir7_textlist.this.startActivity(intent);

            }
        });
        t3 = findViewById(R.id.img5);
        t3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {



                Intent intent = new Intent(inatboxtvapkindir7_textlist.this.getApplicationContext(), inatboxtvapkindir7_detail3.class);
                

                inatboxtvapkindir7_textlist.this.startActivity(intent);

            }
        });
        t4 = findViewById(R.id.img6);
        t4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                Intent intent = new Intent(inatboxtvapkindir7_textlist.this.getApplicationContext(), inatboxtvapkindir7_detail4.class);
                
                inatboxtvapkindir7_textlist.this.startActivity(intent);

            }
        });
        t5 = findViewById(R.id.img8);
        t5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {



                Intent intent = new Intent(inatboxtvapkindir7_textlist.this.getApplicationContext(), inatboxtvapkindir7_detail5.class);
                
                inatboxtvapkindir7_textlist.this.startActivity(intent);

            }
        });

        t6 = findViewById(R.id.img9);
        t6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                Intent intent = new Intent(inatboxtvapkindir7_textlist.this.getApplicationContext(), inatboxtvapkindir7_detail6.class);
                
                inatboxtvapkindir7_textlist.this.startActivity(intent);

            }
        });

    }





    @Override
    public void onBackPressed() {
        super.onBackPressed();
        ShowFullAds();
        inatboxtvapkindir7_splesh.url_passing(inatboxtvapkindir7_textlist.this);
        inatboxtvapkindir7_splesh.url_passing1(inatboxtvapkindir7_textlist.this);

    }

    public void loadfbNativeAd() {

        Log.e(TAG, "fbnative1 " + getString(R.string.fbnative));
        nativeAdContainer = findViewById(R.id.fl_adplaceholder);
        LayoutInflater inflater = this.getLayoutInflater();
        adView1 = (LinearLayout) inflater.inflate(R.layout.inatboxtvapkindir7_native_ad_layout, nativeAdContainer, false);
        nativeAdContainer.addView(adView1);
        nativeAd1 = new NativeAd(getApplicationContext(), getString(R.string.fbnative));
        NativeAdListener nativeAdListener = new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
                Log.e("fbnative1==>", "onMediaDownloaded: ");

            }

            @Override
            public void onError(Ad ad, AdError adError) {
                //  nativeAdContainer.setVisibility(View.GONE);
                Log.e("fbnative1==>", adError.getErrorMessage());
                loadfbNativeAd1();
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e("fbnative1==>", "onAdLoaded: ");
                if (nativeAd1 == null || nativeAd1 != ad) {

                    return;
                }

                inatboxtvapkindir7_splesh.inflateAd(nativeAd1, adView1, getApplicationContext());
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e("fbnative1==>", "onAdClicked: ");


            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e("fbnative1==>", "onLoggingImpression: ");

            }
        };

        nativeAd1.loadAd(
                nativeAd1.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());


    }
    public void loadfbNativeAd1() {

        Log.e(TAG, "fbnative2 " + getString(R.string.fbnative1));
        nativeAdContainer = findViewById(R.id.fl_adplaceholder);
        LayoutInflater inflater = this.getLayoutInflater();
        adView1 = (LinearLayout) inflater.inflate(R.layout.inatboxtvapkindir7_native_ad_layout, nativeAdContainer, false);
        nativeAdContainer.addView(adView1);
        nativeAd1 = new NativeAd(getApplicationContext(), getString(R.string.fbnative1));
        NativeAdListener nativeAdListener = new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
                Log.e("fbnative2==>", "onMediaDownloaded: ");

            }

            @Override
            public void onError(Ad ad, AdError adError) {
                //  nativeAdContainer.setVisibility(View.GONE);
                Log.e("fbnative2==>", adError.getErrorMessage());

            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e("fbnative2==>", "onAdLoaded: ");
                if (nativeAd1 == null || nativeAd1 != ad) {

                    return;
                }

                inatboxtvapkindir7_splesh.inflateAd(nativeAd1, adView1, getApplicationContext());
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e("fbnative2==>", "onAdClicked: ");


            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e("fbnative2==>", "onLoggingImpression: ");

            }
        };

        nativeAd1.loadAd(
                nativeAd1.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());


    }

    private void showfbbanner() {
        Log.e(TAG, "fbban1 " + getString(R.string.fbbanner));
        FrameLayout adViewContainer = findViewById(R.id.fl_b);
        bannerAdContainer = new com.facebook.ads.AdView(this, getString(R.string.fbbanner), com.facebook.ads.AdSize.BANNER_HEIGHT_90);
        adViewContainer.addView(bannerAdContainer);
        NativeAdListener nativeAdListener = new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e("fbban1==>", adError.getErrorMessage());
                showfbbanner1();
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e("fbban1==>", "onAdLoaded: ");
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e("fbban1==>", "onAdClicked: ");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e("fbban1==>", "onLoggingImpression: ");
            }
        };

        bannerAdContainer.loadAd(
                bannerAdContainer.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());
    }

    private void showfbbanner1() {
        Log.e(TAG, "fbban2 " + getString(R.string.fbbanner1));
        FrameLayout adViewContainer = findViewById(R.id.fl_b);
        bannerAdContainer = new com.facebook.ads.AdView(this, getString(R.string.fbbanner1), com.facebook.ads.AdSize.BANNER_HEIGHT_90);
        adViewContainer.addView(bannerAdContainer);
        NativeAdListener nativeAdListener = new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                Log.e("fbban2==>", adError.getErrorMessage());

            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e("fbban2==>", "onAdLoaded: ");
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e("fbban2==>", "onAdClicked: ");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e("fbban2==>", "onLoggingImpression: ");
            }
        };

        bannerAdContainer.loadAd(
                bannerAdContainer.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());
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

                interstitialAd.loadAd(
                        interstitialAd.buildLoadAdConfig()
                                .withAdListener(interstitialAdListener)
                                .build());
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

                interstitialAd.loadAd(
                        interstitialAd.buildLoadAdConfig()
                                .withAdListener(interstitialAdListener)
                                .build());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






















