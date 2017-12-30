package omy.boston.actiontabsbar.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import omy.boston.actiontabsbar.MainActivity;
import omy.boston.actiontabsbar.R;

/**
 * Created by LosFrancisco on 23-Jan-17.
 */

public class InfoFragment extends Fragment {
    /**The fragment argument representing the section number for this fragment.*/
    private static final String ARG_SECTION_NUMBER = "section_number";

    public InfoFragment() {
    }

    /**Returns a new instance of this fragment for the given section number.*/
    public static InfoFragment newInstance(int sectionNumber) {
        InfoFragment fragment = new InfoFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_info, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText("InfoFragment " + getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
        return rootView;
    }
}