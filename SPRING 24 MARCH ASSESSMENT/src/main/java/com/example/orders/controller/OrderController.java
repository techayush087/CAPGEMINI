package com.example.orders.controller;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.service.OrderService;
import com.example.orders.service.OrderServiceImpl;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
	
	@Autowired
    private OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<OrderResponseDTO> create(@Valid @RequestBody OrderRequestDTO request) {

        OrderEntity saved = service.createOrder(request);

        OrderResponseDTO response = OrderMapper.toResponseDTO(saved);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponseDTO> getById(@PathVariable Long id) {

        OrderEntity order = service.getOrderById(id);

        OrderResponseDTO response = OrderMapper.toResponseDTO(order);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {

        service.deleteOrder(id);

        return new ResponseEntity<>("Order deleted successfully", HttpStatus.OK);
    }
}