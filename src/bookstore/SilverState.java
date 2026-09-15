/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstore;

/**
 *
 * @author Darla
 */

public class SilverState implements CustomerState {
    
    @Override
    public String getStatus() {
        return "Silver";
    }
    
    // check if customer should stay or be promoted to Gold status 
    @Override
    public void handleStateChange(Customer c){
        if(c.getPoints() >= 1000){
            c.setState(new GoldState()); //switches status to Gold 
        }
    }
}
