import java.util.*;

public class StepTracker{
    int totalSteps;
    int days;
    int activeDays;
    public StepTracker(){
        steps = 0;
        days = 0;
        activeDays = 0;
    }
    public StepTracker(int x, int y){
        steps = x;
        days = y;
        if(x >= 10000){
            activeDays++;
        }
    }
    public int averageSteps(){
        a = totalSteps/days
        return a;
    }
    public int activeDays(){
        return activeDays;
    }
    public void addDailySteps(int a){
        processNewRatings(a); 
    }
    
    
}