package aug174;

public class Priv {
	public static void main (String [] args) {
		System.out.println("ok");
		for (int i=1;i<=4;i++) {
						
			for (int j=1;j<=i;j++) {
				System.out.print((j  +" "));
			}
			System.out.println(" ");
		}
		
		System.out.println("___________________________________________");

		for (int i = 1 ; i<=4; i++) {
			for (int k =3;k>=i;k--) {
				System.out.print("  ");}
			
					for (int j=1;j<=i;j++) {
					System.out.print(j +" ");
			}
			System.out.println("");
		}
		System.out.println("___________________________________________");

		for (int i=1;i>=5;i++) {
			
			for (int j=i;j>=i;j++) {
				System.out.print(j+"  ");
				}
		
		}	System.out.println("");
		
		
		
	}
}



