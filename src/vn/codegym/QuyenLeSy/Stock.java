package vn.codegym.QuyenLeSy;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(){

    }

    public Stock(String newSymbol, String newName, double previousClosingPrice, double currentPrice){
        this.symbol = newSymbol;
        this.name = newName;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(){
        return (this.currentPrice - this.previousClosingPrice)/this.currentPrice;
    }

    public String display(){
        return "Stock \n" + "Symbol: " + this.symbol + "\n" + "Name: " + this.name + "\n";
    }

}
