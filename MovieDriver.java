import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		    //Create a three String variables:options,title,rating
			String options;
			String title;
			String rating;
			// Create one int variable:tickets
			int tickets;
			
			//Create a do while loop to let the user input multiple movies
			do {
			//Create a Scanner object called user_Input and a Movie object called movie
			Scanner user_Input=new Scanner(System.in);
			Movie movie=new Movie();
			
			// Prompt the user to enter the title of a movie 
			System.out.println("Enter the name of a movie ");
			//Read in the title of the movie
			title=user_Input.nextLine();
			//set the title of the movie from the user input
			movie.setTitle(title);
			
			//Prompt the user to enter the movie’s rating
			System.out.println("What would you rate that movie?");
			//Read in the rating of the movie
			rating=user_Input.nextLine();
			//set the rating of the movie from the user input
			movie.setRating(rating);
			
			//Prompt the user to enter the number of tickets sold 
			System.out.println("Enter the number of tickets sold for this movie");
			//Read in the tickets of the movie
			tickets=user_Input.nextInt();
			//set the tickets of the movie from the user input
			movie.setSoldTickets(tickets);
			
			//Show all the Movie information the program got from the user
			System.out.println(movie.toString());
			
			//Give the user the option to enter another movie or not
			System.out.println("Do you want to enter another? (y or n)");
			//Read in the option
			options=user_Input.next();
			
			//While the option is not (y or n) display invalid message to the user
			while(!options.toLowerCase().equals("y") && !options.toLowerCase().equals("n")  ) {
				System.out.println("Invalid respones! Try again");
				options=user_Input.next();
			
			}
			
			}while(options.equalsIgnoreCase("y"));
			
			//Say goodbye to the user 
			System.out.println("Goodbye");
	}
}
