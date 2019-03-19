package com.example.yannamreddy.prelaunchreports;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomView extends LinearLayout {

    private TextView text_input_layout_password;
    private TextView text_input_edit_text_password;
    public CustomView(Context context) {
        super(context);
        initializeViews(context);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initializeViews(context);
    }

    public CustomView(Context context,
                       AttributeSet attrs,
                       int defStyle) {
        super(context, attrs, defStyle);
        initializeViews(context);
    }
    /**
     * Inflates the views in the layout.
     *
     * @param context the current context for the view.
     */
    private void initializeViews(Context context) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.custonview, this);
    }
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        // Sets the images for the previous and next buttons. Uses
        // built-in images so you don't need to add images, but in
        // a real application your images should be in the
        // application package so they are always available.
        text_input_layout_password = (TextView) this
                .findViewById(R.id.text_input_layout_password);

        text_input_edit_text_password = (TextView) this
                .findViewById(R.id.text_input_edit_text_password);

    }
}
