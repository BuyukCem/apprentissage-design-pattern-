package patternObservateur;
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class DonneesMeteo implements Observable{

	private float temperature;
	private float humidite;
	private float pression; 
	
	public DonneesMeteo() {
	}
	
	public void actualierMesures() {
		//setChanged()
		notifyObservers();
	}
	
	public void setMesures(float temperature, float humidite, float pression) {
		this.temperature = temperature;
		this.humidite = humidite;
		this.pression = pression;
		actualierMesures();
	
	}

	public float getTemperature() {
		return temperature;
	}
	public float getHumidite() {
		return humidite;
	}
	public float getPression() {
		return pression;
	}
}
