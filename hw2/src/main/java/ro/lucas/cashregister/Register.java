package ro.lucas.cashregister;

public class Register {

    private static double totalMoney = 0;

    public static void addMoney(double money){
        totalMoney = money + totalMoney;
    }

}
