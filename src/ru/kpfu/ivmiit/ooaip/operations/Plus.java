package ru.kpfu.ivmiit.ooaip.operations;

public class Plus extends Operation {

	public Plus(double par1, double par2) {
		super(par1, par2);
		this.symbol = '+';
		// TODO Auto-generated constructor stub
	}

	@Override
	public double evualate() {
		// TODO Auto-generated method stub
		return par1 + par2;
	}
}
