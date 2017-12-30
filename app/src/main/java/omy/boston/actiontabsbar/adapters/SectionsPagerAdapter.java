package omy.boston.actiontabsbar.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import omy.boston.actiontabsbar.MainActivity;
import omy.boston.actiontabsbar.fragments.ConceptFragment;
import omy.boston.actiontabsbar.fragments.InfoFragment;
import omy.boston.actiontabsbar.fragments.MainFragment;

/**
 * Created by LosFrancisco on 23-Jan-17.
 */

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            if (position==0)
                return ConceptFragment.newInstance(position + 1);
            else if (position==1)
                return InfoFragment.newInstance(position + 1);
            else
                return MainFragment.newInstance(position + 1);
            }


        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "CONCEPT";
                case 1:
                    return "MAIN";
                case 2:
                    return "INFO";
            }
            return null;
        }

    }
