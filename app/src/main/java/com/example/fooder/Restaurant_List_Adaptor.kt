package com.example.fooder

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ArrayAdapter
import android.widget.TextView

class Restaurant_List_Adaptor(context: Context, resource: Int, objects: ArrayList<restaurant_data>) :
    ArrayAdapter<restaurant_data>(context, resource, objects) {

    private val mContext: Context = context
    private val mResource: Int = resource
    private var lastPosition = -1

    /**
     * Holds variables in a View
     */
    private class ViewHolder {
        var tvrest_name: TextView? = null
        var tvrating: TextView? = null
        var tvimgURL: TextView? = null
    }

    @Suppress("NAME_SHADOWING")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Get the person's information
        val rest_name = getItem(position)?.getRest_Name()
        val rating = getItem(position)?.getRating()
        val imgURL = getItem(position)?.getImgURL()

        // Create the person object with the information
        val person = restaurant_data(rest_name.toString(), rating.toString(), imgURL.toString())

        // Create the view result for showing the animation
        val result: View

        // ViewHolder object
        val holder: ViewHolder

        var convertView = convertView
        if (convertView == null) {
            val inflater = LayoutInflater.from(mContext)
            convertView = inflater.inflate(mResource, parent, false)
            holder = ViewHolder()
            holder.tvrest_name = convertView.findViewById(R.id.RestaurantName)
            holder.tvrating = convertView.findViewById(R.id.Rating)
            holder.tvimgURL = convertView.findViewById(R.id.ImageRestaurant)

            result = convertView
            convertView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            result = convertView
        }

        val animation: Animation = AnimationUtils.loadAnimation(
            mContext,
            if (position > lastPosition) R.anim.load_down_anim else R.anim.load_up_anim
        )
        result.startAnimation(animation)
        lastPosition = position

        holder.tvrest_name?.text = person.rest_name
        holder.tvrating?.text = person.rating
        holder.tvimgURL?.text = person.imgURL

        return convertView!!
    }
}