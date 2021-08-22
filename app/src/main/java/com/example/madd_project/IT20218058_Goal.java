package com.example.madd_project;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link IT20218058_Goal#newInstance} factory method to
 * create an instance of this fragment.
 */
public class IT20218058_Goal extends Fragment {

    private Button btn;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public IT20218058_Goal() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment IT20218058_Goal.
     */
    // TODO: Rename and change types and number of parameters
    public static IT20218058_Goal newInstance(String param1, String param2) {
        IT20218058_Goal fragment = new IT20218058_Goal();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

            /*btn = (Button)findViewById(R.id.btn_myHistory);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    open_myHistory_page(v);
                }
            });*/
        }
    }

    /*public void open_myHistory_page(View view) {
        Intent intent = new Intent(IT20218058_Goal(),IT20218058_MyHistory.class);
        startActivity(intent);
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_i_t20218058__goal, container, false);
    }


}