package com.fooddonation.app;

import com.fooddonation.app.model.FoodPacket;
import com.fooddonation.app.service.FoodPacketFactory;

public class FoodDonationApplication {

	public static void main(String[] args) {

		FoodPacket[] foodPackets = generateFoodPacketsForFoodCenter();

		for (FoodPacket foodPacket : foodPackets) {
			System.out.println(foodPacket);
		}

	}

	private static FoodPacket[] generateFoodPacketsForFoodCenter() {

		FoodPacket[] foodPackets = new FoodPacket[6];

		FoodPacket vegBreakFastPacket = FoodPacketFactory.getFoodPacket("VEG", 1, 1, "Breakfast");
		FoodPacket vegLunch = FoodPacketFactory.getFoodPacket("VEG", 1, 1, "Lunch");
		FoodPacket vegDinner = FoodPacketFactory.getFoodPacket("VEG", 1, 1, "Dinner");

		FoodPacket nonvegBreakFastPacket = FoodPacketFactory.getFoodPacket("NON-VEG", 1, 1, "Breakfast");
		FoodPacket nonvegLunch = FoodPacketFactory.getFoodPacket("NON-VEG", 1, 1, "Lunch");
		FoodPacket nonvegDinner = FoodPacketFactory.getFoodPacket("NON-VEG", 1, 1, "Dinner");

		foodPackets[0] = vegBreakFastPacket;
		foodPackets[1] = vegLunch;
		foodPackets[2] = vegDinner;
		foodPackets[3] = nonvegBreakFastPacket;
		foodPackets[4] = nonvegLunch;
		foodPackets[5] = nonvegDinner;

		return foodPackets;
	}

}
