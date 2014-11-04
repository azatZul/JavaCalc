package ru.kpfu.ivmiit.ooaip.operations;

public class Divide extends Operation {

	public Divide(double par1, double par2) {
		super(par1, par2);
		this.symbol = '/';

	}

	@Override
	public double evualate() {

		return par1 / par2;
	}

}
