package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.AttributeFilter;
import com.prysoft.pdv.models.Attribute;
import com.prysoft.pdv.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/impresoras")
public class PrintController {
    @Autowired
    private PrintService service;



}
