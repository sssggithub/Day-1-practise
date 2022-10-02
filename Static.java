package day1;

public class Static {
static int x=6;
static int y=10;
static int z;
static void show() {
	 z=x+y;
	 System.out.println(+z);
}
static {
	x=z-y;
	System.out.println(+x);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
show();

	}

}
