package com.ibrahimkiceci.popularmovies;

import android.content.Context;

import androidx.core.content.ContextCompat;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingleton {

    private RequestQueue requestQueue;
    private static VolleySingleton instance;

    private VolleySingleton(Context context){
        requestQueue = Volley.newRequestQueue(context.getApplicationContext());

    }
    public static synchronized VolleySingleton getInstance(Context context){
        if (instance == null){
            instance = new VolleySingleton(context);
        }

        return instance;

    }
    public RequestQueue getRequestQueue(){
        return requestQueue;
    }

}
