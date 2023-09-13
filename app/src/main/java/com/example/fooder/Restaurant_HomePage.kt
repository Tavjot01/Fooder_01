package com.example.fooder

import android.os.Bundle
import android.util.Log
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class Restaurant_HomePage : AppCompatActivity() {

    private val TAG = "Restaurant_HomePage"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_home_page)
        Log.d(TAG, "Oncreate - Started")
        val mListView = findViewById<ListView>(R.id.theRestaurantList)

        val john = restaurant_data("Chillis", "5", "")
        val steve = restaurant_data("One8", "4", "Male")
        val stacy = restaurant_data("Punjab Grill", "4", "Female")
        val ashley = restaurant_data("Ashley Kitchen", "3", "Female")
        val matt = restaurant_data("Pataka", "4", "Male")
        val matt3 = restaurant_data("Indian Street Food&Co", "4", "Male")
        val matt4 = restaurant_data("CloudWalk", "3.5", "Male")
        val matt5 = restaurant_data("Baruchas", "4.1", "Male")
        val matt6 = restaurant_data("Starbucks", "3.2", "Male")
        val matt7 = restaurant_data("Haveli", "2.8", "Male")
        val matt8 = restaurant_data("Ranveer's Kitchen", "4.3", "Male")
        val matt9 = restaurant_data("Matt9", "3.1", "Male")
        val matt10 = restaurant_data("Matt10", "2", "Male")
        val matt11 = restaurant_data("Matt11", "1.7", "Male")

        val restaurantList_content: ArrayList<restaurant_data> = ArrayList<restaurant_data>()
        restaurantList_content.add(john)
        restaurantList_content.add(steve)
        restaurantList_content.add(stacy)
        restaurantList_content.add(ashley)
        restaurantList_content.add(matt)
        restaurantList_content.add(matt3)
        restaurantList_content.add(matt4)
        restaurantList_content.add(matt5)
        restaurantList_content.add(matt6)
        restaurantList_content.add(matt7)
        restaurantList_content.add(matt8)
        restaurantList_content.add(matt9)
        restaurantList_content.add(matt10)
        restaurantList_content.add(matt11)

         val adapter = Restaurant_List_Adaptor(this, R.layout.homepage_list_adaptor_custom, restaurantList_content)
        mListView.adapter = adapter

    }
}