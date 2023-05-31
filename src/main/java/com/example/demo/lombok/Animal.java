package com.example.demo.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Animal {

	//no se pone not null al id por que puede
	//no existir hasta no ser registrado en una bd 
	private long idAnimal;
	private int edad;
	private @NonNull String raza;
	private int peso;
}
