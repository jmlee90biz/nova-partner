package com.sktelecom.nova.partner.settlement.api;

import java.util.UUID;

public interface PartnerSettlementService {
    void settlePartnerRevenue(UUID partnerId, double revenue);
}
