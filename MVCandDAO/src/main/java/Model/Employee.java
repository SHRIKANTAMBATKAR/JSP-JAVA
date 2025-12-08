package Model;

public class Employee {

    private int id;
    private String name;
    private String deg;
    private int age;
    private int salary;

    public Employee() {}

    public Employee(String name, String deg, int age, int salary) {
        this.name = name;
        this.deg = deg;
        this.age = age;
        this.salary = salary;
    }
    
    public int getId() { 
    	 return id; 
    	}
    
    public void setId(int id) {
    	 this.id = id; 
    	}

    public String getName() { 
    	 return name;
    }
    public void setName(String name) { 
    	  this.name = name; 
    	}

    public String getDeg() { 
    	  return deg; 
    	}
    
    public void setDeg(String deg) { 
    	  this.deg = deg; 
    	}

    public int getAge() { 
    	 return age; 
    	}
    
    public void setAge(int age) { 
    	 this.age = age;
    	}

    public int getSalary() { 
    	  return salary; 
    	}
    
    public void setSalary(int salary) { 
      	this.salary = salary; 
    }
}

