package com.qf.www.life;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by asus on 2015/4/29.
 */
public class WelFragment extends Fragment {
    public static WelFragment getFragment(int position) {
        WelFragment fragment = new WelFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.welcome_viewpager, container, false);
        ImageView img1 = (ImageView) view.findViewById(R.id.welcome_vp_1);
        ImageView img2 = (ImageView) view.findViewById(R.id.welcome_vp_2);
        ImageView img3 = (ImageView) view.findViewById(R.id.welcome_vp_3);
        int position = getArguments().getInt("position");
        if (position == 0) {
            img1.setImageResource(R.drawable.welcome_1);
            img2.setImageResource(R.drawable.welcome_title_1);
            img3.setImageResource(R.drawable.welcome_desc_1);
        } else if (position == 1) {
            img1.setImageResource(R.drawable.welcome_2);
            img2.setImageResource(R.drawable.welcome_title_2);
            img3.setImageResource(R.drawable.welcome_desc_2);
        } else if (position == 2) {
            img1.setImageResource(R.drawable.welcome_3);
            img2.setImageResource(R.drawable.welcome_title_3);
            img3.setImageResource(R.drawable.welcome_desc_3);
        }
        return view;
    }
}