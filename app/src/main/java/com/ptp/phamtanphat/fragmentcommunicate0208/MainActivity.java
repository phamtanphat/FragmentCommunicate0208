package com.ptp.phamtanphat.fragmentcommunicate0208;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements GetResult {

    public static TextView txtmain;
    Button btnmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        btnmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Tương tác view giữa activity và view của fragment
//                FragmentA fragmentA = (FragmentA) getFragmentManager().findFragmentById(R.id.fragmentA);
//                fragmentA.UpdateDataMain();
                //Gửi dữ liệu từ activity sang fragment
//                    + Khi fragment chưa được thêm vào activity
//                    + Sử dụng bundle để gửi dữ liệu
//                FragmentManager fragmentManager = getFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                FragmentA fragmentA = new FragmentA();
//                Bundle bundle = new Bundle();
//                bundle.putString("data","Main");
//                fragmentA.setArguments(bundle);
//                fragmentTransaction.add(R.id.framelayout,fragmentA);
//                fragmentTransaction.commit();
            }
        });
    }

    private void anhxa() {
        txtmain = (TextView) findViewById(R.id.textviewmain);
        btnmain = (Button) findViewById(R.id.buttonmain);
    }

    @Override
    public void GanDuLieu(int diem) {
        txtmain.setText(diem+"");
    }
}
