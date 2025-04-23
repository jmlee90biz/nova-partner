package com.sktelecom.nova.partner.management.internal;

import com.sktelecom.nova.partner.management.api.PartnerDto;

class PartnerMapper {
    static PartnerDto toPartnerDto(Partner partner) {
        return new PartnerDto(partner.getId(), partner.getName(), partner.getEmail());
    }
}
