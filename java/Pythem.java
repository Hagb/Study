	/*
	 * �����������ڻ������㹴������
	 * ���ڹ����������������аٶ�
	 * 
	 * ע�������еļ��㹫ʽ�ɸ������ṩ
	 * 
	 * ȱ�㣺���ܼ���С��(������)
	 */

import java.util.Scanner;	//����java.util���е�Scanner��	ע��Scanner��Ϊ"ɨ����"

public class Pythem {
	public static void main(String[] args) {
		System.out.println("����������");
		Scanner input=new Scanner(System.in);	//����һ����Ϊinput�Ķ���
		
		while (true){	//while��ѭ�����ڶ�ν�������
			System.out.println();
			System.out.print("������ֱ���������е�ֱ�Ǳ�a��");	//��ʾ�û�������Ϣ
			int a=input.nextInt();	//���ն�ֱ�Ǳ���ֵ
			int b = 0, c = 0;	//���峤ֱ�Ǳ��Լ�б��
			
			if (a < 3){	//�ж϶�ֱ�Ǳ�a�Ƿ����Ҫ��
				System.out.println("���ݴ���ֱ�Ǳ�a��С");
				continue;	//ֱ�ӽ�����һ��ѭ��
			}	else if (a % 2 == 0){	//�ж϶�ֱ�Ǳ�����������ż��
				int n = a / 2;	//��ʱΪ����˼��������˱����Ա��ڼ���
				b = (n * n) - 1;
				c = (n * n) + 1;
				System.out.println("***ֱ�Ǳ�aΪ��"+a);
				System.out.println("***ֱ�Ǳ�bΪ��"+b);
				System.out.println("***б��cΪ��"+c);
			}	else if (a % 2 == 1){
				int m = (a - 1) / 2;	//��;ͬ����n
				b = (m * 2)*(m + 1);
				c = b + 1;
				System.out.println("***ֱ�Ǳ�aΪ��"+a);
				System.out.println("***ֱ�Ǳ�bΪ��"+b);
				System.out.println("***б��cΪ��"+c);
			}
		}
	}
}
