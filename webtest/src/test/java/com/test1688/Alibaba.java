package com.test1688;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Accessors(chain = true)
public class Alibaba {
	private List<Alibaba2> alibaba2s;
}
