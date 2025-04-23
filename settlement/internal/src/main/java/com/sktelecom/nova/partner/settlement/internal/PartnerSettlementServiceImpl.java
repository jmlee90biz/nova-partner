package com.sktelecom.nova.partner.settlement.internal;

import com.sktelecom.nova.partner.settlement.api.PartnerSettlementService;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
class PartnerSettlementServiceImpl implements PartnerSettlementService {
    private final PartnerSettlementRepository partnerSettlementRepository;
    private final ApplicationEventPublisher eventPublisher;

    @Override
    public void settlePartnerRevenue(UUID partnerId, double revenue) {

    }
//
//    @Override
//    @Transactional
//    public PartnerDto registerPartner(PartnerRegistrationRequest partnerRegistrationRequest) {
//        PartnerSettlement registeredPartner = partnerSettlementRepository.save(
//                PartnerSettlement.createPartner(partnerRegistrationRequest.name(), partnerRegistrationRequest.email())
//        );
//
//        eventPublisher.publish(registeredPartner.createPartnerRegistereddEvent());
//
//        return PartnerMapper.toPartnerDto(registeredPartner);
//    }
//
//    @Override
//    public PartnerDto getPartnerById(UUID partnerId) {
//        return partnerRepository.findById(partnerId).map(PartnerMapper::toPartnerDto)
//                .orElseThrow(()->new RuntimeException("Partner not found"));
//    }
//
//    @Override
//    public List<PartnerDto> findAllPartners() {
//        return partnerRepository.findAll().stream().map(PartnerMapper::toPartnerDto).toList();
//    }
}
