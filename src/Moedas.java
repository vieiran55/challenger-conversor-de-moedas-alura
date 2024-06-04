public class Moedas {
    // peso argentino
    double ARS;
    // dolar
    double USD;
    // real
    double BRL;
    // peso colombiano;
    double COP;
    // libra
    double GBP;

    public double getARS() {
        return ARS;
    }

    public double getUSD() {
        return USD;
    }

    public double getBRL() {
        return BRL;
    }

    public double getCOP() {
        return COP;
    }

    public double getGBP() {
        return GBP;
    }

    public void setARS(double ARS) {
        this.ARS = ARS;
    }

    public void setUSD(double USD) {
        this.USD = USD;
    }

    public void setBRL(double BRL) {
        this.BRL = BRL;
    }

    public void setCOP(double COP) {
        this.COP = COP;
    }

    public void setGBP(double GBP) {
        this.GBP = GBP;
    }

    public Moedas(double ARS, double USD, double BRL, double COP, double GBP) {
        this.ARS = ARS;
        this.USD = USD;
        this.BRL = BRL;
        this.COP = COP;
        this.GBP = GBP;
    }

    public double dolarToARS (double valor, double ars){
        return valor * ars;
    }
    public double arsToDolar (double valor, double usd){
        return valor * usd;
    }
    public double dolarToBRL (double valor, double brl){
        return valor * brl;
    }
    public double brlToDolar (double valor, double usd){
        return valor * usd;
    }
    public double dolarToCOP (double valor, double cop){
        return valor * cop;
    }
    public double copToDolar (double valor, double usd){
        return valor * usd;
    }
    public double dolarToGBP (double valor, double gbp){
        return valor * gbp;
    }
    public double gbpToDolar (double valor, double usd){
        return valor * usd;
    }

    @Override
    public String toString() {
        return "\nMoedas{" +
                "ARS=" + ARS +
                ", USD=" + USD +
                ", BRL=" + BRL +
                ", COP=" + COP +
                ", GBP=" + GBP +
                '}';
    }
}
