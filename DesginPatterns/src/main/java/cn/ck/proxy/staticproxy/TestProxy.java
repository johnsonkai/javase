package cn.ck.proxy.staticproxy;





/**
 * ��̬���������?
 * ��̬������̳з�����?
 * ������ǿ�����?���������Խ���Ƕ�״��?��̳�ֻҪ�Ա�����ķ�������ĳ�����������ǿ�͵ü̳б��������
 * ��̬�����ȱ��?����һ����������󱻶��������?��ô��Ҫ�������������?
 * 2:�ӿ�����һ�����������������?��Ҫ����һ��������Υ���˿���ԭ��
 * @author Administrator
 *
 */
public class TestProxy {
	public static void main(String[] args) throws InterruptedException {
		//�������?�磺��¼�ɻ���е����?
		Plane p=new Plane();
		PlaneProxyLog ppl=new PlaneProxyLog(p);
		//ppl.move()
	
		PlaneTimeProxy ptp=new PlaneTimeProxy(ppl);
		ptp.move();
	}
}
