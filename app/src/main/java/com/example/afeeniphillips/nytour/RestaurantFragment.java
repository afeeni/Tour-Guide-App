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



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.restaurant_layout, container, false);
//        ListView listView = view.findViewById(R.id.list);
//        listVew.setAdapter (adapter);


        return view;

}


        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.rest_nm));
            setListAdapter(adapter);

      }

    }



//    setListAdapter(new TripleArrayAdapter(this, Array1, Array2, Array3));

//    private List<Restaurant> restaurantList;
// String restaurants[] = {"Fogo", "Ruth"};
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


