package ru.kpfu.ivmiit.ooaip.parser;

public class SyntaxAnalizator {

	/**
	 * ��������� ����������, �������������� �������������� ���������. ���������,
	 * ������� ����� �������������� ������ ������������ ������� �� ���������
	 * ���������: 1. ����� 2. ��������� (+, -, *, /, ^(���������� � �������), %
	 * (������� �� �������), = (������������ ��������) 3. ������� ������ () 4.
	 * ���������� ���� �������� ��������� �������� 1. 10 - 8 2. (100 - 5) * 14 /
	 * 6 3. a + b - c 4. 10 ^ 5 5. a = 10 - b ���������� ��������, �� ������� �
	 * ������� 1. +,- (�������, � ������� a++, ++a) 2. ^ 3. *, /, % 4. +,- 5. =
	 * 
	 * �����������: 1. ���������� ����� ���� �������� ������ ���������� �������,
	 * (��� ������ ����� ���� 26 ����������, �� A �� Z) 2. ���������� ��
	 * ������������� � ��������, �.�. A � a ���������� ���� � �� �� ����������
	 * 3. ��� �������� �������� ������ ���� ������� ������� �������� 4.
	 * ������������ �������� ������ �� ������� ������������ ������.
	 * 
	 * @throws ParserException
	 * 
	 * 
	 * 
	 * 
	 */
	// public static void main(String[] args) throws ParserException {
	// BufferedReader reader = new BufferedReader(new InputStreamReader(
	// System.in));
	// ExpressionParser myParser = new ExpressionParser();
	//
	// for (;;) {
	// try {
	// System.out.print("������� ��������� ��� ����������\n-> ");
	// String str = reader.readLine();
	// if (str.equals("")) {
	// break;
	// }
	// double result = myParser.evaluate(str);
	//
	// DecimalFormatSymbols s = new DecimalFormatSymbols();
	// s.setDecimalSeparator('.');
	// DecimalFormat f = new DecimalFormat("#,###.00", s);
	//
	// System.out.printf("%s = %s%n", str, f.format(result));
	//
	// } catch (ParserException e) {
	// System.out.println(e);
	// } catch (Exception e) {
	// System.out.println(e);
	// }
	// }
	// }
	public double calculate(String expression) throws ParserException {

		ExpressionParser myParser = new ExpressionParser();

		try {

			if (expression.equals("")) {
				return 0;
			}
			return myParser.evaluate(expression);

		} catch (ParserException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

		return 0;
	}

}
