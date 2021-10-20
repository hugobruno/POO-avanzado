package com.generation.banco;

/*public class CuentaBancaria {
    private String nombre;
    private String clave;
    private float saldo;

    public String getNombre(){
        return this.nombre;
    }
    public String getClave(){
        return this.clave;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setClave(String clave){
        this.clave = clave;
    }
    public void setSaldo (float saldo){
        if(saldo < 0){
            this.saldo = 0;
        } else{
            this.saldo = saldo;
        }
    }
    public void mostrarSaldo (){
        System.out.println(this.saldo);
    }
}*/

    public class Person
{

    private String name;
    private int age;
    private String id;


    public Person( String name, int age, String id )
    {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}