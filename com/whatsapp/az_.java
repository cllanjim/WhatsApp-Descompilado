package com.whatsapp;

public class az_ extends azn {
    public int c(int i) {
        boolean z = true;
        boolean z2 = azn.a;
        int i2 = i % 100;
        int i3 = i % 10;
        if (i3 == 1 && i2 != 11) {
            return 2;
        }
        if (i3 >= 2 && i3 <= 4 && (i2 < 12 || i2 > 14)) {
            return 8;
        }
        if (i3 == 0 || ((i3 >= 5 && i3 <= 9) || (i2 >= 11 && i2 <= 14))) {
            return 16;
        }
        if (!DialogToastActivity.i) {
            return 0;
        }
        if (z2) {
            z = false;
        }
        azn.a = z;
        return 0;
    }
}
