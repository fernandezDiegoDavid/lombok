package com.example.demo.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empleado {
	@Builder.Default
	private String DirEmpresa="calle falsa123";
	private String nombre;
	@Builder.Default
	private String nomEmpresa="tqm";
	private int edad;
	private int leg;
	@ToString.Exclude
	@Builder.Default
	private int sueldo=194000;

}
