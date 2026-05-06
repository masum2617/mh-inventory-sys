package com.mh.message.dto;

public record LowStockMessageDto(Long itemId, int currentQty, Long id, String itemName) {
}
