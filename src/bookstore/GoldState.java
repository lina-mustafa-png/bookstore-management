/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstore;

/**
 *
 * @author Darla
 */

public class GoldState implements CustomerState {

    @Override 
    public String getStatus(){
        return "Gold"; // points >= 1000
    }
    
    @Override
    //checks if the customer should be demoted back to Silver state
    public void handleStateChange(Customer c){
        if (c.getPoints() < 1000){
            c.setState(new SilverState()); // switches the status to Silver
        }   
    }   
}
