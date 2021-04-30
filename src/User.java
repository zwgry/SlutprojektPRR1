
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathias
 */
public class User {
    private int userId, phone;
    private String uName, fName, lName, password;
    private ArrayList<Boat> boats = new ArrayList<>();

    public User(int userId, int phone, String uName, String fName, String lName, String password) {
        this.userId = userId;
        this.phone = phone;
        this.uName = uName;
        this.fName = fName;
        this.lName = lName;
        this.password = password;
    }

    /**
     * sorts the users boats by dock
     */
    public void sortDock(){
        for (int m = boats.size()-1; m > 0; m--) {
            for (int n = 0; n < m; n++) {
                if (boats.get(n).getDock() > boats.get(n+1).getDock()) {
                    Boat temp = boats.get(n);
                    boats.set(n, boats.get(n+1));
                    boats.set(n+1, temp);
                }  
            }
        }
    }
    
    /**
     * sorts the users boats by length
     */
    public void sortLength(){
        for (int m = boats.size()-1; m > 0; m--) {
            for (int n = 0; n < m; n++) {
                if (boats.get(n).getLength() > boats.get(n+1).getLength()) {
                    Boat temp = boats.get(n+1);
                    boats.set(n+1, boats.get(n));
                    boats.set(n, temp);
                } 
            }
        }
    }
    
    /**
     * Adds a boat to the user
     * @param length the boats length
     * @param width the boats width
     * @param dock where to boat docks when in wharf
     * @param type type of boat
     */
    public void addBoat(double length, double width, int dock, String type){
        int memberId = getUserId();
        Boat boat = new Boat(length, width, dock, memberId, type);
        boats.add(boat);
    }
    
    /**
     * removes a boat from the user
     * @param dockSearched the dock of the boat
     * @return true/false if the boat was removed;
     */
    public boolean removeBoat(int dockSearched){
        boolean boatRemoved = false;
        
        for (int i = 0; i < boats.size(); i++) {
            if (boats.get(i).getDock() == dockSearched) {
                boats.remove(i);
                boatRemoved = true;
            }
        }
        return boatRemoved;
    }
    
    /**
     * 
     * @return the amount of boats the users has registerd
     */
    public int getBoatsAmount(){
        return boats.size();
    }
    
    public Boat getBoat(int i){
        return boats.get(i);
    }
    
    public int getUserId() {
        return userId;
    }

    public int getPhone() {
        return phone;
    }

    public String getUName() {
        return uName;
    }

    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Boat> getBoats() {
        return boats;
    }

    public void setUName(String uName) {
        this.uName = uName;
    }

    
    
    @Override
    public String toString() {
        return "Id: " +getUserId() + ", Användare: " + uName + ", Namn: " + fName+ " " + lName + ", Antal båtar: " + getBoatsAmount();
    }
    
    
    
}
