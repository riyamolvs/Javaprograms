import java.util.Scanner;
class CPU {
    double price;   
    class Processor {
        int cores; 
        String manufacturer;
        public void displayInfo() {
            System.out.println("Processor Information:");
            System.out.println("Cores: " + cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }
    static class RAM {
        int memory;
        String manufacturer;
        public void displayInfo() {
            System.out.println("RAM Information:");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }
    public void displayPrice() {
        System.out.println("CPU Price:" + price);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CPU cpu = new CPU();
        System.out.print("Enter CPU price: ");
        cpu.price = scanner.nextDouble();
        Processor processor = cpu.new Processor();
        System.out.print("Enter no. of cores: ");
        processor.cores = scanner.nextInt();
        System.out.print("Enter the manufacturer of processor: ");
        processor.manufacturer = scanner.next(); 
        RAM ram = new RAM();
        System.out.print("Enter RAM size: ");
        ram.memory = scanner.nextInt();
        System.out.print("Enter the manufacturer of RAM: ");
        ram.manufacturer = scanner.next(); 
        cpu.displayPrice();
        processor.displayInfo();
        ram.displayInfo();
        scanner.close();
    }
}
