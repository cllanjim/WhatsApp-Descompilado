package com.whatsapp.preference;

import android.content.Context;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class WaCheckBoxPreference extends CheckBoxPreference {
    protected View onCreateView(ViewGroup viewGroup) {
        return WaPreference.a(super.onCreateView(viewGroup));
    }

    public WaCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaCheckBoxPreference(Context context) {
        super(context);
    }

    public WaCheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
