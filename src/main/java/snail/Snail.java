package snail;

import java.awt.*;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by lyszkows on 18/10/2016.
 */
public class Snail {

    public int [] solution(int N){
        Queue directions = new ArrayBlockingQueue(4);
        directions.add("N");
        directions.add("W");
        directions.add("S");
        directions.add("E");
        int stepsLength = 1;
        int stepsCount = 0;
        Stack pointsTraversed = new Stack();
        int x = 0;
        int y = 0;

        for(int i=0; i<N ;++i){
            if(stepsCount==2){
                ++stepsLength;
                stepsCount = 0;
            }

            if(directions.peek().equals("N")){
                directions.add(directions.poll());
                ++stepsCount;
                y = y+stepsLength;
                pointsTraversed.add(new Point(x,y));
                continue;
            }
            if(directions.peek().equals("W")){
                directions.add(directions.poll());
                ++stepsCount;
                x = x-stepsLength;
                pointsTraversed.add(new Point(x,y));
                continue;
            }
            if(directions.peek().equals("S")){
                directions.add(directions.poll());
                ++stepsCount;
                y = y-stepsLength;
                pointsTraversed.add(new Point(x,y));
                continue;
            }
            if(directions.peek().equals("E")){
                directions.add(directions.poll());
                ++stepsCount;
                x = x + stepsLength;
                pointsTraversed.add(new Point(x,y));
                continue;
            }

        }









        return new int [2];
    }
}
