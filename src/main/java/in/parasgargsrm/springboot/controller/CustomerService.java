package in.parasgargsrm.springboot.controller;

import in.parasgargsrm.springboot.entity.Customer;
import in.parasgargsrm.springboot.repository.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private ICustomerRepo customerRepo;

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    public Customer createCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public Customer getCustomer(String mobileNo) {
        List<Customer> customer = customerRepo.findByMobileNo(mobileNo);
        if (!customer.isEmpty()) {
            return customer.get(0);
        }
        return null;
    }

    public Customer updateCustomer(String mobileNo, Customer newCustomerInfo) {
        Customer customer = getCustomer(mobileNo);
        customer.setName(newCustomerInfo.getName());
        customer.setAge(newCustomerInfo.getAge());
        customer.setOccupation(newCustomerInfo.getOccupation());
        customer.setdOB(newCustomerInfo.getdOB());
        customer.setMobileNo(newCustomerInfo.getMobileNo());
        customer.setAddress(newCustomerInfo.getAddress());
        return customerRepo.save(customer);
    }

    public Customer deleteCustomer(String mobileNo) {
        Customer customer = getCustomer(mobileNo);
        if (customer != null) {
            customerRepo.delete(customer);
        }
        return customer;
    }
}
