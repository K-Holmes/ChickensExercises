public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
        double dailyAverage=0, monthlyProfit=0, monthlyAverage =0;
        dailyAverage= (100+121+117)/3.0;
        monthlyAverage = dailyAverage*30.0;
        monthlyProfit= monthlyAverage *0.18;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }

}
