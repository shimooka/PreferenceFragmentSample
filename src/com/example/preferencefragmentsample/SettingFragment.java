package com.example.preferencefragmentsample;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * @see https://developer.android.com/intl/ja/guide/topics/ui/settings.html
 */
public class SettingFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref);
    }
}
