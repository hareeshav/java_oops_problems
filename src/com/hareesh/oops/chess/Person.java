package com.hareesh.oops.chess;

public class Person {
	private String name;
	private Address address;
	private String email;
	private String phone;
}

class Address {
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String country;
}

enum GameStatus {
	ACTIVE, BLACK_WIN, WHITE_WIN, FORFEIT, STALEMATE, RESIGNATION
}

enum AccountStatus {
	ACTIVE, CLOSED, CANCELED, BLACKLISTED, NONE
}
