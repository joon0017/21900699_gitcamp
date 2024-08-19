import java.util.*;

public class NumberFormat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // long input = 0;
        String input = new String();

        
        System.out.println("양의 정수를 입력하세요: ");
        int c= 0;
        while(c < 3){
                input = scan.nextLine();
                if(check(input)){
                    break;
                };
                System.out.println("잘못된 입력입니다. 다시 입력하세요: ");
                c++;
        }
        
        printNumber(input);
    }

    public static boolean check(String input){
        if(input.length()<=20 ){

            try{
                Long.parseLong(input);
                return true;
            } catch(Exception e){
                return false;
            }
        }
        return false;
    }

    public static void printNumber(String input){

        System.out.print("입력한 값은 ");
        // int length = input.length();
        int check = input.length()%3;

        for (int i = 0; i < input.length(); i++) {
            
            if(check == i && i!=0){
                System.out.print(","); 
            }
            else if ((i - check) % 3 == 0 && i != 0){
                System.out.print(",");
            }
            System.out.print(input.charAt(i));
        }

        System.out.print("입니다.");

    }
}
