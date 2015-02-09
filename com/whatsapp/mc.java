package com.whatsapp;

import android.content.ContentProviderClient;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;

final class mc implements atc {
    private final ContentProviderClient a;

    public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            return this.a.query(uri, strArr, str, strArr2, str2);
        } catch (RemoteException e) {
            return null;
        }
    }

    mc(ContentProviderClient contentProviderClient, sm smVar) {
        this(contentProviderClient);
    }

    public int a(Uri uri, String str, String[] strArr) {
        try {
            return this.a.delete(uri, str, strArr);
        } catch (RemoteException e) {
            return -1;
        }
    }

    public int a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            return this.a.update(uri, contentValues, str, strArr);
        } catch (RemoteException e) {
            return -1;
        }
    }

    public Uri a(Uri uri, ContentValues contentValues) {
        try {
            return this.a.insert(uri, contentValues);
        } catch (RemoteException e) {
            return null;
        }
    }

    public ContentProviderResult[] a(ArrayList arrayList) {
        return this.a.applyBatch(arrayList);
    }

    private mc(ContentProviderClient contentProviderClient) {
        this.a = contentProviderClient;
    }
}
