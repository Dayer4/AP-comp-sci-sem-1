package pkg;

public class Movie{
    String name;
	double rating;
	int numRatings;
	int revenue;
	public Movie(){
	    name = "Avengers";
	    rating = 8.8;
	    numRatings = 33;
	    revenue = 623357910;
	}
	public Movie(String name, double rating, int numRatings, int renevue){
	    this.name = name;
	    this.rating = rating;
	    this.numRatings = numRatings;
	    this.revenue = revenue;
	}
	public void movieToString(){
	    System.out.println("Movie: " + name);
	    System.out.println("Rating: " + rating);
	    System.out.println("Number of ratings: " + numRatings);
	    System.out.println("Revenue: " + revenue);
	    System.out.println("                                     ");
	}
	public String getMovieName(){
	    return name;
	}
	public int getRevenue(){
	    return revenue;
	}
	public double addRating(double newRating){
	    this.rating = ((this.rating * numRatings) + newRating )/ (numRatings + 1);
	    return rating;
	}
	public int revenueToString(){
	    return revenue;
	}
	public double getRating(){
	    return rating;
	}
	public boolean compareRatings(Movie x){
	    if(this.rating > x.getRating()){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
}
