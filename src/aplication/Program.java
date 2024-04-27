package aplication;

import java.util.Date;

import model.Department;
import model.Seller;

public class Program {
    public static void main(String[] args){
        
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(12,"Gary","gary@outlook.com", new Date(), 3200.0, obj);

        System.out.println(obj);
        System.out.println(seller);

    }
}
