package com.sktelecom.nova.partner.management.internal;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface PartnerRepository extends JpaRepository<Partner, UUID> {
}
