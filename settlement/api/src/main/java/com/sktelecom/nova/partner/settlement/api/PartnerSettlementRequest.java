package com.sktelecom.nova.partner.settlement.api;

import java.util.UUID;

public record PartnerSettlementRequest(UUID partnerId, double revenue) {
}