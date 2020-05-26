package cn.ck.observer.v2;

/**
 * 具体主题对象人民币汇率RMBRate
 */
public class RMBRate extends Rate {

    @Override
    public void change(int rateChange) {
        for (Company company:super.companyList){
            company.update(rateChange);
        }
    }
}
