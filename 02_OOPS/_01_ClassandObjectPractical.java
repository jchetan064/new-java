class Calculator{
    
    public int add(){
        System.out.println("Inner! Welcome Again"); 
        return 0;
    }

	public int add(int n1, int n2)
	{
		//int r=num1+num2;
		//return r;

		int r=n1+n2;
		return r;
	}
}

public class _01_ClassandObjectPractical
{
	public static void main(String[] args) 
	{
		int num1=4;
		int num2=5;


		Calculator calc= new Calculator();
		// calc.add();

		int result=calc.add(40,50);
		//int result=calc.add();
		int result2=num1+num2;
		System.out.println(result);
        System.out.println(result2);
		
	}
}

