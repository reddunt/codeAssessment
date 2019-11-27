package com.retail.factory;

import com.retail.bean.UserBean;
import com.retail.config.ConstantConfig;
import com.retail.discount.Discount;
import com.retail.entity.Affiliate;
import com.retail.entity.Customer;
import com.retail.entity.Employee;

public class FactoryObjectBuilder {

	public Discount getFactoryObject(UserBean user) {
		if ("Employee".equalsIgnoreCase(user.getUserType()))
			return new Employee(user.getAmount(), ConstantConfig.getEmpDisc());
		else if ("Customer".equalsIgnoreCase(user.getUserType()))
			return new Customer(user.getAmount(), ConstantConfig.getCustDisc());
		else if ("Affiliate".equalsIgnoreCase(user.getUserType()))
			return new Affiliate(user.getAmount(), ConstantConfig.getAffDisc());
		else
			return null;
	}

}
