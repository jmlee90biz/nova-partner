package com.sktelecom.nova.partner.settlement.internal;

import com.sktelecom.nova.billing.payment.event.PaymentCompletedEvent;
import com.sktelecom.nova.partner.settlement.event.PartnerSettlementCompletedEvent;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PartnerSettlementEventListener {
    //private final SubscriptionService subscriptionService;
    private final ApplicationEventPublisher eventPublisher;

    @Async("taskExecutor")
    @ApplicationModuleListener
    void onPaymentCompleted(final PaymentCompletedEvent paymentCompletedEvent) {
//        SubscriptionCustomerProductPricingPlanDto subscriptionCustomerProductPricingPlanDto =
//                subscriptionService.findSubscriptionCustomerProductPricingPlanById(subscriptionActivatedEvent.id());
//
//        eventPublisher.publish(
//                NotificationRequestedEvent.create(
//                        subscriptionCustomerProductPricingPlanDto.customerEmail(),
//                        "Subscription Activated",
//                        subscriptionCustomerProductPricingPlanDto.productName() + " " +
//                                subscriptionCustomerProductPricingPlanDto.pricingPlanName()
//                )
//        );
    }


    @Async("taskExecutor")
    @ApplicationModuleListener
    void onPaymentCompleted(final PartnerSettlementCompletedEvent partnerSettlementCompletedEvent) {
//        SubscriptionCustomerProductPricingPlanDto subscriptionCustomerProductPricingPlanDto =
//                subscriptionService.findSubscriptionCustomerProductPricingPlanById(subscriptionActivatedEvent.id());
//
//        eventPublisher.publishEvent(
//                NotificationRequestedEvent.create(
//                        "",
//                        "Subscription Activated",
//                        ""
//                )
//        );
    }

}
