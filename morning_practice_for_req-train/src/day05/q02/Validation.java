package day05.q02;

public class Validation {

	public boolean checkId(int id2) {
		if (id2 == 1111 || id2 == 2222) {
			System.out.println("ログインに成功しました");
	
			boolean answer =true;
			return answer;
			
		} else {
			System.out.println("ログインできません");
			System.out.println("もう一度入力してください");
			
			boolean answer =false;
			return answer;
		}

	}
}
