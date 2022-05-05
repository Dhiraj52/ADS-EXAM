class TwoStack
{
	int arr[];
	int size;
	int top1,top2;
	
		 TwoStack(int num)
		{
			arr=new int[num];
			size=num;
			top1=-1;
			top2=size;
		}
		
		void push1(int a)
		{
			if(top1<top2 -1)
			{
				top1++;
				arr[top1]=a;
			}
			else
			{
				System.out.println("Stack Overflow");
				System.exit(1);
			}
		}
		
		void push2(int a)
		{
			if(top1<top2-1)
			{
				top2--;
				arr[top2]=a;
			}
		}
		
		int pop1()
		{
			if(top1>=0)
			{
				int a=arr[top1];
				top1--;
				return a;
			}
			else
			{
				System.out.println("Stack Underflow");
				System.exit(1);
			}
			return 0;
		}
		
		int pop2()
		{
			if(top2<size)
			{
				int a=arr[top2];
				top2++;
				return a;
			}
			else
			{
				System.out.println("Stack Underflow");
				System.exit(1);
			}
			return 0;
		}
		
		public static void main(String args[])
		{
			TwoStack st=new TwoStack(5);
			st.push1(5);
			st.push2(10);
			st.push2(15);
			st.push1(11);
			st.push2(7);
			
			System.out.println("Popped element from"+"Stack 1 is "+st.pop1());
			
			st.push2(40);
			System.out.println("Popped element from"+"Stack2 is "+st.pop2());
			
			
		}
}