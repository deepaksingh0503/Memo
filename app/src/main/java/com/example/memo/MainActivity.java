package com.example.memo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    ImageView img= findViewById(R.id.img);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        loadmeme();
    }

//    private void loadmeme(){
//
//        RequestQueue queue = Volley.newRequestQueue(this);
//        String url = "https://meme-api.herokuapp.com/gimme";
//
//        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
//                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
//
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        try {
//                            String url= response.getString("url");
//                            Glide.with(getApplicationContext()).load(url).into(img);
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }, new Response.ErrorListener() {
//
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                         TODO: Handle error
//
//                    }
//                });
//
//// Add the request to the RequestQueue.
//        queue.add(jsonObjectRequest);
//    }

    public void sharememe(View view) {
        Toast.makeText(this, "Clicked on sharememe", Toast.LENGTH_SHORT).show();
    }

    public void nextmeme(View view) {
        Toast.makeText(this, "Clicked on nextmeme", Toast.LENGTH_SHORT).show();

    }
}