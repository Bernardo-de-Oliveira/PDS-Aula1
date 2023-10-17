package model;

public class Retangulo {

	public float calculoP(float altura, float base) {
		
		float Perimetro = 2*(altura+base);
		return Perimetro;
		
	}
	
	public float calculoA(float base, float altura) {
		float Area = (base*altura);
		return Area;
	}
	
}
