
/**
 * Write a description of class PriorityQueueTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class PriorityQueueTester
{
    public static void main(String[] args){
        int startX = 0;
        int startY = 0;
        int goalX = 5;
        int goalY = 5;
        PriorityQueue<Tile> pq = new PriorityQueue<Tile>();
        Tile[][] tileMap = new Tile[6][6];
        
        for(int i = 0; i < tileMap.length; i++){
            for(int j = 0; j < tileMap[i].length; j++){
                tileMap[i][j] = new Tile(i, j, startX, startY, goalX, goalY);
                pq.offer(tileMap[i][j]);
            }
        }
        
        while(pq.size() > 0){
            System.out.println(pq.poll().name);
            
        }
        
        
    }
    
    
}
