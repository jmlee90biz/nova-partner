package com.sktelecom.nova.product.management.internal;

import java.util.UUID;

record PartnerRegisteredEvent(UUID id, String name, String description) {
}
