package com.example.ryan.profile;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    FragmentsUtility fragmentsUtility;

    UserProfileFragment userProfileFragment;

    //list containing instances of a userProfile/sales code objects... populated using retrofit. i.e List<UserProfile>

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentsUtility = new FragmentsUtility();

        userProfileFragment = new UserProfileFragment();

        RecyclerFragment f = new RecyclerFragment();


        fragmentsUtility.addFragment(this, f, R.id.fragment_holder, true);

        //if list > 0{
        //  add userProfile fragment
        //
        // } else{

        //      open- Main page
        // }
    }

}
