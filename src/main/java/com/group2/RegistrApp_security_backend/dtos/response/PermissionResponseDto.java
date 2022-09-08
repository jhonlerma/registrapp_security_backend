package com.group2.RegistrApp_security_backend.dtos.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PermissionResponseDto {
    private String url;
    private String method;
}
