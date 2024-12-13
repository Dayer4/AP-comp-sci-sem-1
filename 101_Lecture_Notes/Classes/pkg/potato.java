/* 
    Lecture note example - Classes
*/
package pkg;

public class potato{
    //global vars
    String color;
    Boolean isEdible;
    double mass;
    String type;
    //constructor
    public Potato(){
        color = "brown";
        isEdible = true;
        mass = 170.5;
        type = "French Fry";
    }
    public Potato(String c, String t, double m){
        color =c;
        isEdile = false;
        type = t;
        mass = m;
    }
    //method
    public boolean getEdibility(){
        return isEdible;
    }
}