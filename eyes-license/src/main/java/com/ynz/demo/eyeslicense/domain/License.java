package com.ynz.demo.eyeslicense.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class License {
    private String id;
    private String productName;
    private String licenseType;
    private String organizationId;
}
