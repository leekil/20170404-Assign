import java.util.*;
public class iff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		System.out.println("�ֻ��������� �����մϴ�.");
		System.out.println("���� �ֻ����� �����ϴ�.");
		int my = r.nextInt(6)+1;
		System.out.println("���� �ֻ����� "+my);
		System.out.println("��ǻ�Ͱ� �ֻ����� �����ϴ�");
		int com = r.nextInt(6)+1;
		System.out.println("���� �ֻ����� "+com);
		if(my>com)
			System.out.println("����!!!  ���� �����ϴ�.");
		else if (my<com)
			System.out.println("�̷�, ���� ��� �Ҿ����ϴ�.");
		else
			System.out.println("�����ϴ�");
		
		System.out.println("���������� ������ �����մϴ�");
		System.out.println("����(1), ����(2), ��(3) �� �����ϼ���.");
		Random a = new Random();
		int mine = a.nextInt(3)+1;
		int coms = a.nextInt(3)+1;
	
		if((mine==1)&&(coms==1)) {
			System.out.println("��ǻ�ʹ� ����, ���� ������ �½��ϴ�.");
			System.out.println("�����ϴ�.");
		}
		else if((mine==1)&&(coms==2)){
			System.out.println("��ǻ�ʹ� ����, ���� ������ �½��ϴ�.");
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
		else if((mine==1)&&(coms==3)){
			System.out.println("��ǻ�ʹ� ��, ���� ������ �½��ϴ�.");
			System.out.println("���� �̰���ϴ�.");
		}
		else if((mine==2)&&(coms==1)){
			System.out.println("��ǻ�ʹ� ����, ���� ������ �½��ϴ�.");
			System.out.println("���� �̰���ϴ�.");
		}
		else if((mine==2)&&(coms==2)){
			System.out.println("��ǻ�ʹ� ����, ���� ������ �½��ϴ�.");
			System.out.println("�����ϴ�.");
		}
		else if((mine==2)&&(coms==3)){
			System.out.println("��ǻ�ʹ� ��, ���� ������ �½��ϴ�.");
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
		else if((mine==3)&&(coms==1)){
			System.out.println("��ǻ�ʹ� ����, ���� ���� �½��ϴ�.");
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
		else if((mine==3)&&(coms==2)){
			System.out.println("��ǻ�ʹ� ����, ���� ���� �½��ϴ�.");
			System.out.println("���� �̰���ϴ�.");
		}
		else if((mine==3)&&(coms==3)){
			System.out.println("��ǻ�ʹ� ��, ���� ���� �½��ϴ�.");
			System.out.println("�����ϴ�.");
		}
		
		
		
				
	}

}
