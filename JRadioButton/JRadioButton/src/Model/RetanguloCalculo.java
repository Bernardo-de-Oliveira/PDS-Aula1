package Model;

public class RetanguloCalculo {

	public float calculoP(float base, float altura)
	{
		float Perimetro;
		Perimetro = 2 * (altura + base);
		return Perimetro;
	}
	public float calculoA(float base, float altura)
	{
		float Area;
		Area = base * altura;
		return Area;
	}
	
}
