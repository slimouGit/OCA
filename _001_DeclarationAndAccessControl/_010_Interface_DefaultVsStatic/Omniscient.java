public interface Omniscient {
	
	default int giveMeTheNumber(){
		return 42;
	};

	static int omniscientNumber(){
		return 42;
	};
}