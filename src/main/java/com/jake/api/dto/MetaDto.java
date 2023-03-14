package com.jake.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MetaDto {
    @JsonProperty("total_count") // json 으로 받은 응답값을 Java 필드와 맵핑
    private Integer totalCount; // 검색된 문서 수
}
