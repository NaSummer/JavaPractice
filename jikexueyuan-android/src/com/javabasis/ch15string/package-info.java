/**
 * ��Ҫ
 * 	String�ַ���
 * 	String�ַ������÷���
 * 	StringBuffer
 * 	StringBuilder
 * 
 * һ��String�ַ���
 * 	1��ʵ����String����(StringDemo01.java)
 * 		ֱ�Ӹ�ֵ
 * 		ʹ�ùؼ���new
 * 			new String�Ļ����ڶ��ڴ��д��������ַ���������һ��û�б�ָ�����������õģ��ȴ�������
 * 				ԭ�򣺡�new String("hello")��������彫ռ��һ�����ڴ�(2)��
 * 					�����еġ�hello��������ռ��һ�����ڴ�(1)�������ݣ�Ȼ���ڴ��ݸ����ڴ�(2)
 * 			���ڶ��ڴ濼�ǣ�����ֱ�Ӹ�ֵ��ʵ����String��
 * 	2��String���ݵıȽ�(StringDemo02.java)
 * 		���������м���ֻ��equals���Ƚ��ַ���
 * 	3���ַ��������ݲ��ɸ���(StringDemo03.java)
 * 
 * ����String�ַ������÷���
 * 	1���ַ������ȣ�length()����(StringDemo04.java)
 * 	2���ַ���ת�������飺toCharArray()����(StringDemo04.java)
 * 	3�����ַ�����ȡ��ָ��λ�õ��ַ���charAt()����(StringDemo04.java)
 * 		�����е������Ǵ�0��ʼ�����ģ�����7����������ַ����ĵڰ˸��ַ�
 * 	4���ַ�����byte�����ת����getBytes()
 * 	5������ַ����д��ڵ��ַ���indexOf()
 * 		���ص�һ�γ��ֵ�λ�ã����û�з���-1
 * 	6��ȥ���ַ�����ǰ��ո�trim()
 * 	7�����ַ�����ȡ�����ַ�����subString()
 * 	8����Сдת����toLowerCase() toUpperCase()
 * 	9���ж��ַ����Ŀ�ͷ��β�ַ���endsWith() startWith()
 * 	10���滻String�ַ����е�һ���ַ���replace()
 * 
 * ����StringBuffer
 * 	1����ʶStringBuffer(StringBufferDemo01.java)
 * 		������������Ҳ�ǲ����ַ�����������String��ͬ��StringBuffer�ǿ��Ը��ĵ�
 * 		StringBuffer��һ�������࣬����ͨ��ʵ�������в���
 * 	2��StringBuffer���÷���
 * 		append()
 * 		insert()
 * 		replace()
 * 		indexOf()
 * 	3��StringBuffer��Ӧ��(StringDemo05.java)
 * 	4��StringBuffer��String���͵�Ч�ʶԱ�(StringDemo05.java)
 * 
 * �ġ�StringBuilder
 * 	1��StringBuilder����
 * 		һ���ɱ���ַ����С�
 * 		���౻�������StringBuffer��һ�������滻��
 * 		�����ַ����������������߳�ʹ�õ�ʱ�򣬽������ȿ��Ǹ��࣬�ٶȱ�StringBuffer��Ҫ��
 * 	2����������漰���̰߳�ȫ���棬����ʹ��StringBuffer
 * 	3��StringBuilder���÷���
 * 		append()
 * 		insert()
 * 
 */
/**
 * @author Qiufan
 *
 */
package com.javabasis.ch15string;