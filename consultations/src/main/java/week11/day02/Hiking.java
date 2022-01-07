package week11.day02;

import java.util.List;

public class Hiking {


    public int getPlusElevation(List<Integer> elevations){
        int fullElevation = 0;

        for(int i = 1; i<elevations.size();i++){
            fullElevation+=Math.max(elevations.get(i)-elevations.get(i-1),0);
        }
        return fullElevation;
    }
}
