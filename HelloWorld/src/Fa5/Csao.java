package Fa5;

public class Csao extends TomorHenger {
	private double belsosugar;
	//TomorHenger inverzHenger;

	public Csao(double sugar, double magassag, double suruseg, double belsosugar) {
		super(sugar, magassag, suruseg);
		this.belsosugar = belsosugar;
		//inverzHenger = new TomorHenger(belsosugar, magassag, getSuruseg());
		

	}
	public double getTomeg() {

		//return super.getTomeg()-inverzHenger.getTomeg();
		return super.getTomeg()-(new TomorHenger(belsosugar, getMagassag(), getSuruseg()).getTomeg());
	}
//	@Override
//	public double getSugar() {
//		// TODO Auto-generated method stub
//		return super.getSugar();
//	}
//	@Override
//	public double getMagassag() {
//		// TODO Auto-generated method stub
//		return super.getMagassag();
//	}
	@Override
	public double getTerfogat() {
		return super.getTerfogat()-(new TomorHenger(belsosugar, getMagassag(), getSuruseg()).getTerfogat());
	}
	@Override
	public double getFelszin() {
		return super.getFelszin()+(new Henger(belsosugar, getMagassag()).getFelszin())-4*belsosugar*belsosugar*Math.PI;
	}
}
