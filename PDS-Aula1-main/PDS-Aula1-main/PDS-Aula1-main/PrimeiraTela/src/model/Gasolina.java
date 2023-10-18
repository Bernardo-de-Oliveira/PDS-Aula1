package model;

public class Gasolina {
	
	public class Conversao {

		public float CalcGasolina(float Preco, float Reais) {
			
			float Gas = (Preco/Reais);
			return Gas;
		}

}

	public float CalcGasolina(float preco, float reais) {
		float Gas = (reais/preco);
		return Gas;
		}
}
