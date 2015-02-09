package com.whatsapp.util;

import java.io.OutputStream;

final class bq extends OutputStream {
    final OutputStream a;
    final OutputStream b;

    public void write(int i) {
        this.b.write(i);
        this.a.write(i);
    }

    public void write(byte[] bArr) {
        this.b.write(bArr);
        this.a.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.b.write(bArr, i, i2);
        this.a.write(bArr, i, i2);
    }

    public void close() {
        this.b.close();
        this.a.close();
    }

    public bq(OutputStream outputStream, OutputStream outputStream2) {
        this.b = outputStream;
        this.a = outputStream2;
    }

    public void flush() {
        this.b.flush();
        this.a.flush();
    }
}
