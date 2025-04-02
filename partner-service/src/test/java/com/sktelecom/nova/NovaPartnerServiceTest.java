package com.sktelecom.nova;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.test.ApplicationModuleTest;

@ApplicationModuleTest(ApplicationModuleTest.BootstrapMode.ALL_DEPENDENCIES)
public class NovaPartnerServiceTest {
    @Test
    void contextLoads() {
        ApplicationModules modules = ApplicationModules.of(NovaPartnerService.class);

        modules.forEach(System.out::println);

        //modules.verify();
    }
}
