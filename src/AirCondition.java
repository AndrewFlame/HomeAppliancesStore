
public class AirCondition {
    private int Length;
    private int Height;
    private int Depth;
    private String ManufacterName;
    private String DeviceName;
    private String DeviceType;
    private int EnergyConsumption;
    private int ProgrammableFunctions;
    private int MinTemperature;
    private int MaxBTU;
    private int MinPowerONTime;
    private int MaxAirflowDistance;
AirCondition(String ManufacterName, String DeviceName , String DeviceType,int Length, int Height,int Depth,int EnergyConsumption,int ProgrammableFunctions,int MinTemperature,int MaxBTU,int MinPowerONTime,int MaxAirflowDistance)
{
    try{
        setDeviceType(DeviceType);
        setProgrammableFunctions(ProgrammableFunctions);
        setMaxBTU(MaxBTU);
        setMinTemperature(MinTemperature);
        setEnergyConsumption(EnergyConsumption);
        setDeviceName(DeviceName);
        setManufacterName(ManufacterName);
        setDepth(Depth);
        setHeight(Height);
        setLength(Length);
        setMinPowerONTime(MinPowerONTime);
        setMaxAirflowDistance(MaxAirflowDistance);
    }
    catch(Exception e){
        System.out.println("ERR: "); return;
    }
    AirCondiotionsCounter = AirCondiotionsCounter + 1;
    Display();
}

    static int AirCondiotionsCounter = 0;
    public int AirCondiotionsCounter() {
        System.out.printf("AirCondiotions: ");
        return AirCondiotionsCounter;
    }
    // Setters
    public void setLength(int Length) {
            Length = Length;
    }
    public void setHeight(int height) {
        Height = height;
    }
    public void setDepth(int depth) {
        Depth = depth;
    }
    public void setManufacterName(String manufacterName) {
        ManufacterName = manufacterName;
    }
    public void setDeviceName(String deviceName) {
        DeviceName = deviceName;
    }
    public void setDeviceType(String deviceType) {
        DeviceType = deviceType;
    }
    public void setEnergyConsumption(int energyConsumption) {
        EnergyConsumption = energyConsumption;
    }
    public void setMaxAirflowDistance(int maxAirflowDistance) {
        MaxAirflowDistance = maxAirflowDistance;
    }
    public void setMaxBTU(int maxBTU) {
        MaxBTU = maxBTU;
    }
    public void setProgrammableFunctions(int programmableFunctions) {
        ProgrammableFunctions = programmableFunctions;
    }
    public void setMinPowerONTime(int minPowerONTime) {
        MinPowerONTime = minPowerONTime;
    }
    public void setMinTemperature(int minTemperature) {
        MinTemperature = minTemperature;
    }
    //Getters
    public String getManufacterName() {
        return ManufacterName;
    }
    public String getDeviceType() {
        return DeviceType;
    }
    public String getDeviceName() {
        return DeviceName;
    }
    public int getProgrammableFunctions() {
        return ProgrammableFunctions;
    }
    public int getHeight() {
        return Height;
    }
    public int getEnergyConsumption() {
        return EnergyConsumption;
    }
    public int getDepth() {
        return Depth;
    }
    public int getLength() {
        return Length;
    }
    public int getMinTemperature() {
        return MinTemperature;
    }
    public int getMaxAirflowDistance() {
        return MaxAirflowDistance;
    }
    public int getMaxBTU() {
        return MaxBTU;
    }
    public int getMinPowerONTime() {
        return MinPowerONTime;
    }
    void Display(){
        System.out.printf("Manufacter: %s Name: %s Type: %s %dcm %dcm %dcm %dkW/h Programms: %d %dT' cmF: %d\n" , getManufacterName() , getDeviceName() , getDeviceType() , getLength() , getHeight() , getDepth() , getEnergyConsumption() , getProgrammableFunctions() , getMinPowerONTime() , getMaxAirflowDistance());
        System.out.printf("Drawers: %d Drawers: %d\n\n" , getMinPowerONTime() , getMaxAirflowDistance());
    }

    private void periodicMantainance(){

    }


}