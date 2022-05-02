
/**
 * Write a description of class Tile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.lang.Math;

public class Tile implements Comparable
{
    // instance variables - replace the example below with your own
    private int xPos;
    private int yPos;
    public String name;
    public int f;

    /**
     * Constructor for objects of class Tile
     */
    public Tile(int x, int y, int startX, int startY, int goalX, int goalY)
    {
        xPos = x;
        yPos = y;
        name = new String(xPos + "," + yPos);
        f = calculateF(startX, startY, goalX, goalY);
    }

    @Override
    public int compareTo(Object dos){
        Tile two = (Tile)dos;
        return f - two.f;
    }
   

    private int calculateF(int sX, int sY, int gX, int gY){
        int g = Math.abs(sX - xPos) + Math.abs(sY - yPos);
        int h = Math.abs(gX - xPos) + Math.abs(gY - yPos);
        return g + h;
    }
    
}
