package com.hexaware.policymanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.policymanagement.entity.Policy;
@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> 
{

	public List<Policy> findByPolicyType(String policyType);
	
	public List<Policy> findByCompany(String company);
	
	public List<Policy> findByPremiumGreaterThan(double premium);
	
	public List<Policy> findByPremiumLessThan(double premium); 

}
