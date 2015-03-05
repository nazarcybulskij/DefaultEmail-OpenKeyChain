package com.indeema.mail.bitmap;

import android.graphics.drawable.Drawable;

/**
 * {@link android.graphics.drawable.Drawable}s that support a parallax effect when drawing should
 * implement this interface to receive the current parallax fraction to use when
 * drawing.
 */
public interface Parallaxable {
    /**
     * @param fraction the vertical center point for the viewport, in the range [0,1]
     */
    void setParallaxFraction(float fraction);
}