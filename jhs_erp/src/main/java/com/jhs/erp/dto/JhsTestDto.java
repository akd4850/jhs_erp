package com.jhs.erp.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
@ToString
public class JhsTestDto {
	
	private String username;
	private String description;
	private boolean done;
}