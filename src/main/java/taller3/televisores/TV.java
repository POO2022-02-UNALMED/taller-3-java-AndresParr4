package taller3.televisores;

public class TV {
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	Marca marca;
	Control control;
	static int numTV=0;

	
	public TV (Marca mrc, boolean est) {
		this.marca = mrc;
		this.estado= est;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal1(int canal) {
		this.canal = canal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen1() {
		return volumen;
	}

	public void setVolumen1(int volumen) {
		this.volumen = volumen;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	public TV() {
		numTV++;
		
	}
	public void turnOn() {
		this.estado=true;
		}
	
	public void turnOff() {
		this.estado=false;
		}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		this.canal++;
	}
	public void canalDown() {
		this.canal--;

	}
	public void volumenUp() {
		this.volumen++;
	}
	public void volumenDown() {
		this.volumen--;
	}
	
	public void setCanal(int canal) {
		if(estado==true && canal <= 120 ) {
			this.canal=canal;
		}
	}
	public void setVolumen(int volumen) {
		if(estado==true && volumen <=7) {
			this.volumen=volumen;
		}
	}
}
	
	
	
	
	


