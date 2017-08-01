package com.javalec.ave;

import java.util.Scanner;

public class AverageClass {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 점수를 입력 하세요. ");
		int kor = scanner.nextInt();		// 국어 점수
		System.out.print("영어 점수를 입력 하세요. ");
		int eng = scanner.nextInt();		// 영어 점수
		System.out.print("수학 점수를 입력 하세요. ");
		int met = scanner.nextInt();		// 수학 점수
		
		double ave = (kor + eng + met) / 3;
		
		System.out.println("평균 점수는 " + ave + "입니다.");
		
		if(kor > ave) {
			System.out.println("국어 점수는 평균보다 높습니다.");
		} else if (kor < ave){
			System.out.println("국어 점수는 평균보다 낮습니다.");
		} else {
			System.out.println("국어 점수는 평균 입니다.");
		}
		
		if(eng > ave) {
			System.out.println("영어 점수는 평균보다 높습니다.");
		} else if (eng < ave){
			System.out.println("영어 점수는 평균보다 낮습니다.");
		} else {
			System.out.println("영어 점수는 평균 입니다.");
		}
		
		if(met > ave) {
			System.out.println("수학 점수는 평균보다 높습니다.");
		} else if (met < ave){
			System.out.println("수학 점수는 평균보다 낮습니다.");
		} else {
			System.out.println("수학 점수는 평균 입니다.");
		}
		
	}
}
