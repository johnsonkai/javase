package cn.ck.observer.v2;

/**
 * 具体观察者进口公司importCompany
 */
public class ImportCompany implements Company {
    @Override
    public void update(int changeRate) {
        if(changeRate>=0){
            System.out.println("人民币汇率升值"+changeRate+"个基点，降低了进口产品成本，提升了进口公司利润率");

        } else {
            System.out.println("人民币汇率贬值"+(0-changeRate)+"个基点，提升了进口产品成本，降低了进口公司利润率。");

        }
    }
}
