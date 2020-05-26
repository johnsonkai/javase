package cn.ck.observer.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题角色
 */
public abstract class Rate {
    //观察者company对象list集合
    protected List<Company> companyList=new ArrayList<Company>();
    //增加观察者company对象
    public void addObserver(Company company){
        companyList.add(company);
    }
    //删除观察者company对象
    public void removeObserver(Company company){
        companyList.remove(company);
    }
    public abstract void change(int rateChange);
}
