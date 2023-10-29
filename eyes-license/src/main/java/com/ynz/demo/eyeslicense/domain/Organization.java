package com.ynz.demo.eyeslicense.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Organization {
    String id;
    String name;
    String contactName;
    String contactEmail;
    String contactPhone;
}
