/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstore;

/**
 *
 * @author Darla
 */
//uses an interface for the State Design Pattern
public interface CustomerState {
    String getStatus(); // returns status name (Gold or Silver)
    void handleStateChange(Customer c); // handles transitions between states based on points
}
