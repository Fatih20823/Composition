package com.main;
import heli.*;

public class Application {

	public static void main(String[] args) {
		
		Motor myMotor = new Motor(700,1000);
		Pervane myPervane = new Pervane(10,2000);
		Depo myDepo = new Depo(200);
		Helıkopter sikorsky = new Helıkopter(178, myMotor, myPervane, myDepo);
		sikorsky.getMotor().motoruCalis();
		sikorsky.getMotor().motoruKapat();
		
		Motor heliMotor = new Motor(700,1000);
		Pervane heliPervane = new Pervane(10,2000);
		Depo heliDepo = new Depo(200);
		Helıkopter bell = new Helıkopter(179, heliMotor, heliPervane, heliDepo);
		bell.getMotor().motoruCalis();
		bell.getMotor().motoruKapat();
		

	}

}
