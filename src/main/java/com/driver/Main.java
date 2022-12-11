
package com.driver;
import java.util.*;
public class Main {
    public static class Product{
        public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Product P = new Product();
        P.product(input.nextInt(),input.nextInt());
        P.product(input.nextInt(),input.nextInt(),input.nextInt());
        P.product(input.nextDouble(),input.nextDouble());
    }
}