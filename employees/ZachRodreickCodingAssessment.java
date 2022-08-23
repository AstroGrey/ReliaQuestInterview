/* This file will use 


import java.io.Image_Entity
import java.io.Employee_Entity
import java.io.Employee
*/

class Employee_Repository{

    var databaseConnection = connection.dataBase.Employee_Entity_Table;

    Employee_Entity[] getAllEmployees(){
        /* 
            output - list of employees
            description - this should return all employees
        */

        console.log("Employee-Repository getAllEmployees func");
        // Create variable for database response 
        Employee_Entity [] employees;
        employees = databasaeConnection.find();

        // Error check response object, return based on object status
        if(employees != null){ // checks if response is full
            System.out.println("Employees found: ", employees); 
            return employees;
        }
        else(
            System.out.println("No employees found")
            return null;
        )
    }

    Employee_Entity[] getEmployeesByNameSearch(string name){
            /*
                output - list of employees
                description - this should return all employees whose name contains or matches the string input provided
            */

        console.log("Employee-Repository getEmployeesByNameSearch func");
        // Create variable for db response 
        Employee_Entity [] employees;

        // Assuming we can use a SQL query or repository package
        // look for name matched
            employees = databasaeConnection.find({
                where: { employee_name: name}
            });
        

        // if not, employee_name is sub-optimal entry for handleing searching large data set
            Employee_Entity [] employees_with_name;
            employees = databasaeConnection.find(); // get all employees
            // Assuming we have access to employee 
            for (int i = employeeSize)
                if(Arrays.asList(employees.employee_name.split(" ")).contains(name)){
                // 
            }
            // Error check response object

        // return based on object status 
        if(employees != null){
            System.out.println("Employees with name");
            System.out.println( " , found: ");
            System.out.println(employees);
            return employee;
        }
        else{
            System.out.print("No employees found with name: ");
            System.out.print(name);
            return null;
        }
    }

    Employee_Entity getEmployeeById(string id){
        /*
            output - employee
            description - this should return a single employee
        */
        System.out.println("Employee-Repository getEmployeeById func");

        // Create variable for db response 
        // Option 1: Assuming we can use a SQL query or repository package
        Employee_Entity employee;
        employee = databasaeConnection.findOne({(
            where: { id : id }
        )});
        
        // Option 2: If not, assuming the db uses traditional id assigning and arranging
        Employee_Entity [] all_employees;
        all_employees = this.getAllEmployees();
        employee = all_employees[id-1]; 
        
        // Return employee
        if(employee !- null){
            System.out.print("Employee of id: ");
            System.out.println(id);
            System.out.print(employee);
            return employee;
        }
        else{
            return null;
        }

    }

    int getHighestSalaryOfEmployees(){
        /*
            output - integer of the highest salary
            description -  this should return a single integer indicating the highest salary of all employees
        */
    }

    string[] getTopTenHighestEarningEmployeeNames(){
        /*
            output - list of employees
            description -  this should return a list of the top 10 employees based off of their salaries
        */
    }

    Employee_Entity createEmployee(Employee_Entity new_employee){
        /*
            output - string of the status (i.e. success)
            description -  this should return a status of success or failed based on if an employee was created
         */
        
        System.out.println("Employee-Repository createEmployee func");

        // Assuming HTTP request object is equivalent to database entity
        Employee_Entity new_employee;
        saved_employee = databasaeConnection.save(new_employee);

        if(saved_employee != null){
            System.out.println("Successfully saved employee");
            System.out.println(saved_employee);
            return saved_employee;
        }
        else{
            System.out.println("EMployee creation unsuccessful");
            return null;
        }
    }

    string deleteEmployeeById(string id){
       /*
           output - the name of the employee that was deleted
            description - this should delete the employee with specified id given
        */ 

            System.out.println("Employee-Repository deleteEmployeeById func");
    
            // Create variable for db response 
            databasaeConnection.delete({(
                where id : id
            )});
            Employee_Entity employee;
            employee = this.getEmployeeById(id);
            if(employee == null){
                System.out.println("employee deleted");
                return "Employee deleted successfully"
            }
            // Return employee
            return employee;
    }
}
