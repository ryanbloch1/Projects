package com.example.ryan.profile;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

public class UserProfileFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.user_profile, container, false);

        TableLayout tableLayout = view.findViewById(R.id.profileTable);


        //foreach list item...
        for(int i=0; i<=55; i++){
            //add sales codes to the layout.... for each object in list(static list?)
            tableLayout.addView(inflater.inflate(R.layout.table_item, container, false));
        }
        return view;
    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//
//        //populate the table rows with sale codes retrieved from each corresponding UserProfile object fetched from the userProfile list..
//        //for each -->List item TL.addView(table_item with textView.setText(listItem.getSalesCode)).
//    }
}
