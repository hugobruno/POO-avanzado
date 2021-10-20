package com.generation;

import com.generation.banco.Person;
import com.generation.banco.Person;

public class Main {

    public static void main(String[] args) {
        /*CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNombre("Hugo Bruno");
        cuenta.setClave("ABC-123");
        cuenta.setSaldo(5000);

        System.out.println(cuenta.getNombre());
        cuenta.mostrarSaldo();*/


                Person person= new Person("Santiago", 33, "102045455");
                person.setName("Santiago");
                person.setAge(33);
                person.setId("102045455");

                System.out.println( "Name: " + person.getName());
                System.out.println( "Age: "+ person.getAge());
                System.out.println( "Id: " +  person.getId());




    	/*Animal animal = new Animal();
    	animal.nombre = "iguana";
	Persona persona = new Persona ();
	persona.nombre = "Carlos";
	persona.edad =  31;*/
    }
}
