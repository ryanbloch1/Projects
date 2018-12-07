package com.example.ryan.profile;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class FragmentsUtility {

    private static final String TAG = "FragmentsManager";
    private static FragmentTransaction transaction;

    private static FragmentTransaction getTransaction(Activity activity) {

        return getFragmentManager(activity).beginTransaction();
    }

    private static FragmentManager getFragmentManager(Activity activity) {
        return ((AppCompatActivity) activity).getSupportFragmentManager();
    }

    static void addFragment(Activity activity, Fragment fragment, int id, boolean isAddedToBackstack) {
        transaction = getTransaction(activity);
        transaction.add(id, fragment, fragment.getClass().getName());
        if (isAddedToBackstack)
            transaction.addToBackStack(fragment.getClass().getName());
        transaction.commit();
    }

    static void replaceFragment(Activity activity, Fragment fragment, int id, boolean isAddedToBackstack) {
        Fragment check_Fragment = getFragmentManager(activity).findFragmentByTag(fragment.getClass().getName());
        if (check_Fragment == null) {
            transaction = getTransaction(activity)
                    .replace(id, fragment, fragment.getClass().getName());
            if (isAddedToBackstack)
                transaction.addToBackStack(fragment.getClass().getName());
            transaction.commit();
        } else {
            transaction = getTransaction(activity);
            transaction.replace(id, check_Fragment, check_Fragment.getClass().getName())
                    .addToBackStack(null)
                    .commit();
        }
    }
}
