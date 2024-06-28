import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
public class TemperatureServer extends UnicastRemoteObject implements TemperatureInterface
{
public TemperatureServer() throws RemoteException{
super();
}
public double FahrenheitToCelsius(double f)throws RemoteException
{
return ((f-32)*5/9);
}
public static void main(String[] args)throws RemoteException,MalformedURLException{
TemperatureServer t=new TemperatureServer();
String url="rmi://localhost:1099/temOBj";
Naming.rebind(url,t);
System.out.println("Server is ready!!");
}
}