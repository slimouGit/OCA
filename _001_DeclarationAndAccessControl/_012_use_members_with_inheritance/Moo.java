class Moo extends Zoo {
	public void useAZoo(){	
		System.out.println("Inherit Zoo says: " + this.coolMethod());
		//the predicting line works, because Moo can inherit the public method
		
		

		Zoo z = new Zoo();
		System.out.println("A Zoo instance says: " + z.coolMethod());
		//the predicting line works, because Moo can access the public method
				
	}
}