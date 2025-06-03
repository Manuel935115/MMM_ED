package examen;


	public enum MMM_TipoDeCombustible {
		
	
	Gasolina(1.60),
	Diesel(1.45),
	Electrico(0.20);
	
	private final double precioPorLitro;
	private double precioPorLitro2;
	
	void TipoCombustible(double precioPorLitro){
		precioPorLitro2 = this.precioPorLitro;
	}
	
	public double getPrecioPorLitro() {
		return precioPorLitro;
	}
	
}
