package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class InfoHome extends AppCompatActivity {

    WebView WebInfoHome;
    private String urlFinished = "";
    private String url1 = "https://100realty.ua/uk/realty_search/apartment/rent";

    private boolean isRedirected;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_home);

        WebInfoHome = (WebView) findViewById(R.id.WebInfoHome);

        WebSettings webSettings = WebInfoHome.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);

        Intent intent1 = getIntent();

        String city = intent1.getStringExtra("city");
        String district = intent1.getStringExtra("district");
        String rooms = intent1.getStringExtra("rooms");

        WebInfoHome.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView webView, String url) {

                return false;

            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);


                if (!urlFinished.equals(url1)) {
                    if (city.equals("Київ")) {
                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('edit-kievcheck-2').click();})()");
                    }
                    WebInfoHome.loadUrl("javascript:(function(){document.getElementById('realty-show-map-link').click();})()");

                    if(district.equals("Печерський район")) {
                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('1002249').click();})()");
                    }

                    if (district.equals("Голосіївський район")){

                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('1002248').click();})()");

                    }

                    if (district.equals("Дарницький район")){

                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('1002242').click();})()");

                    }

                    if (district.equals("Деснянський район")){

                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('1002241').click();})()");

                    }

                    if (district.equals("Дніпровський район")){

                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('1002243').click();})()");

                    }

                    if (district.equals("Оболонський район")){

                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('1002247').click();})()");

                    }

                    if (district.equals("Подільський район")){

                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('1002250').click();})()");

                    }

                    if (district.equals("Святошинський район")){

                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('1003198').click();})()");

                    }

                    if (district.equals("Солом'янський район")){

                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('1002246').click();})()");

                    }

                    if (district.equals("Шевченківський район")){

                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('1002253').click();})()");

                    }

                    WebInfoHome.loadUrl("javascript:(function(){document.getElementById('realty-confirm-map').click();})()");

                    if(rooms.equals("1")) {
                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('edit-nrooms-1').click();})()");
                    }

                    if(rooms.equals("2")) {
                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('edit-nrooms-2').click();})()");
                    }

                    if(rooms.equals("3")) {
                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('edit-nrooms-3').click();})()");
                    }

                    if(rooms.equals("4")) {
                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('edit-nrooms-4').click();})()");
                    }

                    if(rooms.equals("5")) {
                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('edit-nrooms-5-').click();})()");
                    }

                    if(rooms.equals("6")) {
                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('edit-nrooms-5-').click();})()");
                    }

                    if(!rooms.equals("7")) {
                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('edit-nrooms-5-').click();})()");
                    }

                    if(rooms.equals("8")) {
                        WebInfoHome.loadUrl("javascript:(function(){document.getElementById('edit-nrooms-5-').click();})()");
                    }



                    WebInfoHome.loadUrl("javascript:(setTimeout(function(){document.getElementById('edit-find').click();},500))()");
                }

                urlFinished = url1;


            }
        });




        WebInfoHome.loadUrl(url1);

    }


}