package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ru implements OnClickListener {
    final int a;
    final VerifySms b;

    ru(VerifySms verifySms, int i) {
        this.b = verifySms;
        this.a = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.removeDialog(this.a);
    }
}
