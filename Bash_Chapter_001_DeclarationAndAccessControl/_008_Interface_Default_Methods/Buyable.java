public interface Buyable {
	//Variables in interface allways
	//public static final
	double PRICE = 42000.00;
	
	default double printPrice(){
		return PRICE;
	};
	
}