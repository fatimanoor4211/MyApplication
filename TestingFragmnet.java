package spice.in.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class TestingFragmnet extends Fragment {


    public TestingFragmnet() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(), "Create Fragment", Toast.LENGTH_SHORT).show();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getActivity(), "On Create View Fragment", Toast.LENGTH_SHORT).show();

        return inflater.inflate(R.layout.fragment_testing, container, false);

    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Toast.makeText(getActivity(), "onAttach Fragment", Toast.LENGTH_SHORT).show();

    }


    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getActivity(), "onDetach Fragment", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getActivity(), "Start Fragment", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Toast.makeText(getActivity(), "onActivityCreated Fragment", Toast.LENGTH_SHORT).show();

    }


    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(), "Resume Fragment", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getActivity(), "Pause Fragment", Toast.LENGTH_SHORT).show();
    }
}
