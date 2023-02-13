package in.parasgargsrm.springboot.repository;

import in.parasgargsrm.springboot.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepo extends MongoRepository<Customer, String> {
    List<Customer> findByMobileNo(String mobileNo);
}