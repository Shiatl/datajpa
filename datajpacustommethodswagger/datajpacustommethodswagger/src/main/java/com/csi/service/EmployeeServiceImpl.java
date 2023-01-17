package com.csi.service;

import com.csi.dao.EmployeeDaoImlp;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDaoImlp employeeDaoImlp;

    public Employee saveData(Employee employee){
        return employeeDaoImlp.saveData(employee);
    }

    public Optional<Employee> getDataById(long empId){
        return employeeDaoImlp.getDataById(empId);
    }

    public List<Employee> getDataByName(String empName){
        return employeeDaoImlp.getDataByName(empName);
    }

    public Employee getDataByContactNumber(long empContactNumber){
        return employeeDaoImlp.getDataByContactNumber(empContactNumber);
    }
    public List<Employee>getAllData(){
        return employeeDaoImlp.getAllData();
    }

    public Employee updateData(Employee employee){
        return employeeDaoImlp.updateData(employee);
    }
    public void deleteDataByID(long empId){
        employeeDaoImlp.deleteDataByID(empId);
    }
}
