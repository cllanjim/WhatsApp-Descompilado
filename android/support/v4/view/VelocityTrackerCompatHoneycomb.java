package android.support.v4.view;

import android.view.VelocityTracker;

class VelocityTrackerCompatHoneycomb {
    public static float getYVelocity(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }

    public static float getXVelocity(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }
}
