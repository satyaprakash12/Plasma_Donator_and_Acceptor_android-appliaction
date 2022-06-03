package com.example.plasmabank.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.plasmabank.R;

public class AboutUs extends Fragment {
    private TextView textView;
    private ImageView sblink;
    String ss="https://www.facebook.com/docpatnetwork";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.aboutus, container, false);
        getActivity().setTitle("About us");
        textView = view.findViewById(R.id.txtv);
        sblink=view.findViewById(R.id.fb);
        Linkify.addLinks(textView, Linkify.ALL);
        sblink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setPackage("com.android.chrome");
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse(ss));
                startActivity(i);
            }
        });
        return  view;
    }
}
