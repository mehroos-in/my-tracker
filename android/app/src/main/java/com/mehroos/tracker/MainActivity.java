package com.mehroos.tracker;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;

public class MainActivity extends Activity {
  private WebView webView;
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    webView = new WebView(this);
    WebSettings settings = webView.getSettings();
    settings.setJavaScriptEnabled(true);
    settings.setDomStorageEnabled(true);
    settings.setDatabaseEnabled(true);
    webView.setWebViewClient(new WebViewClient());
    webView.loadUrl("https://mehroos-in.github.io/my-tracker/");
    setContentView(webView);
  }
  @Override public void onBackPressed() {
    if (webView != null && webView.canGoBack()) webView.goBack(); else super.onBackPressed();
  }
}
