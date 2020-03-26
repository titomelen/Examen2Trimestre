public class funcion1 {
	public static void main(String[] args) {
		System.out.println(funcion1(40));
	}

		static int x = 5;

		public static boolean funcion1 (int n){
			int x = 5;
			boolean resp;
			if(n % x == 0) {
				resp= true;
			}else {
				resp=false;
			}
			return resp;
		};
}
public class funcion2 {

  public static void main(String[] args) {

    System.out.println(Funcion2(153));
  }

  public static Boolean funcion2(int num) {

    Boolean resp = null;

    int y = 200 - 50;
    int x = 200 + 50;

    if (num <= x && num >= y) {

      resp = true;

    } else {
      resp = false;
    }

    return resp;

  }
}
