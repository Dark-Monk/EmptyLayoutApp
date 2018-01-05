package com.mobikul.emptylayout;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Created by vedesh.kumar on 24/1/17. @Webkul Software Pvt. Ltd
 */

class HelperFuntions {

    static int getScreenWidth() {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        return metrics.widthPixels;
    }
}