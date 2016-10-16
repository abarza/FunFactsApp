package com.facts.fun.abarza.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by abarza on 15-10-16.
 */

public class ColorWheel {

  private int[] colors = {
      R.color.aqua,
      R.color.red,
      R.color.mauve,
      R.color.orange,
      R.color.lavender,
      R.color.purple,
      R.color.green,
      R.color.mustard,
      R.color.pink
  };

  public int getBgColor() {

    int bgColor;
    Random rdm = new Random();
    int randomNumber = rdm.nextInt(colors.length);
    bgColor = colors[randomNumber];

    return bgColor;
  }





}

