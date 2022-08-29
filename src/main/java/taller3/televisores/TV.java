package taller3.televisores;

public class TV {
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Marca marca;
	private Control control;
	private static int numTV;

	
	public TV (Marca mrc, boolean est) {
		this.marca = mrc;
		this.estado= est;
		canal = 1;
		precio = 500;
		volumen = 1;
		numTV++;

	}

	public int getCanal() {
		return canal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
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
	
	public static void setNumTV(int numTV) {
		TV.numTV=numTV;
	}
	public static int getNumTV() {
		return TV.numTV;
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
		if (canal > 0 && canal < 120 && estado==true) {
			canal++;
		}
	}
	public void canalDown() {
		if (canal <= 120 && canal > 1 && estado==true) {
			canal--;
		}

	}
	public void volumenUp() {
		if(volumen >=0 && volumen < 7 && estado==true) {
			volumen++;
		}
	}
	public void volumenDown() {
		if (volumen <=7 && volumen > 0 && estado==true) {
			volumen--;
		}
	}
	
	public void setCanal(int canal) {
		if(estado==true && canal <= 120 ) {
			this.canal=canal;
		}
	}
	public void setVolumen(int volumen) {
		if(estado==true && volumen <=7 && volumen > 0) {
			this.volumen=volumen;
		}
	}
	public int getVolumen() {
		return volumen;
	}
}
	
	
	
	
	


