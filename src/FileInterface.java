import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FileInterface extends Remote 
{
	public String openFile(String fileName) throws RemoteException;
	public String deleteFile(String fileName) throws RemoteException;
	public String saveFile(String fileName) throws RemoteException;
}
