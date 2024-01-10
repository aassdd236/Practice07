package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		Shape s = new Shape("빨강"); //shape가 추상 클래스여서 객체 생성이 안 됨
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		//sr1의 가로크기 출력
		System.out.println("sr1"+sr1.toString());
	}
}

	
	