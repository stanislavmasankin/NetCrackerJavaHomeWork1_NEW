/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.util.Objects;


public class MyTriangle {
 MePoints v1,v2,v3;    

    public MyTriangle(MePoints v1, MePoints v2, MePoints v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }



    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        this.v1.x=x1;this.v1.y=y1;
        this.v2.x=x2;this.v2.y=y2;
        this.v3.x=x3;this.v3.y=y3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" + "v1=" + v1.toString() + ", v2=" + v2.toString() + ", v3=" + v3.toString() + '}';
    }
    
    public double getPerimetr(){
        double result = v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
        return result;
    }
    
    public String getTepr(){
        String result = "0";
        int[] L = {(int) v1.distance(v2),(int) v2.distance(v3),(int) v3.distance(v1)};
        int big;
        for(int i=0;i<L.length - 1;i++){            
            if(L[i]<L[i+1]){
                big = L[i];
                L[i] = L[i+1];
                L[i+1] = big;
                
            }
        }        
        if(L[0]*L[0]>=L[2]*L[2]+L[1]*L[1]){
            if(L[0]*L[0]==L[2]*L[2]+L[1]*L[1]){
                return "прямой";
            }else return "тупой";            
        }return "острый";      
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(toString());
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
        final MyTriangle other = (MyTriangle) obj;
        if (this.toString()!=other.toString()) {
            return false;
        }
        return true;
    }
    
    
    
}
