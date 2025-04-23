@ApplicationModule(
        displayName = "partner-settlement-internal",
        allowedDependencies = {
                "partner.settlement.api",
                "partner.settlement.event",
                "partner.management.api",
                "billing.payment.event"
        }
)
package com.sktelecom.nova.partner.settlement.internal;

import org.springframework.modulith.ApplicationModule;

