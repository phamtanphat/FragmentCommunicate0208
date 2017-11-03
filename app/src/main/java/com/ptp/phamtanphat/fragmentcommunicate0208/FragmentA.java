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
    EditText edtfragA;
    Button btnfragA;
    RecivedData recivedData;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_a,container,false);
        edtfragA = view.findViewById(R.id.edittextFragmentA);
        btnfragA = view.findViewById(R.id.buttonfragmentA);
        recivedData = (RecivedData) getActivity();
        ArrayList<Person>  persons = new ArrayList<>();
        persons.add(new Person("Phat"));
        recivedData.GetData(persons);

//        Bundle bundle = getArguments();
//        Toast.makeText(getActivity(), bundle.getString("data"), Toast.LENGTH_SHORT).show();
        btnfragA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return view;
    }
    public void UpdateDataMain(){
        TextView txt = getActivity().findViewById(R.id.textviewmain);
        String dulieu = "Update";
        txt.setText(dulieu);
    }
}
