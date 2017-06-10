package ca.danielw.rankr.activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ca.danielw.rankr.R;
import ca.danielw.rankr.adapters.SlidePagerAdapter;

public class SignInActivity extends AppCompatActivity {
    private static final String SOURCE_LOCATION = "SIGNINACTIVITY";

    private ViewPager mPager;
    private SlidePagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        /* Instantiate a ViewPager and a PagerAdapter. */
        mPager = (ViewPager) findViewById(R.id.vpPager);
        mPagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(), SOURCE_LOCATION);
        mPager.setAdapter(mPagerAdapter);
    }
}
