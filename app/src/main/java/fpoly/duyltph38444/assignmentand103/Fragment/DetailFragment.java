package fpoly.duyltph38444.assignmentand103.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fpoly.duyltph38444.assignmentand103.R;


public class DetailFragment extends Fragment {




    public DetailFragment() {
        // Required empty public constructor
    }


    public static DetailFragment newInstance() {
        DetailFragment fragment = new DetailFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }
}