package com.whatsapp;

import android.support.v4.view.ViewPager.PageTransformer;
import android.view.View;

class a6 implements PageTransformer {
    final PhotoViewPager a;

    public void transformPage(View view, float f) {
        if (f < 0.0f || f >= 1.0f) {
            view.setTranslationX(0.0f);
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            if (App.az == 0) {
                return;
            }
        }
        view.setTranslationX((-f) * ((float) view.getWidth()));
        view.setAlpha(Math.max(0.0f, 1.0f - f));
        float max = Math.max(0.0f, 1.0f - (0.3f * f));
        view.setScaleX(max);
        view.setScaleY(max);
    }

    a6(PhotoViewPager photoViewPager) {
        this.a = photoViewPager;
    }
}
