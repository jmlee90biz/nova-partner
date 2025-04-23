package com.sktelecom.nova.partner.management.internal;

import java.util.UUID;

record PartnerRegisteredEvent(UUID id, String name, String description) {
}
