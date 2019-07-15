package aruw.bean;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

public class GasolineEngine extends Engine implements GasTank {

    private int cylinder;

    private double cylinderCm3;

    private double gasolineCapacity;

    private final static double MAX_GASOLINE_CAPACITY=15.43;
    private final static int MAX_LEVEL_OF_GAS=9;



    public double capacity(){
        return this.cylinder*this.cylinderCm3;
    }

    protected void intakeStroke(){
        System.out.println("Getting air......");
    }
    protected void compressionStroke(int level){
        //getGas(level);
        System.out.println("compressing air and gasoline......");
    }
    protected void combustionStroke(){
        System.out.println("a ......");

    }
    protected void exhaustStroke(){
        System.out.println("Getting air......");
    }



    @java.lang.Override
    public double generatePowerInCycle(int level) {
        intakeStroke();
        compressionStroke(level);
        combustionStroke();
        exhaustStroke();
    }

    @Override
    public void setGas(double gas){
        double difference = (MAX_GASOLINE_CAPACITY-gasolineCapacity);
        if(difference==0)
            return;
        else if(difference>=gas)
            gasolineCapacity+=gas;
        else if(gas> difference){
            gasolineCapacity+=difference;
            gas-=difference;
            System.out.println(String.format("Skipping %s of gasoline",gas));
        }


    }

    public double getGas(int level) throws Exception{

        if(level>MAX_LEVEL_OF_GAS)
            level=MAX_LEVEL_OF_GAS;
        else if (level<1)
            level=1;

        double quantity = 0.02*level;

        if(gasolineCapacity<quantity)
            throw new Exception("No Gasoline");

        gasolineCapacity -= quantity;

        return quantity;


    }



}
