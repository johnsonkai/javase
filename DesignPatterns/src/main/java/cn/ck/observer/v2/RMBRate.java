package cn.ck.observer.v2;

/**
 * ���������������һ���RMBRate
 */
public class RMBRate extends Rate {

    @Override
    public void change(int rateChange) {
        for (Company company:super.companyList){
            company.update(rateChange);
        }
    }
}
