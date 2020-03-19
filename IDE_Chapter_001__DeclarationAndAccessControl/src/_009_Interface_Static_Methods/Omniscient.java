package _009_Interface_Static_Methods;

public interface Omniscient {
    //legal method
    static int omniscientNumber(){
        return 42;
    };

    int omniscientNumber_2();

    default int omniscientNumber_3(){
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
