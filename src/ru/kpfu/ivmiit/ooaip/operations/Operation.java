package ru.kpfu.ivmiit.ooaip.operations;

public abstract class Operation {
	protected double par1;
	protected double par2;
	protected char symbol;

	public Operation(double par1, double par2) {
		this.setPar1(par1);
		this.setPar2(par2);
	}

	public abstract double evualate();

	public double getPar1() {
		return par1;
	}

	public void setPar1(double par1) {
		this.par1 = par1;
	}

	public double getPar2() {
		return par2;
	}

	public void setPar2(double par2) {
		this.par2 = par2;
	}
}
