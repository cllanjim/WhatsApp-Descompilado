package com.whatsapp.camera;

import android.view.View.OnTouchListener;

class t implements OnTouchListener {
    final CameraActivity a;

    t(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
        r8_this = this;
        r0 = 1;
        r1 = 0;
        r2 = r8.a;
        r2 = com.whatsapp.camera.CameraActivity.d(r2);
        r2 = r2.m();
        if (r2 == 0) goto L_0x0056;
    L_0x000e:
        r2 = r10.getAction();
        if (r2 != r0) goto L_0x002e;
    L_0x0014:
        r2 = r8.a;
        r4 = java.lang.System.currentTimeMillis();
        r3 = r8.a;
        r6 = com.whatsapp.camera.CameraActivity.f(r3);
        r4 = r4 - r6;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 <= 0) goto L_0x0057;
    L_0x0027:
        com.whatsapp.camera.CameraActivity.a(r2, r0);
        r0 = com.whatsapp.camera.CameraActivity.l;
        if (r0 == 0) goto L_0x0056;
    L_0x002e:
        r0 = r10.getAction();
        r2 = 2;
        if (r0 != r2) goto L_0x0056;
    L_0x0035:
        r0 = r10.getY();
        r0 = -r0;
        r2 = r8.a;
        r2 = com.whatsapp.camera.CameraActivity.j(r2);
        r2 = r2.getHeight();
        r2 = (float) r2;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0056;
    L_0x0049:
        r0 = r8.a;
        com.whatsapp.camera.CameraActivity.a(r0, r1);
        r0 = r8.a;
        r2 = 2131625068; // 0x7f0e046c float:1.8877334E38 double:1.053162716E-314;
        com.whatsapp.App.b(r0, r2, r1);
    L_0x0056:
        return r1;
    L_0x0057:
        r0 = r1;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.t.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
