package Homework;

import java.util.Date;

public class Homework3_93 {
	public static void main(String[] args) {
		long time = 10000;//用于记录最新的流逝时间
				
		Date date = new Date(time);
		printDate(time, date);
		time *= 10;
		//通过循环设置新的流逝时间并显示日期
		for(int i = 0; i < 7; i++) {
			date.setTime(time);
			printDate(time, date);
			time *= 10;
		}
				
	}
			
//用于显示日期
	public static void printDate(long time, Date date) {
		System.out.println(time + ": " + date.toString());
	}

}

	


