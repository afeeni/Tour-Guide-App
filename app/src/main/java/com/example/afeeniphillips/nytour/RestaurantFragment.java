package com.example.afeeniphillips.nytour;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RestaurantFragment extends ListFragment {

//    private List<Restaurant> restaurantList;
String restaurants[] = {"Fogo", "Ruth"};
//
//
//    private List<Restaurant> initRestuarantList() {
//        Resources res = getResources();
//        String[] restaurants = res.getStringArray(R.array.rest_nm);
//
//        List<Restaurants> restaurantsList = new ArrayList<>();
//
//        for (int i = 0; i < restaurants.length; ++i) {
//            restaurantsList.add(new Restaurant(restaurants[i]));
//        }
//        return restaurantsList;
//    }





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.restaurant_layout, container, false);
//        ListView listView = view.findViewById(R.id.list);
//        listVew.setAdapter (adapter);

        /// populate the listview
        //adapters default or custom
        // arrayadapters (classes) or base adapter

//Here items must be a List<Items> according to your class instead of String[] array
//        ListAdapter listadapter = new ListAdapter(getActivity(), android.R.layout.simple_list_item_1, items);
//        ListView.setAdapter( listAdapter);

        return view;

}


        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, restaurants);
            setListAdapter(adapter);

      }

    }






//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle   savedInstanceState) {
//        View view =  inflater.inflate(R.layout.secondefragment, container, false);
//        mWebView = (WebView) view.findViewById(R.id.activity_main_webview);
//        progressBar = (ProgressBar) view.findViewById(R.id.progressBar1);
//
//        WebSettings webSettings = mWebView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        mWebView.loadUrl("http://www.google.com");
//
//        return view;
//
//
//    }