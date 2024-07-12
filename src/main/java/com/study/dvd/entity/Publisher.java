package com.study.dvd.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Publisher {
	private int publisherId;
	private String publisherName;
}
