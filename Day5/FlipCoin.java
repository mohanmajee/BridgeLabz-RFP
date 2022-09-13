package Day5;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number how many times you want to flip a coin");
        int n = sc.nextInt();
        int head =0,tail=0;
        for(int i=0;i<n;i++){
            if(Math.random()<0.5){
                head++;
            }else{
                tail++;
            }
        }
        int headper = (head*100)/n;
        int tailper = (tail*100)/n;
        System.out.println("Head Percentage :"+headper+"%");
        System.out.println("Tail Percentage :"+tailper+"%");
        System.out.println(head);
        System.out.println(tail);

	}

}
