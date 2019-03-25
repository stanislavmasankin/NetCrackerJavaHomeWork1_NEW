/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.util.Arrays;

/**
 *
 * @author Stas
 */
public class HomeWork1 {

    public static void main(String[] args) {
        Employee stas1,stas2,stas3;
        Book book;     
        Circle q;
        Rectangle w;
        MePoints e,r;
        
        q = new Circle();
        System.out.println("Задание 1 ");
        System.out.println("    q.toString() "+ q.toString());
        System.out.println("    q.hashCode) "+ q.hashCode());
        System.out.println();
        
        w =new Rectangle(123,23);
        System.out.println("Задание 2 "); 
        System.out.println("    w.toString()"+ w.toString());  
        System.out.println("    w.hashCode()"+ w.hashCode()); 
        System.out.println();
        
        stas1 = new Employee(1,10,"sd","sfsd");
        stas1.setGender("f");
        System.out.println("Задание 3 ");
        System.out.println("    stas1.toString()"+ stas1.toString());
        System.out.println("    stas1.hashCode()"+ stas1.hashCode());
        System.out.println();
        
        stas2 = new Employee(1,10,"Sts","Leas");
        stas3 = new Employee(1,10,"Sts","Leas");
        Employee[] stass = {stas1,stas2,stas3};
        book = new Book("X1",stas1,12,54);
        System.out.println("Задание 4 ");
        System.out.println("    book.toString() "+book.toString());        
        book = new Book("X2",stass,12,54);
        System.out.println("    book.toString() "+book.toString()+"// Масив имен");
        System.out.println("    book.getAuthors()   "+Arrays.toString(book.getAuthors()));
        System.out.println("    stas2.hashCode()   "+stas2.hashCode());
        System.out.println("    stas3.hashCode()   "+stas3.hashCode());
        System.out.println("    stas2.equals(stas3)   "+stas2.equals(stas3));
        System.out.println();
        
        e = new MePoints(10,10);
        r = new MePoints(30,2);
        System.out.println("Задание 5 ");
        System.out.println("    e.toString()    "+e.toString());
        System.out.println("    r.toString()    "+r.toString());
        System.out.println("    e.distance(r)"+ e.distance(r));
        System.out.println("    e.distance()"+ e.distance());
        System.out.println("    e.hashCode()"+ e.hashCode());
        System.out.println("    r.hashCode()"+ r.hashCode());
        System.out.println("    e.equals(r))"+ e.equals(r));
        System.out.println();
        
        MePoints a,s,d;
        a = new MePoints(0,0);
        s = new MePoints(0,3);
        d= new MePoints(4,0);
        MyTriangle f;
        f = new MyTriangle(a,s,d);
        
        System.out.println("Задание 6 ")  ;
        System.out.println("    f.toString()"+ f.toString()) ;
        System.out.println("    f.getPerimetr()"+f.getPerimetr())  ;
        System.out.println("    f.getTepr())"+f.getTepr())  ;
        System.out.println("    f.hashCode())"+f.hashCode())  ;

    }
    
}
