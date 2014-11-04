package ru.kpfu.ivmiit.ooaip.operations;

public class Substract extends Operation {
	public Substract(double par1, double par2) {
		super(par1, par2);
		this.symbol = '-';

	}

	@Override
	public double evualate() {

		return par1 - par2;
	}
}
