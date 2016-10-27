//package com.example.madstudent.twentyandabove;

//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;

//public class MainActivity extends AppCompatActivity {

//    @Override
 //   protected void onCreate(Bundle savedInstanceState) {
   //     super.onCreate(savedInstanceState);
     //   setContentView(R.layout.activity_main);
    //}
//}


package com.example.madstudent.twentyandabove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TipBook mTipBook = new TipBook();
    private TextView mLessonTextView;
    private Button mShowTipButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLessonTextView = (TextView) findViewById(R.id.lessonTextView);
        mShowTipButton = (Button) findViewById(R.id.tipRefreshButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mTipBook.getTip();
                mLessonTextView.setText(fact);
            }
        };
        mShowTipButton.setOnClickListener(listener);

        Button btn = (Button) findViewById(R.id.practiceQuestionsButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, practiceQuestions.class);
                startActivity(intent);
            }
        });
    }
}
