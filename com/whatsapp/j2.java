package com.whatsapp;

import android.widget.Toast;

final class j2 implements Runnable {
    final String a;

    public void run() {
        Toast makeText = Toast.makeText(App.p.getApplicationContext(), this.a, 0);
        makeText.setGravity(85, 0, 0);
        makeText.show();
    }

    j2(String str) {
        this.a = str;
    }
}
