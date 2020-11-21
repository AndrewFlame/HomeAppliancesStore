public class Oven {
    private int Length;
    private int Height;
    private int Depth;
    private String ManufacterName;
    private String DeviceName;
    private String DeviceType;
    private int EnergyConsumption;
    private int ProgrammableFunctions;
    private int MaxTemperature;
    private int MaxKG;
    private int MaxShelfs;
    private int MinimumBakingTime;
Oven(int Length,int Height,int Depth,String ManufacterName,String DeviceName,String DeviceType,int EnergyConsumption,int ProgrammableFunctions,int MaxTemperature,int MaxKG,int MaxShelfs,int MinimumBakingTime )
{
    try{
        setDeviceType(DeviceType);
        setProgrammableFunctions(ProgrammableFunctions);
        setMaxKG(MaxKG);
        setMaxTemperature(MaxTemperature);
        setEnergyConsumption(EnergyConsumption);
        setDeviceName(DeviceName);
        setManufacterName(ManufacterName);
        setDepth(Depth);
        setHeight(Height);
        setLength(Length);
        setMaxShelfs(MaxShelfs);
        setMinimumBakingTime(MinimumBakingTime);
    }
    catch(Exception e){
        System.out.println("ERR: "); return;
    }
    OvensCounter = OvensCounter +1;
    Display();
}
    static int OvensCounter = 0;
    public static int OvensCounter() {
        System.out.printf("Ovens: ");
        return OvensCounter;
    }


    //Setters
    public void setLength(int length) {
        Length = length;
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
    public void setProgrammableFunctions(int programmableFunctions) {
        ProgrammableFunctions = programmableFunctions;
    }
    public void setMaxTemperature(int maxTemperature) {
        MaxTemperature = maxTemperature;
    }
    public void setMaxKG(int maxKG) {
        MaxKG = maxKG;
    }
    public void setMaxShelfs(int maxShelfs) {
        MaxShelfs = maxShelfs;
    }
    public void setMinimumBakingTime(int minimumBakingTime) {
        MinimumBakingTime = minimumBakingTime;
    }
    //Getters

    public int getMaxShelfs() {
        return MaxShelfs;
    }
    public int getLength() {
        return Length;
    }
    public int getDepth() {
        return Depth;
    }
    public int getEnergyConsumption() {
        return EnergyConsumption;
    }
    public int getHeight() {
        return Height;
    }
    public int getMaxKG() {
        return MaxKG;
    }
    public int getMaxTemperature() {
        return MaxTemperature;
    }
    public int getProgrammableFunctions() {
        return ProgrammableFunctions;
    }
    public String getDeviceName() {
        return DeviceName;
    }
    public String getDeviceType() {
        return DeviceType;
    }
    public String getManufacterName() {
        return ManufacterName;
    }
    public int getMinimumBakingTime() {
        return MinimumBakingTime;
    }

    void Display(){
        System.out.printf("Manufacter: %s Name: %s Type: %s %dcm %dcm %dcm %dkW/h Programms: %d %dMS' MBT: %d\n" , getManufacterName() , getDeviceName() , getDeviceType() , getLength() , getHeight() , getDepth() , getEnergyConsumption() , getProgrammableFunctions() , getMaxShelfs() , getMinimumBakingTime());
        System.out.printf("Drawers: %d Drawers: %d\n\n" , getMaxShelfs() , getMinimumBakingTime());
    }

    private void periodicMantainance(){

    }

}
