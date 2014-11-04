package ru.kpfu.ivmiit.ooaip.gui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import ru.kpfu.ivmiit.ooaip.parser.ExpressionParser;
import ru.kpfu.ivmiit.ooaip.parser.ParserException;

public class Calculator {
	ExpressionParser parser;

	public Calculator() {
		parser = new ExpressionParser();
	}

	public double calculate(String expression) throws ParserException {
		double result = 0;

		result = parser.evaluate(expression);

		return result;
	}

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		ExpressionParser myParser = new ExpressionParser();

		for (;;) {
			try {
				System.out.print("¬ведите выражение дл€ вычислени€\n-> ");
				String str = reader.readLine();
				if (str.equals("")) {
					break;
				}
				double result = myParser.evaluate(str);

				DecimalFormatSymbols s = new DecimalFormatSymbols();
				s.setDecimalSeparator('.');
				DecimalFormat f = new DecimalFormat("#,###.00", s);

				System.out.printf("%s = %s%n", str, f.format(result));

			} catch (ParserException e) {
				System.out.println(e);
			} catch (Exception e) {
				System.out.println(e);

			}
		}
	}
}
