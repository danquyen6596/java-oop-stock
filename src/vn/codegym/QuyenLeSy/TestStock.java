package vn.codegym.QuyenLeSy;

public class TestStock {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);

        stock.display();
        System.out.println("Change Percent: "+ stock.getChangePercent());
    }
}
