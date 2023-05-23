package com.example.compose_statemanagement

data class ModelClass(var name: String, var isSelected: Boolean)  {

    override fun toString(): String {
        return "ModelClass(name='$name', isSelected=$isSelected)"
    }
}