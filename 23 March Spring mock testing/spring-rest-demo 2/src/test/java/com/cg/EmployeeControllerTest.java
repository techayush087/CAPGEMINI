package com.cg;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.cg.controller.EmployeeController;
import com.cg.dto.EmployeeDTO;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

@WebMvcTest(EmployeeController.class)
class EmployeeControllerTest {

    @MockitoBean
    private IEmployeeService service;
    
    @Autowired
    private MockMvc mockMvc;

 
    @Test
    void testGetAllEmployees() throws Exception {
        
      EmployeeDTO e1=  new EmployeeDTO("Ayush",LocalDate.of(2003,10,10), 50000.0);
      EmployeeDTO e2=  new EmployeeDTO("Amit",LocalDate.of(2004,11,20) ,70000.0);
      List<EmployeeDTO> list = List.of(e1,e2);

      when(service.getAllEmployee()).thenReturn(list);

      mockMvc.perform(get("/api/employee")).andExpect(status().isOk())
        		.andExpect(jsonPath("$.fullName").value("Ayush"));
    }

}