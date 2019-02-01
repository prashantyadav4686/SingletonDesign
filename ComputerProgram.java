
public class ComputerProgram {

		public static Computer getdata(String type, String ram, String hdd, String cpu){
			if("PC".equals(type)) 
				return new PC(ram, hdd, cpu);
			else if("Server".equals(type)) 
				return new Server(ram, hdd, cpu);
			
			return null;
		}
		public static void main(String[] args) {
			Computer pc = ComputerProgram.getdata("PC","4 GB","1 TB","3.0 GHz");
			Computer server = ComputerProgram.getdata("Server","32 GB","2 TB","3.1 GHz");
			System.out.println("PC Configurations : "+pc.add());
			System.out.println("Server Configurations : "+server.add());
		}
	}

