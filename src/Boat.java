/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathias
 */
public class Boat {
    private double length, width; 
    private int dock, ownerId;
    private String type;

    public Boat(double length, double width, int dock, int ownerId, String type) {
        this.length = length;
        this.width = width;
        this.dock = dock;
        this.ownerId = ownerId;
        this.type = type;
    }    
    
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public int getDock() {
        return dock;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public String getType() {
        return type;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setDock(int dock) {
        this.dock = dock;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Längd: " + length + ", Bredd: " + width + ", Typ: " + type+ ", Ägare: " + ownerId;
    }

    public String toDisplay(){
        return "Längd: " + length + ", Bredd: " + width + ", Typ: " + type;
    }
    
    
    
    
}
