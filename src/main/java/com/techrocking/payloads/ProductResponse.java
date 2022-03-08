package com.techrocking.payloads;

import lombok.Data;

@Data
public class ProductResponse {
	private String name;
	private int price;
	private Long id;
}
