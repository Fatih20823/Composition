package heli;

public class Helıkopter {
	private int kuyrukNumarası;
	private Motor motor;
	private Pervane pervane;
	private Depo depo;
	
	public Helıkopter(int kuyrukNumarası, Motor motor, Pervane pervane, Depo depo) {
		super();
		this.kuyrukNumarası = kuyrukNumarası;
		this.motor = motor;
		this.pervane = pervane;
		this.depo = depo;
	}

	public int getKuyrukNumarası() {
		return kuyrukNumarası;
	}

	public void setKuyrukNumarası(int kuyrukNumarası) {
		this.kuyrukNumarası = kuyrukNumarası;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Pervane getPervane() {
		return pervane;
	}

	public void setPervane(Pervane pervane) {
		this.pervane = pervane;
	}

	public Depo getDepo() {
		return depo;
	}

	public void setDepo(Depo depo) {
		this.depo = depo;
	}
}
