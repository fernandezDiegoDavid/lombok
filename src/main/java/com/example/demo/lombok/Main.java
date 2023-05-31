package com.example.demo.lombok;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona per = new Persona();
		per.setEdad(40);
		per.setApellido("fernandez");
		per.setNombre("David");
		System.out.println("edad: "+per.getEdad());
		Persona per2 = new Persona("Diego", 31,"Fernandez");
		System.out.println(per2);
		System.out.println("comparacion de objetos");
		System.out.println(per2.equals(per));
		Persona pers3= new Persona("Diego",31,"Fernandez");
		System.out.println(per2.equals(pers3));
		System.out.println("Prueba de noatacion builder");
		Empleado emp = Empleado.builder().nombre("Daniel").edad(21).build();
		System.out.println(emp);
		

	}

}
