package org.ligi.compat;

import android.text.Html;
import android.text.Spanned;

public class HtmlCompat {

    public static Spanned fromHtml(String source) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            return Html.fromHtml(source, Html.FROM_HTML_MODE_LEGACY);
        } else {
            //noinspection deprecation
            return Html.fromHtml(source);
        }
    }

    public static Spanned fromHtml(String source, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            return Html.fromHtml(source, Html.FROM_HTML_MODE_LEGACY, imageGetter, tagHandler);
        } else {
            //noinspection deprecation
            return Html.fromHtml(source, imageGetter, tagHandler);
        }
    }

}