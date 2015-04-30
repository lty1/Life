package com.qf.www.life;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by asus on 2015/4/30.
 */
public class WelActivity extends FragmentActivity {
    ViewPager viewPager;
    ImageView vleft, vright;
    Button btnlook, btnlogin;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        viewPager = (ViewPager) findViewById(R.id.welcome_vp);
        vleft = (ImageView) findViewById(R.id.welcome_left);
        vright = (ImageView) findViewById(R.id.welcome_right);
        btnlook = (Button) findViewById(R.id.welcome_look);
        btnlogin = (Button) findViewById(R.id.welcome_login);
        //设置适配器
        viewPager.setAdapter(new welAdapter(getSupportFragmentManager()));
        //设置页面切换 监听
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i2) {

            }

            @Override
            public void onPageSelected(int i) {
                if (i == 0) {
                    vleft.setVisibility(View.INVISIBLE);
                    vright.setVisibility(View.VISIBLE);
                } else if (i == 1) {
                    vleft.setVisibility(View.VISIBLE);
                    vright.setVisibility(View.VISIBLE);
                } else if (i == 2) {
                    vleft.setVisibility(View.VISIBLE);
                    vright.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    //viewpager 的适配器
    class welAdapter extends FragmentPagerAdapter {

        public welAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int i) {
            return WelFragment.getFragment(i);
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

}
