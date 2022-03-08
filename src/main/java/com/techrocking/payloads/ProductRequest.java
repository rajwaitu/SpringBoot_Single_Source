package com.techrocking.payloads;

import lombok.Data;

@Data
public class ProductRequest {
	private String name;
	private int price;
}
