/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

class starter{
    public static void main(String args[]) {
        potato fr = new Potato();
        potato sp = new Potato("blue", "baked", 100);
        System.out.println(sp.getEdibility());
	}
}