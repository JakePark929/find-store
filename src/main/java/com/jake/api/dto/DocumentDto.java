package com.jake.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DocumentDto {
    @JsonProperty("address_name")
    private String addressName; // 전체지역명칭
    @JsonProperty("y")
    private double latitude; // 위도 y
    @JsonProperty("x")
    private double longitude; // 경도 x
}
