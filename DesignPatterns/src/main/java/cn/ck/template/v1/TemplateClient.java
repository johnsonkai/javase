package cn.ck.template.v1;

import cn.ck.template.v1.AbstractTemplate;
import cn.ck.template.v1.ConcreteTemplate;
import cn.ck.template.v1.ConcreteTemplate1;

/**
 * ģʽ�����ͻ�����
 * �ŵ㣺 1����װ���䲿�֣���չ�ɱ䲿�֡�
 * 2����ȡ�������룬����ά����
 * 3����Ϊ�ɸ�����ƣ�����ʵ�֡�
 *
 ȱ�㣺ÿһ����ͬ��ʵ�ֶ���Ҫһ��������ʵ�֣�������ĸ������ӣ�ʹ��ϵͳ�����Ӵ�
 */
public class TemplateClient {
    public static void main(String[] args) {
        //��������ģ���࣬��������巽����д
        AbstractTemplate template=new ConcreteTemplate();
        //����ģ�巽��Ҳ�й��Ӻ���
        template.templateMethod();
        //��������ģ���࣬��������巽������д
        AbstractTemplate template1=new ConcreteTemplate1();
        //����ģ�巽��Ҳ�й��Ӻ���
        template1.templateMethod();
    }
}
