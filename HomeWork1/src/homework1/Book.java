/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;


public class Book {
    private String name;
    private Employee[] authors;
    private double price;
    private int qty;
    public Book(String name,Employee author,double price,int qty){
        this.authors = new Employee[1];
        this.authors[0] = author;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    
    public Book(String name,Employee[] authors,double price,int qty){
        
        //authors = new Employee[100];
        this.authors = authors;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public void setPrice(double price){
        this.price = price;
    }  
    public void setQty(int qty){
        this.qty = qty;
    }
    
    
    
    public String getName(){
        return this.name;
    }
    public Employee[] getAuthors(){
        return this.authors;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQty(){
        return this.qty;
    }
    public String getAuthorsName(){
        String result = " {";
        int n =0;
        for (Employee author : authors) {
            n++;
            result +=String.valueOf(n) +"  "+ author.toStringBook();
        }
        result += "}";
        return result;
    }
    
    
    @Override
    public String toString(){
        String result = "Book: Name = " + this.name + " Authors = " + this.getAuthorsName() + " Price = " + this.price+" Qty = "+qty;
        return result;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + Arrays.deepHashCode(this.authors);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 31 * hash + this.qty;
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
        final Book other = (Book) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (this.qty != other.qty) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Arrays.deepEquals(this.authors, other.authors)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
    
}
