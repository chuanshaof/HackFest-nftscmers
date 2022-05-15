package com.example.nftscmers.adapters;


import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;

import com.example.nftscmers.R;
import com.example.nftscmers.objectmodels.ApplicantModel;
import com.example.nftscmers.objectmodels.EmployerModel;
import com.example.nftscmers.objectmodels.TestModel;
import com.example.nftscmers.utils.Utils;
import com.google.firebase.firestore.DocumentReference;

import java.util.ArrayList;
import java.util.List;

public class EmployerAdapter extends ArrayAdapter {
    public static final String TAG = "YOUR-TAG-NAME";
    ArrayList<Object> employer_list;
    public Activity context;
    public LayoutInflater inflater;

    public EmployerAdapter(Activity context, int resource, ArrayList<Object> employer_list) {
        super(context, resource, employer_list);

        this.employer_list = employer_list;
        this.context = context;
        this.inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return employer_list.size();
    }

    @Override
    public Object getItem(int position) {
        return employer_list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        View view = inflater.inflate(R.layout.item_in_cardview, parent, false);
        TextView nameView = view.findViewById(R.id.name);
        ImageView imageView = view.findViewById(R.id.thisimage);
        EmployerModel employer = (EmployerModel) employer_list.get(position);


        nameView.setText(employer.getName());
        Utils.loadImage(imageView, employer.getImage());
        Log.i("applicant data", employer.getName());
        Log.i("applicant data", employer.getImage());


        return view;

    }
}
