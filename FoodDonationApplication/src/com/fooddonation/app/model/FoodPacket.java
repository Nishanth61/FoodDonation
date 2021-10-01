package com.fooddonation.app.model;

public abstract class FoodPacket {

	String type;
	int size;
	int quantity;
	String foodType;
	boolean nutsIncluded;
	
	

	public boolean isNutsIncluded() {
		return nutsIncluded;
	}

	public void setNutsIncluded(boolean nutsIncluded) {
		this.nutsIncluded = nutsIncluded;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodPacket [type=");
		builder.append(type);
		builder.append(", size=");
		builder.append(size);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", foodType=");
		builder.append(foodType);
		builder.append(", nutsIncluded=");
		builder.append(nutsIncluded);
		builder.append("]");
		return builder.toString();
	}

	

}
