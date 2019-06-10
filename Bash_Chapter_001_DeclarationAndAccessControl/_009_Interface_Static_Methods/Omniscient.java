public interface Omniscient {
	//legal method
	static int omniscientNumber(){
		return 42;
	};
	
	/*
	- illegal final static
	final static int omniscientNumber(){
		return 42;
	};

	- illegal final static
	final static int omniscientNumber(){
		return 42;
	};

	- illegal no body
	static int omniscientNumber();
	*/
}