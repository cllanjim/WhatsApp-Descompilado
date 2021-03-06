package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.dynamic.d.a;
import java.lang.reflect.Field;

public final class e extends a {
    private final Object TH;

    private e(Object obj) {
        this.TH = obj;
    }

    public static Object f(d dVar) {
        try {
            if (dVar instanceof e) {
                return ((e) dVar).TH;
            }
            IBinder asBinder = dVar.asBinder();
            Field[] declaredFields = asBinder.getClass().getDeclaredFields();
            if (declaredFields.length == 1) {
                Field field = declaredFields[0];
                if (field.isAccessible()) {
                    throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
                }
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (Throwable e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (Throwable e2) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
                } catch (Throwable e22) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e22);
                }
            }
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        } catch (NullPointerException e3) {
            throw e3;
        }
    }

    public static d k(Object obj) {
        return new e(obj);
    }
}
