package com.dubbo.service.impl;

import com.dubbo.service.IProviderService;

public class ProviderServiceImpl implements IProviderService {

    @Override
    public String getString() {

        return "Hello Dubbo !!";
    }
}
