package org.ligi.compat;

import android.content.res.Configuration;
import java.util.Locale;

public class LocaleCompat {

    public static Locale fromHtml(Configuration configuration) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            return configuration.getLocales().get(0);
        } else {
            //noinspection deprecation
            return configuration.locale;
        }
    }

}