package ru.kpfu.ivmiit.ooaip.parser;

public class ParserException extends Exception {
	private static final long serialVersionUID = 1L;
	private final String errStr; // �������� ������

	public ParserException(String errStr) {
		super();
		this.errStr = errStr;
	}

	@Override
	public String toString() {
		return this.errStr;
	}
}
