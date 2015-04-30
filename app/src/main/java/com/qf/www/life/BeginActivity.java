package com.qf.www.life;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class BeginActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);
        if (isFirst())//如果第一次打开应用，就进入欢迎页面
        {
            System.out.println("-----------欢迎");
            Intent in = new Intent(this, WelActivity.class);
            startActivity(in);
        }

    }

    //判断是否第一次 打开应用的方法
    public boolean isFirst() {
        SharedPreferences sharedPreferences = getSharedPreferences("isFirst", MODE_PRIVATE);
        if (!sharedPreferences.contains("Life")) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("isFirst", false);
            edit.commit();
            System.out.println("--------true");
            return true;
        }
        System.out.println("--------false");
        return false;
    }


}
