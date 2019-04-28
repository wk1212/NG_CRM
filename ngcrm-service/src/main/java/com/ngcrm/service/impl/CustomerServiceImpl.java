package com.ngcrm.service.impl;

import com.ngcrm.mapper.TCustomerMapper;
import com.ngcrm.model.TCustomer;
import com.ngcrm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    TCustomerMapper customerMapper;

    @Override
    public boolean addCustomer(TCustomer customer) {
        int i = customerMapper.insert(customer);
        return true;
    }
}
