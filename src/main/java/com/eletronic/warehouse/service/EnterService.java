package com.eletronic.warehouse.service;

import com.eletronic.warehouse.dao.EnterRepository;
import com.eletronic.warehouse.pojo.Enter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterService {
    @Autowired
    private EnterRepository enterRepository;


}
