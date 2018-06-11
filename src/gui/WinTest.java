/*
자바언어로도 GUI(Graphic User Interface) 어플리케이션을 제작할 수 있다.
그리고 자바를 가장 잘할 수 있는 기회, 찰나이다!

모든 그래픽 프로그램은 윈도우상에서 실행되므로, 자바에서 윈도우를 띄워보자!
*/
package gui;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Color;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.CheckboxGroup;
import java.awt.TextArea;

class WinTest{
	public static void main(String[] args){
		Frame frame=new Frame();
		//컴포넌트가 너무 크게 만들어지는 문제를 해결하기 위해, 레이아웃을
		//적용한다.
		FlowLayout flow=new FlowLayout();
		frame.setLayout(flow);//레이아웃 적용



		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setTitle("메모장");
		//프레임은 디폴트로 보이지않는 속성을 가짐
		Button bt=new Button("나버튼");
		frame.add(bt);

		//텍스트 입력박스 생성
		TextField txt=new TextField("텍스트박스", 10);
		frame.add(txt);

		//배경색 설정
		Color c=new Color(0,255,0);
		frame.setBackground(c);
		
		//체크박스 생성
		Checkbox ch1=new Checkbox("낚시");
		Checkbox ch2=new Checkbox("여행");
		Checkbox ch3=new Checkbox("운동");
		Checkbox ch4=new Checkbox("독서");
		frame.add(ch1);
		frame.add(ch2);
		frame.add(ch3);
		frame.add(ch4);
		

		//html의 select문을 대신하는 Choice 이용
		Choice ch=new Choice();
		ch.add("사과");
		ch.add("딸기");
		ch.add("바나나");
		frame.add(ch);

		//라디오를 이용하여 남,녀 체크
		//Checkbox를 그룹화시켜야 한다.

		CheckboxGroup cg=new CheckboxGroup();
		Checkbox c1=new Checkbox("남", cg, true);
		Checkbox c2=new Checkbox("여", cg, false);
		
		frame.add(c1);
		frame.add(c2);

		//Textarea

		TextArea ta=new TextArea(30, 20);
		frame.add(ta);

			

	}

}

