import java.util.Random;
import java.util.Scanner;

class CoinToss{
    public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Who are you?");
	System.out.print("> ");
	String  name = scan.nextLine();
	System.out.println("Hello, "+ name +"!");
	scan.close();
	
	Random rand = new Random();
	int count_head = 0, count_tail = 0;

	System.out.println("Tossing a coin...");

	for(int i=1 ; i<=3 ; i++){
	    System.out.print("Round "+ i +": ");
	    
	    int num = rand.nextInt(2);
	    if(num == 0) {
		count_head++;
		System.out.println("Heads");
	    }else{
		count_tail++;
		System.out.println("Tails");
	    }
	}

	System.out.println("Heads: "+ count_head +", Tails: "+ count_tail);
    }
}
