public class HomeAppliancesStore {
    public static void main(String[] args) {
        Fridge Fridge = new Fridge("AMANA", "AMANA 001", "AAA+++", 2, 3, 4, 5, 6, 2, 3, 4, 5);
        AirCondition AirCondition = new AirCondition("Fujitsu" , "bta", "Big", 15, 13, 12, 11, 11 , 11 , 34, 43 ,34 );
        Oven Oven = new Oven(5 , 8 , 7 , "Bosch" , "BTAO" , "OAE" , 5 , 4, 280, 10, 2 , 4);
        WashingMachine WashingMachine = new WashingMachine(80 , 15, 10 , "Siemens" , "BTA-0A" , "A++" , 55 , 4 , 220 , 40 , 10 , 867422);

        System.out.printf("%d \n" , Fridge.FridgesCounter());
        System.out.printf("%d \n" , AirCondition.AirCondiotionsCounter());
        System.out.printf("%d \n" , Oven.OvensCounter());
        System.out.printf("%d \n" , WashingMachine.WashingMachinesCounter());
    }
}