package com.whatsapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class yx extends AnimatorListenerAdapter {
    final MediaView a;

    yx(MediaView mediaView) {
        this.a = mediaView;
    }

    public void onAnimationEnd(Animator animator) {
        MediaView.a(this.a, false);
        MediaView.b(this.a, true);
    }
}
