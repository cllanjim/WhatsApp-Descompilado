package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.internal.view.menu.MenuView.ItemView;

public class ListMenuItemView extends LinearLayout implements ItemView {
    private Drawable mBackground;
    private CheckBox mCheckBox;
    final Context mContext;
    private boolean mForceShowIcon;
    private ImageView mIconView;
    private LayoutInflater mInflater;
    private MenuItemImpl mItemData;
    private boolean mPreserveIconSpacing;
    private RadioButton mRadioButton;
    private TextView mShortcutView;
    private int mTextAppearance;
    private Context mTextAppearanceContext;
    private TextView mTitleView;

    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundDrawable(this.mBackground);
        this.mTitleView = (TextView) findViewById(R.id.abs__title);
        if (this.mTextAppearance != -1) {
            this.mTitleView.setTextAppearance(this.mTextAppearanceContext, this.mTextAppearance);
        }
        this.mShortcutView = (TextView) findViewById(R.id.abs__shortcut);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MenuItemImpl getItemData() {
        return this.mItemData;
    }

    public void setCheckable(boolean z) {
        int i = MenuBuilder.a;
        if (z || this.mRadioButton != null || this.mCheckBox != null) {
            CompoundButton compoundButton;
            CompoundButton compoundButton2;
            int i2;
            if (this.mRadioButton == null) {
                insertRadioButton();
            }
            if (this.mCheckBox == null) {
                insertCheckBox();
            }
            if (this.mItemData.isExclusiveCheckable()) {
                compoundButton = this.mRadioButton;
                CompoundButton compoundButton3 = this.mCheckBox;
                if (i == 0) {
                    compoundButton2 = compoundButton;
                    compoundButton = compoundButton3;
                    if (z) {
                        compoundButton2.setChecked(this.mItemData.isChecked());
                        if (z) {
                            i2 = 8;
                        } else {
                            i2 = 0;
                        }
                        if (compoundButton2.getVisibility() != i2) {
                            compoundButton2.setVisibility(i2);
                        }
                        if (compoundButton.getVisibility() != 8) {
                            compoundButton.setVisibility(8);
                        }
                        if (i == 0) {
                            return;
                        }
                    }
                    this.mCheckBox.setVisibility(8);
                    this.mRadioButton.setVisibility(8);
                }
            }
            compoundButton2 = this.mCheckBox;
            compoundButton = this.mRadioButton;
            if (z) {
                compoundButton2.setChecked(this.mItemData.isChecked());
                if (z) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                if (compoundButton2.getVisibility() != i2) {
                    compoundButton2.setVisibility(i2);
                }
                if (compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                }
                if (i == 0) {
                    return;
                }
            }
            this.mCheckBox.setVisibility(8);
            this.mRadioButton.setVisibility(8);
        }
    }

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void initialize(MenuItemImpl menuItemImpl, int i) {
        int i2;
        this.mItemData = menuItemImpl;
        if (menuItemImpl.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setTitle(menuItemImpl.getTitleForItemView(this));
        setCheckable(menuItemImpl.isCheckable());
        setShortcut(menuItemImpl.shouldShowShortcut(), menuItemImpl.getShortcut());
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
    }

    private void insertIconView() {
        this.mIconView = (ImageView) getInflater().inflate(R.layout.abs__list_menu_item_icon, this, false);
        addView(this.mIconView, 0);
    }

    public void setForceShowIcon(boolean z) {
        this.mForceShowIcon = z;
        this.mPreserveIconSpacing = z;
    }

    private LayoutInflater getInflater() {
        if (this.mInflater == null) {
            this.mInflater = LayoutInflater.from(this.mContext);
        }
        return this.mInflater;
    }

    protected void onMeasure(int i, int i2) {
        if (this.mIconView != null && this.mPreserveIconSpacing) {
            LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mIconView.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.mContext = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SherlockMenuView, i, 0);
        this.mBackground = obtainStyledAttributes.getDrawable(R.styleable.SherlockMenuView_itemBackground);
        this.mTextAppearance = obtainStyledAttributes.getResourceId(R.styleable.SherlockMenuView_itemTextAppearance, -1);
        this.mPreserveIconSpacing = obtainStyledAttributes.getBoolean(R.styleable.SherlockMenuView_preserveIconSpacing, false);
        this.mTextAppearanceContext = context;
        obtainStyledAttributes.recycle();
    }

    public void setShortcut(boolean z, char c) {
        int i;
        if (z && this.mItemData.shouldShowShortcut()) {
            i = 0;
        } else {
            i = 8;
        }
        if (i == 0) {
            this.mShortcutView.setText(this.mItemData.getShortcutLabel());
        }
        if (this.mShortcutView.getVisibility() != i) {
            this.mShortcutView.setVisibility(i);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.mTitleView.setText(charSequence);
            if (this.mTitleView.getVisibility() != 0) {
                this.mTitleView.setVisibility(0);
                if (MenuBuilder.a == 0) {
                    return;
                }
            }
            return;
        }
        if (this.mTitleView.getVisibility() != 8) {
            this.mTitleView.setVisibility(8);
        }
    }

    public void setIcon(Drawable drawable) {
        int i;
        if (this.mItemData.shouldShowIcon() || this.mForceShowIcon) {
            i = 1;
        } else {
            i = 0;
        }
        if (i == 0 && !this.mPreserveIconSpacing) {
            return;
        }
        if (this.mIconView != null || drawable != null || this.mPreserveIconSpacing) {
            if (this.mIconView == null) {
                insertIconView();
            }
            if (drawable != null || this.mPreserveIconSpacing) {
                ImageView imageView = this.mIconView;
                if (i == 0) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.mIconView.getVisibility() != 0) {
                    this.mIconView.setVisibility(0);
                    if (MenuBuilder.a == 0) {
                        return;
                    }
                }
                return;
            }
            this.mIconView.setVisibility(8);
        }
    }

    private void insertCheckBox() {
        this.mCheckBox = (CheckBox) getInflater().inflate(R.layout.abs__list_menu_item_checkbox, this, false);
        addView(this.mCheckBox);
    }

    private void insertRadioButton() {
        this.mRadioButton = (RadioButton) getInflater().inflate(R.layout.abs__list_menu_item_radio, this, false);
        addView(this.mRadioButton);
    }
}
