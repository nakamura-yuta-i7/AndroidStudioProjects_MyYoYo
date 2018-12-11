package com.nkmr.myyoyo

import android.animation.Animator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import android.widget.Button
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var delay: Long = 0
        arrayListOf(
            button,
            button2,
            button3,
            button4,
            button5,
            button6,
            button7,
            button8,
            button9,
            button10,
            button11
        ).forEach {
            delay += 100
            YoYo.with(Techniques.Bounce).delay(delay).duration(1000).playOn(it)
            YoYo.with(Techniques.FadeOut).delay(delay+1000).duration(1000).playOn(it)
        }

        button.setOnClickListener   { YoYo.with(Techniques.DropOut).playOn(it) }
        button2.setOnClickListener  { YoYo.with(Techniques.Bounce).playOn(it) }
        button3.setOnClickListener  { YoYo.with(Techniques.FadeIn).playOn(it) }
        button4.setOnClickListener  { YoYo.with(Techniques.FadeOut).playOn(it) }
        button5.setOnClickListener  { YoYo.with(Techniques.TakingOff).playOn(it) }
        button6.setOnClickListener  { YoYo.with(Techniques.StandUp).playOn(it) }
        button7.setOnClickListener  { YoYo.with(Techniques.FlipInX).playOn(it) }
        button8.setOnClickListener  { YoYo.with(Techniques.Wobble).playOn(it) }
        button9.setOnClickListener  { YoYo.with(Techniques.Wave).playOn(it) }
        button10.setOnClickListener { YoYo.with(Techniques.RubberBand).playOn(it) }
        button11.setOnClickListener { YoYo.with(Techniques.FadeOutRight).playOn(it) }

//        DropOut(DropOutAnimator::class.java),
//        Landing(LandingAnimator::class.java),
//        TakingOff(TakingOffAnimator::class.java),
//
//        Flash(FlashAnimator::class.java),
//        Pulse(PulseAnimator::class.java),
//        RubberBand(RubberBandAnimator::class.java),
//        Shake(ShakeAnimator::class.java),
//        Swing(SwingAnimator::class.java),
//        Wobble(WobbleAnimator::class.java),
//        Bounce(BounceAnimator::class.java),
//        Tada(TadaAnimator::class.java),
//        StandUp(StandUpAnimator::class.java),
//        Wave(WaveAnimator::class.java),
//
//        Hinge(HingeAnimator::class.java),
//        RollIn(RollInAnimator::class.java),
//        RollOut(RollOutAnimator::class.java),
//
//        BounceIn(BounceInAnimator::class.java),
//        BounceInDown(BounceInDownAnimator::class.java),
//        BounceInLeft(BounceInLeftAnimator::class.java),
//        BounceInRight(BounceInRightAnimator::class.java),
//        BounceInUp(BounceInUpAnimator::class.java),
//
//        FadeIn(FadeInAnimator::class.java),
//        FadeInUp(FadeInUpAnimator::class.java),
//        FadeInDown(FadeInDownAnimator::class.java),
//        FadeInLeft(FadeInLeftAnimator::class.java),
//        FadeInRight(FadeInRightAnimator::class.java),
//
//        FadeOut(FadeOutAnimator::class.java),
//        FadeOutDown(FadeOutDownAnimator::class.java),
//        FadeOutLeft(FadeOutLeftAnimator::class.java),
//        FadeOutRight(FadeOutRightAnimator::class.java),
//        FadeOutUp(FadeOutUpAnimator::class.java),
//
//        FlipInX(FlipInXAnimator::class.java),
//        FlipOutX(FlipOutXAnimator::class.java),
//        FlipInY(FlipInYAnimator::class.java),
//        FlipOutY(FlipOutYAnimator::class.java),
//        RotateIn(RotateInAnimator::class.java),
//        RotateInDownLeft(RotateInDownLeftAnimator::class.java),
//        RotateInDownRight(RotateInDownRightAnimator::class.java),
//        RotateInUpLeft(RotateInUpLeftAnimator::class.java),
//        RotateInUpRight(RotateInUpRightAnimator::class.java),
//
//        RotateOut(RotateOutAnimator::class.java),
//        RotateOutDownLeft(RotateOutDownLeftAnimator::class.java),
//        RotateOutDownRight(RotateOutDownRightAnimator::class.java),
//        RotateOutUpLeft(RotateOutUpLeftAnimator::class.java),
//        RotateOutUpRight(RotateOutUpRightAnimator::class.java),
//
//        SlideInLeft(SlideInLeftAnimator::class.java),
//        SlideInRight(SlideInRightAnimator::class.java),
//        SlideInUp(SlideInUpAnimator::class.java),
//        SlideInDown(SlideInDownAnimator::class.java),
//
//        SlideOutLeft(SlideOutLeftAnimator::class.java),
//        SlideOutRight(SlideOutRightAnimator::class.java),
//        SlideOutUp(SlideOutUpAnimator::class.java),
//        SlideOutDown(SlideOutDownAnimator::class.java),
//
//        ZoomIn(ZoomInAnimator::class.java),
//        ZoomInDown(ZoomInDownAnimator::class.java),
//        ZoomInLeft(ZoomInLeftAnimator::class.java),
//        ZoomInRight(ZoomInRightAnimator::class.java),
//        ZoomInUp(ZoomInUpAnimator::class.java),
//
//        ZoomOut(ZoomOutAnimator::class.java),
//        ZoomOutDown(ZoomOutDownAnimator::class.java),
//        ZoomOutLeft(ZoomOutLeftAnimator::class.java),
//        ZoomOutRight(ZoomOutRightAnimator::class.java),
//        ZoomOutUp(ZoomOutUpAnimator::class.java);
    }
}
