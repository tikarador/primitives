package itMentorPrimitives;

public class Task0132 {

	/*
	 * Сумма цифр трехзначного числа Напиши код метода sumDigitsInNumber(int
	 * number). Метод на вход принимает целое трехзначное число. Нужно посчитать
	 * сумму цифр этого числа, и вернуть эту сумму.
	 * 
	 * Пример: Метод sumDigitsInNumber вызывается с параметром 546.
	 * 
	 * Пример вывода: 15
	 * 
	 * 
	 * Requirements: 1. Программа не должна считывать данные с клавиатуры. 2. Метод
	 * sumDigitsInNumber(int) должен быть публичным и статическим. 3. Метод
	 * sumDigitsInNumber должен возвращать значение типа int. 4. Метод
	 * sumDigitsInNumber не должен ничего выводить на экран. 5. Метод
	 * sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
	 */

	public void doit() {
		System.out.println(sumDigitsInNumber(546));
	}

	public static int sumDigitsInNumber(int number) {
		int res;
		int hundred;
		int ten;
		hundred = number / 100;
		ten = (number % (hundred * 100)) / 10;
		res = hundred + ten + number % (hundred * 100 + ten * 10);
		return res;
	}
}
