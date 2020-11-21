public class Fridge {
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
    private int MaxDrawers;

    Fridge(String ManufacterName , String DeviceName , String DeviceType , int Length , int Height , int Depth , int EnergyConsumption , int ProgrammableFunctions , int MaxTemperature , int MaxKG , int MaxShelfs , int MaxDrawers)
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
            setMaxDrawers(MaxDrawers);
        }
        catch(Exception e){
            System.out.println("ERR: "); return;
        }
        FridgesCounter = FridgesCounter + 1;
        Display();
    }

    static int FridgesCounter = 0;
    public int FridgesCounter(){
        System.out.printf("Fridges: ");
        return FridgesCounter;
    }


    //Setters
    public void setDeviceType(String deviceType) {
        DeviceType = deviceType;
    }
    public void setProgrammableFunctions(int programmableFunctions) {
        ProgrammableFunctions = programmableFunctions;
    }
    public void setMaxKG(int maxKG) {
        MaxKG = maxKG;
    }
    public void setMaxTemperature(int maxTemperature) {
        MaxTemperature = maxTemperature;
    }
    public void setEnergyConsumption(int energyConsumption) {
        EnergyConsumption = energyConsumption;
    }
    public void setDeviceName(String deviceName) {
        DeviceName = deviceName;
    }
    public void setManufacterName(String manufacterName) {
        ManufacterName = manufacterName;
    }
    public void setDepth(int depth) {
        Depth = depth;
    }
    public void setHeight(int height) {
        Height = height;
    }
    public void setLength(int length) {
        Length = length;
    }
    public void setMaxShelfs(int maxShelfs) {
        MaxShelfs = maxShelfs;
    }
    public void setMaxDrawers(int maxDrawers) {
        MaxDrawers = maxDrawers;
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
    public int getMaxTemperature() {
        return MaxTemperature;
    }
    public int getMaxKG() {
        return MaxKG;
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
    public int getMaxDrawers() {
        return MaxDrawers;
    }
    public int getMaxShelfs() {
        return MaxShelfs;
    }


    void Display(){

        System.out.printf("Manufacter: %s Name: %s Type: %s %dcm %dcm %dcm %dkW/h Programms: %d %dC' Kilos: %d\n" , getManufacterName() , getDeviceName() , getDeviceType() , getLength() , getHeight() , getDepth() , getEnergyConsumption() , getProgrammableFunctions() , getMaxTemperature() , getMaxKG());
        System.out.printf("Drawers: %d Drawers: %d\n\n" , getMaxDrawers() , getMaxShelfs());

    }


    private void periodicMantainance(){

    }

}

