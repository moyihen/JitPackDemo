package com.example.jittoast;

import android.content.Context;
import android.widget.Toast;

public class JToast {


    public static void show(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }
}
