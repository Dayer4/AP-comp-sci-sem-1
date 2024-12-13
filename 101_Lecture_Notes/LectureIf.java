/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("Skibidi sigma slicer fanum tax toilet tries to fanum tax Ethan Lima");
        System.out.println("You have 3 options for how this happens.");
        System.out.println("Story 1: The Unexpected Reunion");
        System.out.println("Story 2: The Tax Consultation Adventure");
        System.out.println("Story 3: The Financial Fair");
        int answer = sc.nextInt();
        if(answer == 1){
            
            System.out.println("Skibidi Sigma Slicer Fanum Tax Toilet had always admired Fanum Tax Ethan Lima, a legendary figure known for his innovative approaches to finance and his quirky sense of humor. One sunny afternoon, Skibidi decided to make the trip to meet Ethan at a popular café where he was known to hold talks.\n When Skibidi arrived, he was nervous but excited. The café was buzzing with fans eager to hear Ethan speak. As he sat down, he overheard a group discussing the latest trends in budgeting and taxes. Inspired, Skibidi suddenly had an idea for a comedic skit about managing finances using toilet humor! \n When Ethan finally took the stage, Skibidi gathered his courage and shouted out his skit idea. To his surprise, Ethan laughed and invited him to join him on stage. Together, they performed an impromptu routine about “flushing away debt,” captivating the audience. \n By the end of the event, Skibidi had not only met his idol but also made a lasting impression. The two became friends, and Skibidi learned that humor could be a powerful tool in tackling even the most serious subjects.");
            
        }else if(answer == 2){
        
            System.out.println("Skibidi Sigma Slicer Fanum Tax Toilet found himself in a financial bind and decided it was time to seek help from Fanum Tax Ethan Lima, a renowned tax advisor. Skibidi, not known for his financial savvy, was a bit anxious about the meeting. \n Arriving at Ethan’s office, Skibidi was greeted by a friendly receptionist and a waiting room filled with quirky tax-themed decor. When Ethan finally emerged, he was warm and approachable, putting Skibidi at ease. \n During their consultation, Skibidi shared his struggles with budgeting and filing taxes. Ethan, with his trademark humor, explained complex tax concepts in a way that made them easy to understand. He even incorporated toilet jokes to keep Skibidi engaged. \n By the end of the session, Skibidi left not only with a solid tax plan but also a newfound confidence in managing his finances. Inspired, he decided to start a vlog sharing his journey, blending financial advice with humor—thanks to Ethan’s influence.");
            
	    }else if(answer == 3){
	        
            System.out.println("Skibidi Sigma Slicer Fanum Tax Toilet heard about a Financial Fair organized by Fanum Tax Ethan Lima, where attendees could learn about money management in a fun and engaging way. Excited to join, Skibidi prepared a quirky presentation titled The Squeaky Clean Guide to Saving. \n At the fair, Skibidi set up his booth decorated with toilet-themed visuals and props. As attendees approached, he used toilet humor to discuss budgeting and saving strategies, drawing laughter from the crowd. \n Ethan noticed Skibidi’s unique approach and invited him to participate in a panel discussion. Together, they talked about breaking down financial barriers and making money management accessible to everyone. \n The fair was a huge success, and Skibidi's infectious enthusiasm left a lasting impression on the audience. Inspired by the experience, he decided to collaborate with Ethan on future projects, blending humor and finance to help others navigate their financial journeys with a smile.");
        
	    }else{
	        System.out.println("choose 1, 2 , or 3 >:(");
	    };
	    
	}
}