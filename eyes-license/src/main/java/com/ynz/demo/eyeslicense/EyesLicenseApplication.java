package com.ynz.demo.eyeslicense;

import com.ynz.demo.eyeslicense.domain.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("v1/organizations/{organizationId}/licenses")
public class EyesLicenseApplication {

    public static void main(String[] args) {
        SpringApplication.run(EyesLicenseApplication.class, args);
    }

    @GetMapping("{licenseId}")
    public License getLicenses(@PathVariable("organizationId") String organizationId, @PathVariable("licenseId") String licenseId) {
        return License.builder().id(licenseId).productName("Teleco").licenseType("Seat").organizationId(organizationId).build();
    }

}
