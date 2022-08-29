package taller3.televisores;

public class Control {
	TV tv;
	
	public void getCanal() {
		tv.getCanal();
	}
	
	public void getVolumen() {
		tv.getVolumen1();
	}
	
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void setCanal() {
		tv.setCanal(0);
	}
	
	public void enlazar(TV tv) {
		this.tv=tv;
		tv.setControl(this);
	}

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}
	

}
