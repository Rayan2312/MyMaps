package edu.stanford.ralbraid.mymaps.model

import java.io.Serializable


data class UserMap(val title: String, val places: List<Place>): Serializable