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

/**
 * Created by KhoaPhamPC on 3/11/2017.
 */

public class FragmentB extends Fragment {

    View view;
    Button btnfragB;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_b,container,false);

        btnfragB = view.findViewById(R.id.buttonfragmentB);
        btnfragB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return view;
    }
}
