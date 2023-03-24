package com.example.pr5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import java.util.ArrayList;

public class Fragment2 extends Fragment {

    public Fragment2() {
        super(R.layout.fragment2);
    }

    public void onResume() {

        super.onResume();

        Button button1 = (Button) getView().findViewById(R.id.button21);
        button1.setOnClickListener(view12 -> {
            Intent intent = new Intent(getActivity(), MyService.class);
            getActivity().startService(intent);
        });

        Button button2 = (Button) getView().findViewById(R.id.button22);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.fragment3);
            }
        });

    }

}

