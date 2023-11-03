import java.util.Scanner;
class MarksOutOfBoundException extends Exception{
    public MarksOutOfBoundException(String message){
        super(message);
    }
}
public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int mrks= scanner.nextInt();
        
        try{
            if(mrks<0 || mrks>100){
                throw new MarksOutOfBoundException("Marks should be between 0 and 100!");
        }
        System.out.println("Entered marks are valid: " + mrks);
    } catch (MarksOutOfBoundException e){
        System.out.println("Error: "+ e.getMessage());
        
    } 
}
}
