public class Week{
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter \n 1. for Monday \n 2. for Tuesday");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            default:
            System.out.println("Wrong choice.");
        }
    }
}
