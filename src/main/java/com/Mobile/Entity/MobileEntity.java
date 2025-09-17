package com.Mobile.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mobiletable")
public class MobileEntity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String brand;
private int price;
private float size;
private String color;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public float getSize() {
	return size;
}
public void setSize(float size) {
	this.size = size;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}


}
