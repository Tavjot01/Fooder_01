package com.example.fooder

class restaurant_data {

    var rest_name : String
    var rating : String
    var imgURL : String

    constructor(rest_name: String, rating: String, imgURL: String) {
        this.rest_name = rest_name
        this.rating = rating
        this.imgURL = imgURL
    }

    @JvmName("functionone")
    fun getRest_Name():String{
        return rest_name
    }


    @JvmName("functiontwo")
    fun getRating():String{
        return rating
    }

    @JvmName("functionthree")

    fun getImgURL():String{
        return imgURL
    }

    @JvmName("functionfour")

    fun setRest_Name(rest_name: String){
        this.rest_name = rest_name
    }

    @JvmName("functionfive")

    fun setRating(Rating: String) {
        this.rating = Rating
    }

    @JvmName("functionsix")

    fun setImgURL(imgURL: String){
        this.imgURL = imgURL
    }

}