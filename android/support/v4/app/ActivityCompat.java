package android.support.v4.app;

import android.app.Activity;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;

public class ActivityCompat extends ContextCompat {
    public static void finishAfterTransition(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            ActivityCompat21.finishAfterTransition(activity);
            if (!FragmentActivity.a) {
                return;
            }
        }
        activity.finish();
    }
}
