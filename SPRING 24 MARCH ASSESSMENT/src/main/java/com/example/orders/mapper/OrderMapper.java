package com.example.orders.mapper;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;
import com.example.orders.entity.OrderEntity;

public class OrderMapper {

    public static OrderEntity toEntity(OrderRequestDTO dto) {
        OrderEntity e = new OrderEntity(dto.getCustName(),dto.getCustEmail(),dto.getProdName(),dto.getQty(),dto.getPricePerUnt(),dto.getQty()*dto.getPricePerUnt());
        return e;
    }

    public static OrderResponseDTO toResponseDTO(OrderEntity order) {
        OrderResponseDTO dto = new OrderResponseDTO();
        dto.setOrderId(order.getId());
        dto.setCustName(order.getCustomerName());
        dto.setCustEmail(order.getEmail());
        dto.setProdName(order.getProductName());
        dto.setQty(order.getQuantity());
        dto.setPricePerUnt(order.getPricePerUnit());
        dto.setTotalAmt(order.getTotalAmount());
        return dto;
    }
}
