import java.util.Scanner;
import java.util.Random;

public class Main
{
    static String computer;
    static String user;
    
    public static void setComputer(){
        int counter;
        Random random =new Random();
        counter = random.nextInt(3);
        
        if(counter == 0) {
            computer = "rock"; 
        }
        else if (counter == 1) {
            computer = "paper";
        }
        else if (counter == 2) {
            computer = "scissor";
        }
    }
    
    public static void setUser() {
        Scanner input1 = new Scanner(System.in);
        
        System.out.println("Choose Rock, Paper or Scissor");
        user = input1.next();
    }
   
    public static void Main(String[] args){
        char resume = 'y';
        
      do{
        Scanner input2 = new Scanner(System.in);
        setUser();
        setComputer();
        System.out.println("The computer chooses "+ computer);
        
        String decision = judge();
        System.out.println(decision);
        
        System.out.println("Do you want to play again? (Press Y to continue)");
        resume = input2.next().charAt(0);
        System.out.println();
        
       } while(resume == 'y');
       
        System.out.println("The program ended, You can quit now");   
    }
    
    public static String judge() {
        String winner1 = "The Computer Wins";
        String winner2 = "The User Wins";
        String draw = "Its a DRAW!!";
        String error = "An Error occured, Choose an Entry and please check the spellings";
        
        if(computer.equalsIgnoreCase(user)) {
            return draw;
        }
        
        else if((computer.equals("rock") && user.equalsIgnoreCase("scissor")) || (computer.equals("paper") && user.equalsIgnoreCase("rock")) || (computer.equals("scissor") && user.equalsIgnoreCase("paper"))) {
            return winner1;
        }
        
        else if((computer.equals("paper") && user.equalsIgnoreCase("scissor")) || (computer.equals("scissor") && user.equalsIgnoreCase("rock")) || (computer.equals("rock") && user.equalsIgnoreCase("paper"))){
            return winner2;
        }
        
        else{
            return error;
        }
    }
}

