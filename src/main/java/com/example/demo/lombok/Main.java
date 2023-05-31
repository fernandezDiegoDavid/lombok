package com.example.demo.lombok;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import lombok.Cleanup;
import lombok.NonNull;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//@NoArgsContructor
		Persona per = new Persona();
		//@Setter
		per.setEdad(40);
		per.setApellido("fernandez");
		per.setNombre("David");
		//@Getter
		System.out.println("Edad: "+per.getEdad());
		//@AllArgsConstructor
		Persona per2 = new Persona("Diego", 31,"Fernandez");
		//@ToString
		System.out.println(per2);
		System.out.println("Comparacion de objetos");
		//EqualsAndHashCode
		System.out.println(per2.equals(per));
		Persona pers3= new Persona("Diego",31,"Fernandez");
		System.out.println(per2.equals(pers3));
		System.out.println("Prueba de natacion builder");
		//@Builder
		//builder nos permite crear los objetos sin tener 
		//en cuenta los constructores y hacerlo segun lo que 
		//necesitemos
		Empleado emp0 = new Empleado();
		System.out.println(emp0);
		Empleado emp = Empleado.builder().nombre("Daniel").edad(21).build();
		Empleado emp1 = new Empleado("Estapordefault","yesica","fulchi", 36,4976, 200000);
		System.out.println(emp1);
		//@ToString.Eclude
		System.out.println(emp);
		System.out.println("Utilizacion de notacion data");
		//@AllArgsConstrucutor
		Animal ani = new Animal(3L,1, "caniche",4);
		//Set
		ani.setRaza("dogo");
		//@toString
		System.out.println("toString"+ani.toString());
		//@requiredArgsConstructot
		Animal ani2 = new Animal("pitbull");
		System.out.println(ani2);
		System.out.println("Utilizacin de cleanup");
		

       @Cleanup InputStream is = null;
        
        int init;
        char caracter;
        try {
        	is = new FileInputStream("C:\\Users\\veron\\Desktop\\TPOO2\\anotacionescleanup.txt");
			System.out.println("Datos leidos del archivo:");
			while ((init=is.read())!=-1) {
				caracter = (char)init;
				System.out.print(caracter);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} /*
		    lombok se encarga de cerrar el recurso 
		    finally {
			is.close();
		}*/
        
        System.out.println();
		Animal an3=null;
		try {
		setNonNull(an3);
	
		}catch (NullPointerException e) {
			System.err.println("Error Controlado: "+e.getMessage());
		}
		
		

	}
	//cuando se necesita que un parametro no venga vacio
	public static void setNonNull(@NonNull Animal a) {
		System.out.println(a);
	}

}
