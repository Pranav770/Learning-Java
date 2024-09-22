import java.util.Scanner;
public class cwh_18_elseif {
    public static void main(String[]args){
//        String var="Pranav";
//
//        switch (var) {
//            case "Pranav" ->System.out.println("You are going to be an Adult!");
//            case "Shreeram"-> System.out.println("You are going to join a Job!");
//            case "Ssybaka"->System.out.println("You are going to get retired!");
//            default-> System.out.println("Enjoy Your life");
//        }
//        System.out.println("Thanks for using my Java code");
       int age;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();
        if(age>56) {
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age >36){
            System.out.println("You are semi semi-experienced!");
        }
        else{
            System.out.println(
                    "You are not experienced"
            );
//            if (age>2){
//                System.out.println("You are not a baby");
//            }
        }
    }
}
