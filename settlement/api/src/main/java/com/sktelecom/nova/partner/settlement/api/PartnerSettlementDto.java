package com.sktelecom.nova.partner.settlement.api;

import java.util.UUID;


public record PartnerSettlementDto(UUID id, UUID partnerId, double revenue) {
}
