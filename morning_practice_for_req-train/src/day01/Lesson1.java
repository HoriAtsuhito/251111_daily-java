/*問題
パッケージ名 day01
クラス名 Lesson1.java

"出力します"とコンソールに出力してください。
続けて12、 1.6、 "こんにちは"、 trueをそれぞれ変数に代入しコンソールに出力してください。
変数名は任意とします
また上記から変数を１つを選び、代入する値を1行コメントで記入しなさい。（コメント例 〇〇を代入する）

【出力例】
出力します
12
1.6
こんにちは
true
 * 
 */
package day01;

public class Lesson1 {

	public static void main(String[] args) {
		
		System.out.println("出力します");
		
		//number1に12を代入する
		int number1=12;
		System.out.println(number1);
		
		double number2=1.6;
		System.out.println(number2);
		
		String hello="こんにちは";
		System.out.println(hello);
		
		boolean question=true;
		System.out.println(question);
	}
}
