package com.facts.fun.abarza.funfacts;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {
  private FactBook mFactBook = new FactBook();
  private ColorWheel mColorWheel = new ColorWheel();
  private Button mNextTipButton;
  private TextView mTipText;
  private RelativeLayout mRootLayout;
  private static final String TAG = FunFactsActivity.class.getSimpleName();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fun_facts);


    bindUI();
    View.OnClickListener listener = new View.OnClickListener() {
      @Override
      public void onClick(View v) {

        String fact = mFactBook.getFact();
        int color = mColorWheel.getBgColor();

        mTipText.setText(fact);
        mRootLayout.setBackgroundResource(color);
        mNextTipButton.setTextColor(ContextCompat.getColor(FunFactsActivity.this, color));



      }
    };
    mNextTipButton.setOnClickListener(listener);



  }

  private void bindUI() {
    mNextTipButton = (Button) findViewById(R.id.next_tip_button);
    mTipText = (TextView) findViewById(R.id.fact_text);
    mRootLayout = (RelativeLayout) findViewById(R.id.activity_fun_facts);
  }
}
