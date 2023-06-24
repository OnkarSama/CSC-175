/**
 * @author Onkar Dhillon
 * @version 02/21/2023 V1
 * @purpose To create a blueprint class of animal
 */

public class PersonalComputer {

    private String CPU;
    private String motherboard;
    private String RAM;
    private String GPU;
    private String hardDrive;
    private String solidStateDrive;

    public PersonalComputer(String CPU, String motherboard, String RAM, String GPU, String hardDrive, String solidStateDrive) {

        this.CPU = CPU;
        this.motherboard = motherboard;
        this.RAM = RAM;
        this.GPU = GPU;
        this.hardDrive = hardDrive;
        this.solidStateDrive = solidStateDrive;
    }

    public String toString() {

        System.out.println("Your pc has a " + this.motherboard + " with a " + this.CPU +
                " CPU with " + this.RAM + " RAM a " + this.GPU + " GPU a " + this.hardDrive +
                " hard drive and a " + this.solidStateDrive + " SSD.");

        return null;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getSolidStateDrive() {
        return solidStateDrive;
    }

    public void setSolidStateDrive(String solidStateDrive) {
        this.solidStateDrive = solidStateDrive;
    }


}
