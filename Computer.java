class CPU{
	int price;
	class Processor{
		int no_cores;
		String manufacturer;
		}
	static class RAM{
		int memory;
		String manufacturer;
		}
	}
		
public class Computer{
	public static void main(String args []){
		CPU cpu=new CPU();
		CPU.Processor process=cpu.new Processor();
		CPU.RAM ram=new CPU.RAM();
		
		cpu.price=10000;
		process.no_cores=2;
		process.manufacturer="intel";
		ram.memory=64;
		ram.manufacturer="intel";
		
		System.out.println("Processor:"+process.manufacturer+"\n"+"Number of cores :"+process.no_cores);
		System.out.println("Ram:"+ram.manufacturer+"\n"+"Memory :"+ram.memory);
		System.out.println("CPU Price:"+cpu.price);
		
}
}

