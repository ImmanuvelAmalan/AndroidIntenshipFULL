class TypeCastingDemo{
	public static void main(String args[]){
		int intNummber=120;														 // {
		float floatNumber=intNummber;                                           //      Wideining Casting
		System.out.println("Integer: "+intNummber+" Float: "+floatNumber);     //   }
		
		intNummber=(int)floatNumber; // Narrowing Casting
	
	}
}