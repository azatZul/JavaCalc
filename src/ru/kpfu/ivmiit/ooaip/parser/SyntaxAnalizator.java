package ru.kpfu.ivmiit.ooaip.parser;

public class SyntaxAnalizator {

	/**
	 * ѕрограмма анализатор, обрабатывающий арифметические выражени€. ¬ыражение,
	 * которые будут обрабатыватьс€ данным анализатором состо€т из следующих
	 * элементов: 1. числа 2. операторы (+, -, *, /, ^(возведение в степень), %
	 * (остаток от делени€), = (присваивание значени€) 3. круглые скобки () 4.
	 * переменные Ќиже показано несколько примеров 1. 10 - 8 2. (100 - 5) * 14 /
	 * 6 3. a + b - c 4. 10 ^ 5 5. a = 10 - b ѕриоритеты операций, от высшего к
	 * низшему 1. +,- (унарные, к примеру a++, ++a) 2. ^ 3. *, /, % 4. +,- 5. =
	 * 
	 * ќграничени€: 1. ѕеременные могут быть выражены только отдельными буквами,
	 * (или только могут быть 26 переменных, от A до Z) 2. ѕеременные не
	 * чувствительны к регистру, т.е. A и a определ€ют одну и ту же переменную
	 * 3. ¬се числовые занчени€ должны быть числами двойной точности 4.
	 * ѕроизводитс€ проверка только на наличие элементарных ошибок.
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
	// System.out.print("¬ведите выражение дл€ вычислени€\n-> ");
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
