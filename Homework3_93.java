package Homework;

import java.util.Date;

public class Homework3_93 {
	public static void main(String[] args) {
		long time = 10000;//���ڼ�¼���µ�����ʱ��
				
		Date date = new Date(time);
		printDate(time, date);
		time *= 10;
		//ͨ��ѭ�������µ�����ʱ�䲢��ʾ����
		for(int i = 0; i < 7; i++) {
			date.setTime(time);
			printDate(time, date);
			time *= 10;
		}
				
	}
			
//������ʾ����
	public static void printDate(long time, Date date) {
		System.out.println(time + ": " + date.toString());
	}

}

	


