package com.ptp.phamtanphat.fragmentcommunicate0208;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 3/11/2017.
 */

public class FragmentA extends Fragment {

    View view;
    Button btnfragA;
    GetResult getResult;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_a,container,false);

        btnfragA = view.findViewById(R.id.buttonfragmentA);
        getResult = (GetResult) getActivity();


//        Bundle bundle = getArguments();
//        Toast.makeText(getActivity(), bundle.getString("data"), Toast.LENGTH_SHORT).show();
        btnfragA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               TextView textView = getActivity().findViewById(R.id.textviewmain);
               textView.setText("1");
            }
        });
        return view;
    }
//    public void UpdateDataMain(){
//        TextView txt = getActivity().findViewById(R.id.textviewmain);
//        String dulieu = "Update";
//        txt.setText(dulieu);
//    }
}
