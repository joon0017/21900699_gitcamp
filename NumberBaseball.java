import java.util.*;

public class NumberBaseball {
    
    static int [] answer = {1,2,3};

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = new String();

        System.out.println("숫자 야구 게임을 시작합니다.");
        int c= 0;
        while(c < 3){
                input = scan.nextLine();
                if(check(input)){
                    break;
                };
                System.out.println("잘못된 입력입니다. 다시 입력하세요: ");
                c++;
        }

        checkStrike(input);
        checkBall(input);
    }

    public static boolean check(String input){
        if(input.length()==3 ){

            try{
                Integer.parseInt(input);
                return true;
            } catch(Exception e){
                return false;
            }
        }
        return false;
    }

    static int checkStrike(String input){
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if(answer[i] == Integer.parseInt(input.charAt(i)+"")){
                count++;
            }
        }

        System.out.println(count + " 스트라이크");

        return count;
    }

    static int checkBall(String input){
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(answer[i] == Integer.parseInt(input.charAt(j)+"" )&& i!=j){
                    count++;
                }
            }
            
        }
        
        System.out.println(count + " 볼");
        return count;

    }

}
