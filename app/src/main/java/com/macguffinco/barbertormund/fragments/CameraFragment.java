package com.macguffinco.barbertormund.fragments;


import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import com.macguffinco.barbertormund.R;
import com.macguffinco.barbertormund.fragments.dummy.DummyContent;

/**
 * A simple {@link Fragment} subclass.
 */
public class CameraFragment extends Fragment {
 //   String [] SPINNERLIST={"Corte de Cabello","Arreglo de Barba","Doble"};

    // TODO: Customize parameters
    private int mColumnCount = 1;
    private AppointmentFragment.OnListFragmentInteractionListener mListener;

    public CameraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.fragment_camera, container, false);
        RecyclerView rv= view.findViewById(R.id.listsearch);
        rv.setAdapter(new AppointmentRecyclerViewAdapter(DummyContent.ITEMS, mListener));

        return view;

    }

}
