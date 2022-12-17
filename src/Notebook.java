public class Notebook {
    private String name;
    private String brand;
    private double diagonal;
    private int gbRAM;

    private String driveType;
    private int volumeSSD_HDD;
    private String color;
    private String operatingSystem;

    public Notebook(String name,
                    String brand,
                    double diagonal,
                    int gbRAM,
                    String driveType,
                    int volumeSSD_HDD,
                    String color,
                    String operatingSystem) {

        this.name = name;
        this.brand = brand;
        this.diagonal = diagonal;
        this.gbRAM = gbRAM;
        this.driveType = driveType;
        this.volumeSSD_HDD = volumeSSD_HDD;
        this.color = color;
        this.operatingSystem = operatingSystem;

    }


    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", diagonal=" + diagonal +
                ", gbRAM=" + gbRAM + "ГБ" +
                ", driveType='" + driveType + '\'' +
                ", volumeSSD_HDD=" + volumeSSD_HDD + "ГБ" +
                ", color='" + color + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }

    public int getGbRAM() {
        return gbRAM;
    }

    public String getBrand() {
        return brand;
    }

    public int getVolumeSSD_HDD() {
        return volumeSSD_HDD;
    }

    public String getColor() {
        return color;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getName() {
        return name;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getDriveType() {
        return driveType;
    }

}


