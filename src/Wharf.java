/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathias
 */
public class Wharf {
    private int docks, currentDock;
    private Boat[] boats;
    private boolean full;
    
    /**
     * creates a wharf
     * @param docks the amount of docks in the wharf
     */
    public Wharf(int docks) {
        this.docks = docks;
        boats = new Boat[docks];
        full = false;
        currentDock = 0;
    }

    /**
     * returns all the boats in the wharf
     * @return a Boat
     */
    public Boat[] getBoats(){
        return boats;
    }
    
    /**
     * returns a spesific boat in the wharf
     * @param index where the boat is in the wharf
     * @return a Boat
     */
    public Boat getBoat(int index){
        return boats[index];
    }
    
    /**
     * adds a boat to the wharf
     * @param boat the boat to be added
     */
    public void addBoat(Boat boat){
        boats[currentDock]=boat;
        currentDock++;
    }
    
    /**
     * checks if the current dock is full and sets full to true/false
     */
    public void isFull(){
        if (currentDock==docks) {
            full = true;
        }
        else{
            full = false;
        }
        
    }
    
    /**
     * runs isFull() and returns full
     * @return true/false
     */
    public boolean getFull(){
        isFull();
        return full;
    }
    
    /**
     * 
     * @return amount of docks in the wharf
     */
    public int getDocksAmount() {
        return docks;
    }
    
    public boolean removeBoat(int dock){
        boolean boatRemoved = false;
        for (int i = 0; i < currentDock; i++) {
            if (boats[i].getDock() == dock) {
                System.out.println("kom hit");
                boatRemoved = true;
                break;
            }
        }
        return boatRemoved;
    }
    
    
    
    
    
}
