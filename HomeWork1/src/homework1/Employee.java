/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.util.Objects;

/**
 *
 * @author Stas
 */
public class Employee {
    private int id;
    private int salary;
    private String firstName; 
    private String lastName; 
    private String gender = "m"; 
    private String email = "no"; 
    
    public Employee(int id,int salary,String firstName,String lastName){
        this.id = id;               this.salary = salary*2;// =)
        this.firstName = firstName; this.lastName = lastName;
        if(salary <= 0){this.salary = 100000;}
    }
    public int getId(){
        return this.id;
    }
    public int getSalary(){
        return this.salary;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        
        return this.lastName;
    }
    public String getName(){
        
        return this.lastName + this.firstName;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    
    

    
    @Override
    public String toString(){
        String result = "Employee: ID = " + this.getId() + " Name = " + this.getName() + " Salary = " + this.getSalary()+" $.";
        return result;
    }
    public String toStringBook(){
        String result = "Authors: Name = " + this.getName() + " Gender = " + this.gender+" Email = "+this.email +".  ";
        return result;
    }
    public int getAnnualSalary(){
        return salary*12;        
    }
    public void getRaiseSalary(float p){
        this.salary = (int) (salary * p + salary);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(toString());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.salary != other.salary) {
            return false;
        }
        if (!Objects.equals(this.toString(), other.toString())) {
            return false;
        }
        return true;
    }
    
    

}
