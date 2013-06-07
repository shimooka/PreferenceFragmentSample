package com.example.preferencefragmentsample;

import android.app.Activity;
import android.os.Bundle;

/**
 * @see https://developer.android.com/intl/ja/guide/topics/ui/settings.html
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display the fragment as the main content.
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingFragment())
                .commit();
    }
}