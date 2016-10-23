package kevinVaja2;

public class KevinVaja2
{
	public static void main(String[] args)
	{
		/*
		2)  Izpiši vsa liha števila med 50 in 100 (meji sta vključeni).
		izpis naj bo v eni vrstici. Števila naj bodo ločena s presledki
		*/
		
		int stevec2 = 50;
		String sodaStevila = "";
		while(stevec2 <= 100)
		{
			if(stevec2 % 2 == 0)
			{
				sodaStevila = sodaStevila + stevec2 + " ";
			}
			stevec2++;
		}
		System.out.print(sodaStevila);
	}
}
