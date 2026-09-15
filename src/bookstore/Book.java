/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstore;

/**
 *
 * @author Darla
 */
//represents a book that has a name and a price
public class Book {
    private double price;
    private String name; // title
    
    //Constructor
    public Book(String name, double price)
    {
        this.price = price;
        this.name = name;
    }
    
    //returns the book name
    public String getName()
    {
        return name;
    }
    
    //returns the book price
    public double getPrice()
    {
        return price;
    }
    
    //this converts the book to string format to save this in the file
    @Override
    public String toString()
    {
        return name + "," + price; // matches file format
    }
}
