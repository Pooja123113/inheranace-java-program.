//Encapsulation
class Employee
	{
		private int emp_id;
		private int salary;
		public void setEmp_id(int emp_id1)
		{
		emp_id=emp_id1;
		}
		public int getEmp_id()
		{
		return emp_id;
		}
		public void setSalary(int salary1)
		{
		salary=salary1;	
		}
		public int getSalary()
		{
		return salary;	
		}
	}
class company
	{
	 public static void main(String[]args)
		{
		Employee e=new Employee();
		e.setEmp_id(100);
		System.out.println("employee id "+e.getEmp_id());
		e.setSalary(20000);
		System.out.println("employee salary "+e.getSalary());
	}
}