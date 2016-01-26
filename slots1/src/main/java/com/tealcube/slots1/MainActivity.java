/*
 * This file is part of CPSC475, licensed under the ISC License.
 *
 * Copyright (c) 2016, Richard Harrah <richard.harrah.13@cnu.edu>
 *
 * Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby granted,
 * provided that the above copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
 * INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN
 * AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THIS SOFTWARE.
 */
package com.tealcube.slots1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final Random RANDOM = new Random();

    private ImageView flower1View;
    private ImageView flower2View;
    private ImageView flower3View;
    private int moneyInTheBank = Constants.STARTING_SPINS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flower1View = (ImageView) findViewById(R.id.flower_1);
        flower2View = (ImageView) findViewById(R.id.flower_2);
        flower3View = (ImageView) findViewById(R.id.flower_3);
        ImageView goButton = (ImageView) findViewById(R.id.go_button);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        if (flower1View != null) {
                            flower1View.setImageResource(R.drawable.tmp);
                        }
                        if (flower2View != null) {
                            flower2View.setImageResource(R.drawable.tmp);
                        }
                        if (flower3View != null) {
                            flower3View.setImageResource(R.drawable.tmp);
                        }
                        Log.d(TAG, "starting animation");
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        flower1View.setImageResource(getFlower(RANDOM.nextInt(Constants.NUMBER_OF_FLOWERS)));
                        flower2View.setImageResource(getFlower(RANDOM.nextInt(Constants.NUMBER_OF_FLOWERS)));
                        flower3View.setImageResource(getFlower(RANDOM.nextInt(Constants.NUMBER_OF_FLOWERS)));
                        Log.d(TAG, "ending animation");
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                flower1View.startAnimation(animation);
                flower2View.startAnimation(animation);
                flower3View.startAnimation(animation);
            }
        });
    }

    protected int getFlower(int i) {
        switch (i) {
            case 1:
                return R.drawable.f1;
            case 2:
                return R.drawable.f2;
            default:
                return R.drawable.f3;
        }
    }
}
