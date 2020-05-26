package cn.ck.observer.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * ���������ɫ
 */
public abstract class Rate {
    //�۲���company����list����
    protected List<Company> companyList=new ArrayList<Company>();
    //���ӹ۲���company����
    public void addObserver(Company company){
        companyList.add(company);
    }
    //ɾ���۲���company����
    public void removeObserver(Company company){
        companyList.remove(company);
    }
    public abstract void change(int rateChange);
}
