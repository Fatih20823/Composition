package heli;

public class Motor {
  
	private int tork;
	private int beygirGucu;
	
	public Motor(int tork, int beygirGucu) {
		super();
		this.tork = tork;
		this.beygirGucu = beygirGucu;
	}

	public void motoruCalis() {
		System.out.println("Motor calismaya basladi...");
	}
	
	public void motoruKapat() {
		System.out.println("Motor durduruldu...");
	}

	public int getTork() {
		return tork;
	}

	public void setTork(int tork) {
		this.tork = tork;
	}

	public int getBeygirGucu() {
		return beygirGucu;
	}

	public void setBeygirGucu(int beygirGucu) {
		this.beygirGucu = beygirGucu;
	}
}
