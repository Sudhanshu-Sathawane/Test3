package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.CustomerRepo;
import com.example.demo.model.CustomerInfo;

@RestController
public class CustomerController {
	@Autowired
	CustomerRepo repo;
	@PostMapping(path="/customer",consumes= {"application/json"})

	 public CustomerInfo addCust(@RequestBody CustomerInfo customer)

	 {

	 repo.save(customer);

	 return customer;

	 }
	@GetMapping(path="/customers")

	 public List<CustomerInfo> getCustomers()

	 {

	 return (List<CustomerInfo>) repo.findAll();

	 }
	@RequestMapping("/customer/{customerId}")

	 public Optional<CustomerInfo> getAlien(@PathVariable("customerId")int custId)

	 {

	 return repo.findById(custId);

	 }
	@DeleteMapping("/customer/{customerId}")

	 public String deleteCustomer(@PathVariable int customerid)

	 {

	 CustomerInfo ci = repo.getOne(customerid);

	 repo.delete(ci);

	 return "deleted";

	 }
	@PutMapping(path="/customer",consumes= {"application/json"})

	 public CustomerInfo saveOrUpdateAlien(@RequestBody CustomerInfo customer)

	 {

	 repo.save(customer);

	 return customer;

	 }

}
