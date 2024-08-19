import java.util.*;

public class NumberFormat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = 0;

        
        System.out.println("양의 정수를 입력하세요: ");
        int c= 0;
        while(c < 3){
            try{
                input = Integer.parseInt(scan.nextLine());
                break;
            }
            catch(Exception e){
                System.out.println("양의 정수를 입력하세요: ");
                c++;
            }
        }

        printNumber(input);



        System.out.println("입력한 값은 " + input + "입니다.");
    }

    public static void printNumber(int input){
        
    }
}
