package adr.ycx.com.myapplication;

import android.animation.Animator;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/**
 * 创建日期：2017/9/22
 * 创建者ycx
 */

public class CircleViewBA extends View implements Animation.AnimationListener{

    public CircleViewBA(Context context) {
        super(context);
    }

    public CircleViewBA(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleViewBA(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CircleViewBA(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void set(){
        Animator
        AlphaAnimation alphaAnimation=new AlphaAnimation(0.1f,1.0f);
        alphaAnimation.set
        alphaAnimation.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {
        animation.
    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
