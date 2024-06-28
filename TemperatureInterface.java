import java.rmi.*;
public interface TemperatureInterface extends Remote{
	public double FahrenheitToCelsius(double f)throws RemoteException;
}