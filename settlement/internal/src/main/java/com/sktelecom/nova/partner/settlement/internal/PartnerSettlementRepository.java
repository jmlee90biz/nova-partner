package com.sktelecom.nova.partner.settlement.internal;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface PartnerSettlementRepository extends JpaRepository<PartnerSettlement, UUID> {
}
