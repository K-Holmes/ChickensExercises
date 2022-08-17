public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here, v1=version/scenario 1, v2=version/scenario 2
        int eggsPerChickenv1, chickenCountv1, totalEggsv1;
        int eggsPerChickenv2, chickenCountv2, totalEggsv2;
        eggsPerChickenv1 = 5;
        chickenCountv1 = 3;
        eggsPerChickenv2 = 4;
        chickenCountv2 = 8;

        //starting the scenario, Monday
        System.out.println("--SCENARIO ONE--\n" +
                "On Monday, Farmer Brown has " + chickenCountv1 + " chickens.");
        totalEggsv1= chickenCountv1*eggsPerChickenv1;
        chickenCountv1++;

        //Tuesday
        System.out.println("On Tuesday morning, Farmer Brown gains 1 chicken. (Chickens now: " +chickenCountv1 +")");
        totalEggsv1 = totalEggsv1 + (chickenCountv1*eggsPerChickenv1);
        chickenCountv1=chickenCountv1/2;

        //Wednesday
        System.out.println("On Wednesday morning, a wild beast eats half the chickens! (Chickens now: " +chickenCountv1+")");
        totalEggsv1 = totalEggsv1 + (chickenCountv1*eggsPerChickenv1);
        System.out.println("Now there are " +chickenCountv1+" chickens and he collected "+totalEggsv1+ " eggs total");

        System.out.println();

        //starting the scenario, Monday
        System.out.println("--SCENARIO ONE--\n" +
                "On Monday, Farmer Brown has " + chickenCountv2 + " chickens.");
        totalEggsv2= chickenCountv2*eggsPerChickenv2;
        chickenCountv2++;

        //Tuesday
        System.out.println("On Tuesday morning, Farmer Brown gains 1 chicken. (Chickens now: " +chickenCountv2 +")");
        totalEggsv2 = totalEggsv2 + (chickenCountv2*eggsPerChickenv2);
        chickenCountv2=chickenCountv2/2;

        //Wednesday
        System.out.println("On Wednesday morning, a wild beast eats half the chickens! (Chickens now: " +chickenCountv2+")");
        totalEggsv2 = totalEggsv2 + (chickenCountv2*eggsPerChickenv2);
        System.out.println("Now there are " +chickenCountv2+" chickens and he collected "+totalEggsv2+ " eggs total");
    }
}
