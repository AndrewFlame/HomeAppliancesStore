public class WashingMachine {
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
    private int MinTemperature;
    private int MaxWashes;
WashingMachine(int Length,int Height,int Depth,String ManufacterName,String DeviceName,String DeviceType,int EnergyConsumption,int ProgrammableFunctions,int MaxTemperature,int MaxKG,int MinTemperature,int MaxWashes )
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
        setMinTemperature(MinTemperature);
        setMaxWashes(MaxWashes);
    }
    catch(Exception e){
        System.out.println("ERR: "); return;
    }
    WashingMachinesCounter = WashingMachinesCounter +1;
    Display();
}
    static int WashingMachinesCounter = 0;
    public static int WashingMachinesCounter() {
        System.out.printf("WashingMachines: ");
        return WashingMachinesCounter;
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
    public void setEnergyConsumption(int energyConsumption) {
        EnergyConsumption = energyConsumption;
    }
    public void setMaxTemperature(int maxTemperature) {
        MaxTemperature = maxTemperature;
    }
    public void setMaxKG(int maxKG) {
        MaxKG = maxKG;
    }
    public void setProgrammableFunctions(int programmableFunctions) {
        ProgrammableFunctions = programmableFunctions;
    }
    public void setDeviceType(String deviceType) {
        DeviceType = deviceType;
    }
    public void setMinTemperature(int minTemperature) {
        MinTemperature = minTemperature;
    }
    public void setMaxWashes(int maxWashes) {
        MaxWashes = maxWashes;
    }

//Getters
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
    public int getMaxWashes() {
        return MaxWashes;
    }
    public int getMinTemperature() {
        return MinTemperature;
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

    void Display(){
        System.out.printf("Manufacter: %s Name: %s Type: %s %dcm %dcm %dcm %dkW/h Programms: %d %dMS' MBT: %d\n" , getManufacterName() , getDeviceName() , getDeviceType() , getLength() , getHeight() , getDepth() , getEnergyConsumption() , getProgrammableFunctions() , getMaxTemperature() , getMaxWashes());
        System.out.printf("Drawers: %d Drawers: %d\n\n" , getMaxWashes() , getMinTemperature());
    }

    private void periodicMantainance(){

    }
}

