/*
�ڹپ��ε� GUI(Graphic User Interface) ���ø����̼��� ������ �� �ִ�.
�׸��� �ڹٸ� ���� ���� �� �ִ� ��ȸ, �����̴�!

��� �׷��� ���α׷��� ������󿡼� ����ǹǷ�, �ڹٿ��� �����츦 �������!
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
		//������Ʈ�� �ʹ� ũ�� ��������� ������ �ذ��ϱ� ����, ���̾ƿ���
		//�����Ѵ�.
		FlowLayout flow=new FlowLayout();
		frame.setLayout(flow);//���̾ƿ� ����



		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setTitle("�޸���");
		//�������� ����Ʈ�� �������ʴ� �Ӽ��� ����
		Button bt=new Button("����ư");
		frame.add(bt);

		//�ؽ�Ʈ �Է¹ڽ� ����
		TextField txt=new TextField("�ؽ�Ʈ�ڽ�", 10);
		frame.add(txt);

		//���� ����
		Color c=new Color(0,255,0);
		frame.setBackground(c);
		
		//üũ�ڽ� ����
		Checkbox ch1=new Checkbox("����");
		Checkbox ch2=new Checkbox("����");
		Checkbox ch3=new Checkbox("�");
		Checkbox ch4=new Checkbox("����");
		frame.add(ch1);
		frame.add(ch2);
		frame.add(ch3);
		frame.add(ch4);
		

		//html�� select���� ����ϴ� Choice �̿�
		Choice ch=new Choice();
		ch.add("���");
		ch.add("����");
		ch.add("�ٳ���");
		frame.add(ch);

		//������ �̿��Ͽ� ��,�� üũ
		//Checkbox�� �׷�ȭ���Ѿ� �Ѵ�.

		CheckboxGroup cg=new CheckboxGroup();
		Checkbox c1=new Checkbox("��", cg, true);
		Checkbox c2=new Checkbox("��", cg, false);
		
		frame.add(c1);
		frame.add(c2);

		//Textarea

		TextArea ta=new TextArea(30, 20);
		frame.add(ta);

			

	}

}

