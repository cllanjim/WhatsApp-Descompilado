package android.support.v4.view;

import android.view.MotionEvent;

class MotionEventCompatEclair {
    public static int getPointerId(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    public static float getX(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    public static int getPointerCount(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    public static float getY(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    public static int findPointerIndex(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }
}
