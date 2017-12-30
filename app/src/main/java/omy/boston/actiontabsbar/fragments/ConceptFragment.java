package omy.boston.actiontabsbar.fragments;

import android.graphics.Color;
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

public class ConceptFragment extends Fragment {

    /*** The fragment argument representing the section number for thisfragment.*/
    private static final String ARG_SECTION_NUMBER = "section_number";

    public ConceptFragment() {
    }

    /**Returns a new instance of this fragment for the given section number.*/
    public static ConceptFragment newInstance(int sectionNumber) {
        ConceptFragment fragment = new ConceptFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_concept, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText("ConceptFragment " + getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
        return rootView;
    }
}