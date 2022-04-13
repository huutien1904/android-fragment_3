package com.example.viewpager.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.viewpager.model.fragment_food;
import com.example.viewpager.model.fragment_movie;
import com.example.viewpager.model.fragment_travel;

public class FragmentAdapter extends FragmentPagerAdapter {
    public int pageNumber;
    public FragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.pageNumber = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                fragment_food food =  new fragment_food();
                return food;
            case 1:
                fragment_movie movie =  new fragment_movie();
                return movie;
            case 2:
                fragment_travel travel =  new fragment_travel();
                return travel;
        }
         fragment_food food =  new fragment_food();
        return food;
    }

    @Override
    public int getCount() {
        return this.pageNumber;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "food";
            case 1:
                return "movie";
            case 2:
                return "travel";
        }
        return null;
    }
}
