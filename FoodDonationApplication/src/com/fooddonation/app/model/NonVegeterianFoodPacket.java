package com.fooddonation.app.model;

public class NonVegeterianFoodPacket extends FoodPacket {

	public NonVegeterianFoodPacket(int size, int quantity, String foodType,boolean nutsIncluded) {
		this.type = "NON-VEG";
		this.size = size;
		this.quantity = quantity;
		this.foodType = foodType;
		this.nutsIncluded = nutsIncluded;

	}

}
