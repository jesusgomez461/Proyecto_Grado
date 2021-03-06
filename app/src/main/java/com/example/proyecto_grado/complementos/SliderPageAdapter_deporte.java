package com.example.proyecto_grado.complementos;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class SliderPageAdapter_deporte extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;

    public SliderPageAdapter_deporte(FragmentManager fm, List<Fragment> fragmentList){
        super(fm);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        /*String iconos = String.valueOf(icons[position]);
        SpannableStringBuilder ss = new SpannableStringBuilder(iconos);

        ss.setSpan(fonte, 0, ss.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        ss.setSpan(new RelativeSizeSpan(1.5f), 0, ss.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        return ss;*/

        switch (position) {
            case 0:
                return "Deportes privados";
            case 1:
                return "Deportes ´publicos";

        }
        return "";


    }
}
