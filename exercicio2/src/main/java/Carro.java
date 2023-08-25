

public class Carro {
	private String placa;
	private String modelo;
	
	public Carro() {
		this.placa = "";
		this.modelo = "";
	}
	
	public Carro(String placa, String modelo) {
		this.placa = placa;
		this.modelo = modelo;
	}


	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", modelo=" + modelo + "]";
	}	
}
