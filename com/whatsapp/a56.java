package com.whatsapp;

import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;

class a56 implements OnMarkerClickListener {
    final LocationPicker2 a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onMarkerClick(com.google.android.gms.maps.model.Marker r7) {
        /*
        r6_this = this;
        r1 = 0;
        r5 = 8;
        r2 = com.whatsapp.App.az;
        r0 = r7.getId();
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        return r1;
    L_0x000c:
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.i(r0);
        if (r0 == 0) goto L_0x0031;
    L_0x0014:
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.i(r0);
        r0 = r0.tag;
        if (r0 == 0) goto L_0x0031;
    L_0x001e:
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.i(r0);
        r0 = r0.tag;
        r0 = (com.google.android.gms.maps.model.Marker) r0;
        r3 = r6.a;
        r3 = com.whatsapp.LocationPicker2.b(r3);
        r0.setIcon(r3);
    L_0x0031:
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.p(r0);
        r7.setIcon(r0);
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.s(r0);
        r3 = r0.iterator();
    L_0x0044:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0061;
    L_0x004a:
        r0 = r3.next();
        r0 = (com.whatsapp.PlaceInfo) r0;
        r4 = r0.tag;
        r4 = r7.equals(r4);
        if (r4 == 0) goto L_0x005f;
    L_0x0058:
        r4 = r6.a;
        com.whatsapp.LocationPicker2.a(r4, r0);
        if (r2 == 0) goto L_0x0061;
    L_0x005f:
        if (r2 == 0) goto L_0x0044;
    L_0x0061:
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.s(r0);
        r3 = r6.a;
        r3 = com.whatsapp.LocationPicker2.i(r3);
        r0 = r0.indexOf(r3);
        if (r0 < 0) goto L_0x0094;
    L_0x0073:
        r3 = r6.a;
        r3 = com.whatsapp.LocationPicker2.r(r3);
        r3.notifyDataSetChanged();
        r3 = android.os.Build.VERSION.SDK_INT;
        if (r3 < r5) goto L_0x008b;
    L_0x0080:
        r3 = r6.a;
        r3 = com.whatsapp.LocationPicker2.A(r3);
        r3.smoothScrollToPosition(r0);
        if (r2 == 0) goto L_0x0094;
    L_0x008b:
        r2 = r6.a;
        r2 = com.whatsapp.LocationPicker2.A(r2);
        r2.setSelection(r0);
    L_0x0094:
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.d(r0);
        r0.setVisibility(r5);
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.o(r0);
        r0.setVisibility(r5);
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.t(r0);
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x00b6;
    L_0x00b2:
        r0 = 1;
    L_0x00b3:
        r1 = r0;
        goto L_0x000b;
    L_0x00b6:
        r0 = r1;
        goto L_0x00b3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a56.onMarkerClick(com.google.android.gms.maps.model.Marker):boolean");
    }

    a56(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }
}
