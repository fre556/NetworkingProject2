import java.rmi.Naming;

public class MyClient 
{

	public static void main(String[] args) 
	{
		String hostName = "localhost";
		String serviceName = "FileService";
		String file = "myFile.txt";

		
		try
		{
			 FileInterface files = (FileInterface)Naming.lookup("rmi://"+hostName+"/"+serviceName);
			 System.out.println(files.openFile(file));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
