package org.ligi.compat;

import android.annotation.TargetApi;
import android.print.PrintDocumentAdapter;
import android.webkit.WebView;

public class WebViewCompat {

    @TargetApi(19)
    public static PrintDocumentAdapter createPrintDocumentAdapter(WebView webView, String documentName) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return webView.createPrintDocumentAdapter(documentName);
        } else {
            //noinspection deprecation
            return webView.createPrintDocumentAdapter();
        }
    }

}