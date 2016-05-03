import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class MyServer extends UnicastRemoteObject implements FileInterface
{

	public MyServer() throws RemoteException
	{
		super();
	}

	public static void main(String[] args) 
	{
		String hostName = "localhost";
		String serviceName = "FileService";
		
		try 
		{
			FileInterface files = new MyServer();
			Naming.rebind("rmi://" + hostName + "/" + serviceName, files);
			System.out.println("HelloWorld RMI Server is running....");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public String openFile(String fileName) throws RemoteException 
	{
		return null;
	}

	@Override
	public String deleteFile(String fileName) throws RemoteException 
	{
		return null;
	}

	@Override
	public String saveFile(String fileName) throws RemoteException 
	{
		return null;
	}

}
