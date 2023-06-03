package com.example.fragtoactivity;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class fragment1 extends Fragment {

    View view;
    Button buttondata1;
    EditText editfrag1;
    Fragtoactviewmodel viewmodel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        buttondata1 = view.findViewById(R.id.buttondata1);


//        buttondata1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editfrag1 = view.findViewById(R.id.editfrag1);
//                Bundle result = new Bundle();
//                result.putString("Df1",editfrag1.getText().toString());
//                getParentFragmentManager().setFragmentResult("datafrom1",result);
//                editfrag1.setText("");
//            }
//        });
//
//        getParentFragmentManager().setFragmentResultListener("datafrom2", this, new FragmentResultListener() {
//            @Override
//            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
//                String data1 = result.getString("Df2");
//                Log.d(TAG, "onFragmentResult: datasend" + data1);
//                TextView datafrom2 = view.findViewById(R.id.datafrom2);
//                datafrom2.setText(data1);
//
//            }
//        });
        buttondata1 = view.findViewById(R.id.buttondata1);
        editfrag1 = view.findViewById(R.id.editfrag1);
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewmodel = new ViewModelProvider(requireActivity()).get(Fragtoactviewmodel.class);
//        Button buttondata1 = view.findViewById(R.id.buttondata1);
        buttondata1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                EditText editfrag1 = view.findViewById(R.id.editfrag1);
                viewmodel.setdata(editfrag1.getText().toString());

            }
        });

    }
}