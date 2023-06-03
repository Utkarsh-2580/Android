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


public class fragment2 extends Fragment {

    View view;
    Button buttondata2;
    EditText editfrag2;
    Fragtoactviewmodel viewmodel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment2, container, false);


        buttondata2 = view.findViewById(R.id.buttondata2);
//        buttondata2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                editfrag2 = view.findViewById(R.id.editfrag2);
//                Bundle result = new Bundle();
//                result.putString("Df2",editfrag2.getText().toString());
//                getParentFragmentManager().setFragmentResult("datafrom2",result);
//                editfrag2.setText("");
//            }
//        });
////
//        getParentFragmentManager().setFragmentResultListener("datafrom1", this, new FragmentResultListener() {
//            @Override
//            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
//                String data2 = result.getString("Df1");
//                TextView datafrom1 = view.findViewById(R.id.datafrom1);
//                Log.d(TAG, "onFragmentResult: datasend" + data2);
//                datafrom1.setText(data2);
//                Log.d(TAG, "onFragmentResult: set data" + data2);
//
//            }
//        });
        buttondata2 = view.findViewById(R.id.buttondata2);
        editfrag2 = view.findViewById(R.id.editfrag2);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewmodel = new ViewModelProvider(requireActivity()).get(Fragtoactviewmodel.class);
        //buttondata2 = view.findViewById(R.id.buttondata2);
        buttondata2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                editfrag2 = view.findViewById(R.id.editfrag2);
                viewmodel.setdata(editfrag2.getText().toString());

            }
        });
    }
}