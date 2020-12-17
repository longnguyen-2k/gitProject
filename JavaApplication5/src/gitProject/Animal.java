/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitProject;

/**
 *
 * @author admin
 */
abstract class Animal {
 private  int age;
 private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    
    
   public abstract  void eating();
    
}
