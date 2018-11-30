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

    randomFragment1 random;

    //list containing instances of a userProfile/sales code objects... populated using retrofit. i.e List<UserProfile>

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentsUtility = new FragmentsUtility();

        userProfileFragment = new UserProfileFragment();

        random = new randomFragment1();

        //if list > 0{
        //  add userProfile fragment
        //
        // } else{

        //      open- Main page
        // }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.f1:
                fragmentsUtility.replaceFragment(this, userProfileFragment, R.id.fragment_holder, true);
                return true;

            case R.id.f2:
                fragmentsUtility.replaceFragment(this, random, R.id.fragment_holder, true);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
