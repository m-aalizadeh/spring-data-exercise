package com.maryam.aalizadeh.jpadatasample;

import com.maryam.aalizadeh.jpadatasample.employee.model.Address;
import com.maryam.aalizadeh.jpadatasample.employee.model.Department;
import com.maryam.aalizadeh.jpadatasample.employee.model.Employee;
import com.maryam.aalizadeh.jpadatasample.employee.repository.AddressRepository;
import com.maryam.aalizadeh.jpadatasample.employee.repository.DepartmentRepository;
import com.maryam.aalizadeh.jpadatasample.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class CompanyDataSeeder implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Department department1 = new Department("department1");
        Department department2 = new Department("department2");
        Department department3 = new Department("department3");
        Department department4 = new Department("department4");
        Department department5 = new Department("department4");

        Department persistedDepartment1 = departmentRepository.save(department1);
        Department persistedDepartment2 = departmentRepository.save(department2);
        Department persistedDepartment3 = departmentRepository.save(department3);
        Department persistedDepartment4 = departmentRepository.save(department4);
        Department persistedDepartment5 = departmentRepository.save(department5);

        Employee employee1 = new Employee("Steven","King", 7902.00);
        Address address1 = new Address("26192", "Southlake", "Jabberwocky Rd");
        Address persistedAddress1 = addressRepository.save(address1);
        employee1.setAddress(persistedAddress1);
        employee1.setDepartment(persistedDepartment1);

        Employee employee2 = new Employee("TONY","STARK", 7698.00);
        Address address2 = new Address("99536", "South San", "Interiors Blvd");
        Address persistedAddress2 = addressRepository.save(address2);
        employee2.setDepartment(persistedDepartment2);
        employee2.setAddress(persistedAddress2);

        Employee employee3 = new Employee("TIM", "ADOLF", 7839.00);
        Address address3 = new Address("98199", "Seattle", "Charade Rd");
        Address persistedAddress3 = addressRepository.save(address3);
        employee3.setAddress(persistedAddress3);
        employee3.setDepartment(persistedDepartment3);

        Employee employee4 = new Employee("KIM", "JARVIS", 7839.00);
        Address address4 = new Address("M5V 2L7","Toronto",  "Spadina Ave");
        Address persistedAddress4 = addressRepository.save(address4);
        employee4.setAddress(persistedAddress4);
        employee4.setDepartment(persistedDepartment4);

        Employee employee5 = new Employee("SAM", "MILES", 7566.00);
        Address address5 = new Address("74989","London",  "Arthur St");
        Address persistedAddress5 = addressRepository.save(address5);
        employee5.setAddress(persistedAddress5);
        employee5.setDepartment(persistedDepartment5);

        Employee employee6 = new Employee("KEVIN", "HILL", 7566.00);
        Address address6 = new Address("15865","Oxford",  "Magdalen Centre");
        Address persistedAddress6 = addressRepository.save(address6);
        employee6.setAddress(persistedAddress6);
        employee6.setDepartment(persistedDepartment1);

        Employee employee7 = new Employee("CONNIE","SMITH", 7698.00);
        Address address7 = new Address("78543","Munich",  "Schwanthalerstr");
        Address persistedAddress7 = addressRepository.save(address7);
        employee7.setAddress(persistedAddress7);
        employee7.setDepartment(persistedDepartment2);

        Employee employee8 = new Employee("ALFRED", "KINSLEY", 7788.00);
        Address address8 = new Address("74636","London",  "Arthur Str");
        Address persistedAddress8 = addressRepository.save(address8);
        employee8.setAddress(persistedAddress8);
        employee8.setDepartment(persistedDepartment3);

        Employee employee9 = new Employee("PAUL", "TIMOTHY", 7698.00);
        Address address9 = new Address("74989","Tehran",  "Jordan");
        Address persistedAddress9 = addressRepository.save(address9);
        employee9.setAddress(persistedAddress9);
        employee9.setDepartment(persistedDepartment4);

        Employee employee10 = new Employee("JOHN", "ASGHAR", 7566.00);
        Address address10 = new Address("13235","Tehran",  "Gandi");
        Address persistedAddress10 = addressRepository.save(address10);
        employee10.setAddress(persistedAddress10);
        employee10.setDepartment(persistedDepartment5);

        Employee employee11 = new Employee("ROSE", "SUMMERS", 7782.00);
        Address address11 = new Address("65366","Tehran",  "Argentine");
        Address persistedAddress11 = addressRepository.save(address11);
        employee11.setAddress(persistedAddress11);
        employee11.setDepartment(persistedDepartment1);

        Employee employee12 = new Employee("ANDREW", "FAULKNER", 7839.00);
        Address address12 = new Address("74989","Seattle",  "Bavaria");
        Address persistedAddress12 = addressRepository.save(address12);
        employee12.setAddress(persistedAddress12);
        employee12.setDepartment(persistedDepartment2);

        Employee employee13 = new Employee("KAREN", "MATTHEWS", 7839.00);
        Address address13 = new Address("79455","Toronto",  "Oshan Blvd");
        Address persistedAddress13 = addressRepository.save(address13);
        employee13.setAddress(persistedAddress13);
        employee13.setDepartment(persistedDepartment3);

        Employee employee14 = new Employee("WENDY", "SHAWN", 7698.00);
        Address address14 = new Address("99485","Southlake",  "George Str");
        Address persistedAddress14 = addressRepository.save(address14);
        employee14.setAddress(persistedAddress14);
        employee14.setDepartment(persistedDepartment4);

        employeeRepository.saveAll(List.of(employee1, employee2, employee3,
                employee4, employee5, employee6, employee7, employee8,
                employee9, employee10, employee12, employee13, employee14));


    }
}
