package kw.com.ridewithme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RiderReviewActivity extends AppCompatActivity {
 Button submit ;
 RatingBar ratingstars ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider_review);
        submit =  findViewById(R.id.submit_review);
        ratingstars = findViewById(R.id.rating_review);

        ratingstars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
 int rating = (int) v;
 String message = null ;
 switch (rating)
 {
     case 1 :
         message = "Sorry to hear that , :(";
         break;
     case 2:
         message = "We always accept suggestions!";
         break;
     case 3 :
         message = "Good Enough!";
         break;
     case 4 :
         message = "Great! , Thank You";
         break;
     case 5 :
         message = "Awsome , You are the Best";
         break;
 }

                Toast.makeText(RiderReviewActivity.this , message , Toast.LENGTH_SHORT).show();
            }
        });
    }
}