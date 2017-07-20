package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.view.View.GONE;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener()
        {
                                          @Override
                                          public void onClick(View view)
                                          {
                                              if (mStoryIndex == 1)
                                              {
                                                  mStoryTextView.setText(R.string.T3_Story);
                                                  mButtonTop.setText(R.string.T3_Ans1);
                                                  mButtonBottom.setText(R.string.T3_Ans2);
                                                  mStoryIndex = 2;
                                              }
                                              else if (mStoryIndex == 2)
                                              {
                                                  mStoryTextView.setText(R.string.T6_End);
                                                  mButtonTop.setVisibility(View.GONE);
                                                  mButtonBottom.setVisibility(View.GONE);
                                                  mStoryIndex = 1;
                                              }
                                              else if (mStoryIndex == 5)
                                              {
                                                  mStoryTextView.setText(R.string.T3_Story);
                                                  mButtonTop.setText(R.string.T3_Ans1);
                                                  mButtonBottom.setText(R.string.T3_Ans2);
                                                  mStoryIndex = 6;
                                              }
                                              else if (mStoryIndex == 6)
                                              {
                                                  mStoryTextView.setText(R.string.T6_End);
                                                  mButtonTop.setVisibility(View.GONE);
                                                  mButtonBottom.setVisibility(View.GONE);
                                                  mStoryIndex = 1;
                                              }
                                          }
        })
                                      ;


                // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (mStoryIndex == 1)
                {
                    mStoryTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 5;
                }
                else if (mStoryIndex == 2)
                {
                    mStoryTextView.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                    mStoryIndex = 1;
                }
                else if (mStoryIndex == 5)
                {
                    mStoryTextView.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                    mStoryIndex = 1;
                }
                else if (mStoryIndex == 6)
                {
                    mStoryTextView.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                    mStoryIndex = 1;
                }
            }
        });

    }
}
