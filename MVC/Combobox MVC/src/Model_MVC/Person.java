/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_MVC;

/**
 *
 * @author Otto Vogrincic
 */
public class Person {
    public String lName, fName;
    public double height, weight;
    
    public Person(String lname, String fname, double height, double weight){
        this.lName = lname;
        this.fName = fname;
        this.height = height;
        this.weight = weight;
    }
    
    String getLastName(){
        return lName;
    }
    private String getFirstName(){
        return fName;
    }
    private double getHeight(){
        return height;
    }
    private double getWeight(){
        return weight;
    }
}
