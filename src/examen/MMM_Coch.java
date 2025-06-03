package examen;

public class MMM_Coch {

	String Matricula;
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeroPlazas() {
		return NumeroPlazas;
	}
	public void setNumeroPlazas(int numeroPlazas) {
		NumeroPlazas = numeroPlazas;
	}
	public double getVelocidadMedia() {
		return VelocidadMedia;
	}
	public void setVelocidadMedia(double velocidadMedia) {
		VelocidadMedia = velocidadMedia;
	}
	public String getTipoCombustible() {
		return TipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		TipoCombustible = tipoCombustible;
	}
	public Double getConsumo() {
		return consumo;
	}
	public void setConsumo(Double consumo) {
		this.consumo = consumo;
	}
	
	public MMM_Coch(String matricula, String modelo, int numeroPlazas, double velocidadMedia, String tipoCombustible,
			Double consumo) {
		super();
		Matricula = matricula;
		this.modelo = modelo;
		NumeroPlazas = numeroPlazas;
		VelocidadMedia = velocidadMedia;
		TipoCombustible = tipoCombustible;
		this.consumo = consumo;
	}
	int NumeroPlazas;
	 public MMM_Coch() {
		super();
		// TODO Auto-generated constructor stub
	}
	double VelocidadMedia;
	 String TipoCombustible;
	 Double consumo;
	 String modelo;
}
