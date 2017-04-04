import java.util.*;
public class iff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		System.out.println("주사위게임을 시작합니다.");
		System.out.println("내가 주사위를 던집니다.");
		int my = r.nextInt(6)+1;
		System.out.println("나온 주사위는 "+my);
		System.out.println("컴퓨터가 주사위를 던집니다");
		int com = r.nextInt(6)+1;
		System.out.println("나온 주사위는 "+com);
		if(my>com)
			System.out.println("빙고!!!  돈을 땄습니다.");
		else if (my<com)
			System.out.println("이런, 돈을 모두 잃었습니다.");
		else
			System.out.println("비겼습니다");
		
		System.out.println("가위바위보 게임을 시작합니다");
		System.out.println("가위(1), 바위(2), 보(3) 을 선택하세요.");
		Random a = new Random();
		int mine = a.nextInt(3)+1;
		int coms = a.nextInt(3)+1;
	
		if((mine==1)&&(coms==1)) {
			System.out.println("컴퓨터는 가위, 나는 가위를 냈습니다.");
			System.out.println("비겼습니다.");
		}
		else if((mine==1)&&(coms==2)){
			System.out.println("컴퓨터는 바위, 나는 가위를 냈습니다.");
			System.out.println("컴퓨터가 이겼습니다.");
		}
		else if((mine==1)&&(coms==3)){
			System.out.println("컴퓨터는 보, 나는 가위를 냈습니다.");
			System.out.println("내가 이겼습니다.");
		}
		else if((mine==2)&&(coms==1)){
			System.out.println("컴퓨터는 가위, 나는 바위를 냈습니다.");
			System.out.println("내가 이겼습니다.");
		}
		else if((mine==2)&&(coms==2)){
			System.out.println("컴퓨터는 바위, 나는 바위를 냈습니다.");
			System.out.println("비겼습니다.");
		}
		else if((mine==2)&&(coms==3)){
			System.out.println("컴퓨터는 보, 나는 바위를 냈습니다.");
			System.out.println("컴퓨터가 이겼습니다.");
		}
		else if((mine==3)&&(coms==1)){
			System.out.println("컴퓨터는 가위, 나는 보를 냈습니다.");
			System.out.println("컴퓨터가 이겼습니다.");
		}
		else if((mine==3)&&(coms==2)){
			System.out.println("컴퓨터는 바위, 나는 보를 냈습니다.");
			System.out.println("내가 이겼습니다.");
		}
		else if((mine==3)&&(coms==3)){
			System.out.println("컴퓨터는 보, 나는 보를 냈습니다.");
			System.out.println("비겼습니다.");
		}
		
		
		
				
	}

}
