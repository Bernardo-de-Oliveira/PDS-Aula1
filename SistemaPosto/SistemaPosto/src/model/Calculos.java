package model;

public class Calculos {
	public float valorDiesel,valorComum,valorAditivada,valorEtanol,valor500ml,valor1L,quantidade500ml,quantidade1L,total500ml,total1L,totalComb,totalOleo;
	public String TT;
	
	
	
	public String totalPagarPrazo()
	{
		
		String total=String.valueOf((totalComb+totalOleo));
		return total;
	}
	public String totalPagarPrazo30()
	{
		String total=String.valueOf((totalComb+totalOleo)+((totalComb+totalOleo)*0.10));
		return total;
	}
	public String c500ml()
	{
		String valorTotal=String.valueOf(quantidade500ml*valor500ml);
		total500ml=Float.valueOf(valorTotal);
		return valorTotal;
	}
	public String c1L()
	{
		String valorTotal=String.valueOf(quantidade1L*valor1L);
		total1L= Float.valueOf(valorTotal);
		return valorTotal;
	}
	public String totalOleo()
	{
		String valorTotal=String.valueOf(total500ml+total1L);
		totalOleo=Float.valueOf(valorTotal);
		return valorTotal;
	}
	public String Diesel(float qL)
	{
		String valorTotal=String.valueOf(valorDiesel*qL);
		totalComb=Float.valueOf(valorTotal);
		return valorTotal;
	}
	public String Comum(float qL)
	{
		String valorTotal=String.valueOf(valorComum*qL);
		return valorTotal;
	}
	public String Aditivada(Float qL)
	{
		String valorTotal=String.valueOf(valorAditivada*qL);
		totalComb=Float.valueOf(valorTotal);
		return valorTotal;
	}
	public String Etanol(float qL)
	{
		String valorTotal=String.valueOf(valorEtanol*qL);
		totalComb=Float.valueOf(valorTotal);
		return valorTotal;
	}
	public String TotalpagarVista()
	{
		String total=String.valueOf((totalComb+totalOleo)-((totalComb+totalOleo)*0.10));
		TT=total;
		return total;
	}
}
