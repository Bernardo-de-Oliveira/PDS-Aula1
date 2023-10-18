package model;

public class Conversao {

	public float converterFtoC(float tempF) {
		
		float tempConvertida = (tempF-32f)*5/9f;
		return tempConvertida;
	}
	
}
