package com.javabasis.ch13inheritance;

/**
 * �̳е�����
 * 1����java��ֻ�����̳�
 * 		һ��Class����ͬʱ�̳ж��Class�����ǿ�����״���̳У����̳У�
 * 		һ��Class��һ�����Class�̳�
 * 2�����಻��ֱ�ӷ��ʸ����˽�г�Ա
 * 		���������ͨ��public��getter��setter�����ʸ����˽�г�Ա
 * @author Qiufan
 *
 */

class People{
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class Worker extends People{
	public void tell() {
		System.out.println(getAge());
	}
}

class PetWorker extends Worker{
	//�����̳��ǿ��Ե�
}

//class PetWorker2 extends Worker,Person{
//	//�����̳��ǲ������
//}

public class ExtendsDemo02 {

	public static void main(String[] args) {
		Worker w = new Worker();
		w.setAge(50);
		w.tell();
		
	}

}
