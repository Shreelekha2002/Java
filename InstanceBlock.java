class InstanceBlock{
	{
		int a=10;
		System.out.println("Instance initialization block is called out");
		
	}
	public static void main(String args[]){
		System.out.println("Hello, viewers");
		InstanceBlock callInstanceInitializedBlock = new InstanceBlock();
	}
}