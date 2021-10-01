package com.prysoft.pdv.service.impl;


import com.prysoft.pdv.models.Print;
import com.prysoft.pdv.service.PrintService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PrintServiceImp extends FilterService<Print> implements PrintService {



}
