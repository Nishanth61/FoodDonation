package com.fooddonation.app.service;

import com.fooddonation.app.model.FoodPacket;
import com.fooddonation.app.model.NonVegeterianFoodPacket;
import com.fooddonation.app.model.VegeterianFoodPacket;

public class FoodPacketFactory {

	public static FoodPacket getFoodPacket(String type, int size, int quantity, String foodType) {
		FoodPacket foodPacket = null;

		if (type.equalsIgnoreCase("VEG")) {
			foodPacket = new VegeterianFoodPacket(size, quantity, foodType);
		} else if (type.equalsIgnoreCase("NON-VEG")) {
			foodPacket = new NonVegeterianFoodPacket(size, quantity, foodType);
		}

		return foodPacket;
	}
}
