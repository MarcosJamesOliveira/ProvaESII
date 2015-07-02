package Classe;

public class Imposto {
	
	private double valor=0.0;
	private double cotacaoDolar=0.0;
	private double aliquota=0.0;
	
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getCotacaoDolar() {
		return cotacaoDolar;
	}
	public void setCotacaoDolar(double cotacaoDolar) {
		this.cotacaoDolar = cotacaoDolar;
	}
	public double getAliquota() {
		return aliquota;
	}
	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}
	
	public boolean permitirAliquota(){
		if(aliquota <= (valor*1.2)){
			return true;
		}
		else {
			aliquota=valor*1.2;
			return false;
		}
	}


	public double calcularImposto(){
		double imposto =valor * aliquota/100;
		double cambio = imposto * cotacaoDolar;
		return cambio;
	}
	
}
