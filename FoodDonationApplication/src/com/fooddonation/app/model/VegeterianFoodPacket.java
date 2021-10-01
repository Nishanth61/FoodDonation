package com.fooddonation.app.model;

public class VegeterianFoodPacket extends FoodPacket {

	public VegeterianFoodPacket(int size, int quantity, String foodType,boolean nutsIncluded) {
		this.type = "VEG";
		this.size = size;
		this.quantity = quantity;
		this.foodType = foodType;
		this.nutsIncluded = nutsIncluded;
	}

}
